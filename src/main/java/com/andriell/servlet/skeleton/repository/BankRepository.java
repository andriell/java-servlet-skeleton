package com.andriell.servlet.skeleton.repository;

import com.andriell.servlet.skeleton.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankRepository extends JpaRepository<Bank, Long> {
    @Query("select b from Bank b where b.name = :name")
    Bank findByName(@Param("name") String name);
}