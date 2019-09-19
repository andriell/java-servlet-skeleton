package com.andriell.test.servlet.skeleton.util;

import com.andriell.servlet.skeleton.entity.Bank;

public class BankUtil {

    public static Bank createBank() {
        Bank bank = new Bank();
        bank.setName("Gold Bank");

        return bank;
    }

}
