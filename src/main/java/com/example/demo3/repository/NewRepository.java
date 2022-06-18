package com.example.demo3.repository;

import com.example.demo3.model.New;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<New, Long> {
}
