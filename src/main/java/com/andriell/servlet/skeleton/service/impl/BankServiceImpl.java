package com.andriell.servlet.skeleton.service.impl;

import com.andriell.servlet.skeleton.entity.Bank;
import com.andriell.servlet.skeleton.repository.BankRepository;
import com.andriell.servlet.skeleton.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired // аннотация которая позволит Spring инициализировать наш сервис;
    private BankRepository bankRepository;

    @Override
    public Bank addBank(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);
    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}