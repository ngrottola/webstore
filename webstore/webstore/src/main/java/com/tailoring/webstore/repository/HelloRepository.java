package com.tailoring.webstore.repository;

import com.tailoring.webstore.model.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Long> {
}
