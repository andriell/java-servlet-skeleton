package com.andriell.servlet.skeleton.repository;

import com.andriell.servlet.skeleton.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    // Типизированная магия. Jpa может преобразовывать методы именованные в соответствии с соглащением об именовании
    // методов непосредственно в методы класса репозитория выполняющие необходимые sql запросы и выполняющие
    // соответствующие преобразования в соответствующие сущьности
    List<Worker> findByFirstName(String firstName);
    List<Worker> findByLastName(String lastName);
    List<Worker> findByFirstNameAndLastName(String firstName, String lastName);
}