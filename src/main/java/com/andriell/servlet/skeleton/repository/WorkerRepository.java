package com.andriell.servlet.skeleton.repository;

import com.andriell.servlet.skeleton.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}