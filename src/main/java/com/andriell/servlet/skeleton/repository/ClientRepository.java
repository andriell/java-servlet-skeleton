package com.andriell.servlet.skeleton.repository;

import com.andriell.servlet.skeleton.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}