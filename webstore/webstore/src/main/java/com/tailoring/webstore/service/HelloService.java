package com.tailoring.webstore.service;

import com.tailoring.webstore.model.dto.HelloDTO;

import java.util.List;

public interface HelloService {

    List<String> helloWorld();

    void createHello(HelloDTO helloDTO);
}
