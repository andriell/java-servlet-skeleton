package com.andriell.servlet.skeleton.repository;

import com.andriell.servlet.skeleton.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepositroy extends JpaRepository<BankAccount, Long>{
}