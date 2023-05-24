package com.tailoring.webstore.service.impl;

import com.tailoring.webstore.model.dto.HelloDTO;
import com.tailoring.webstore.model.entity.Hello;
import com.tailoring.webstore.repository.HelloRepository;
import com.tailoring.webstore.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;
    @Override
    public List<String> helloWorld() {
        return helloRepository.findAll().stream()
                .map(Hello::getHello)
                .collect(Collectors.toList());
    }

    @Override
    public void createHello(HelloDTO helloDTO) {
        Hello hello= new Hello();
        hello.setHello(helloDTO.getHello());
        helloRepository.save(hello);
    }
}
