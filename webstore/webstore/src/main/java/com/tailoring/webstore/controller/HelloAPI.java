package com.tailoring.webstore.controller;

import com.tailoring.webstore.model.dto.HelloDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface HelloAPI {

    @GetMapping
    ResponseEntity<List<String>> helloWorld();

    @PostMapping
    ResponseEntity<HttpStatus> createHello(@RequestBody HelloDTO helloDTO);
}
