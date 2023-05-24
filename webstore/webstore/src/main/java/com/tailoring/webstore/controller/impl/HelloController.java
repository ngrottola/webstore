package com.tailoring.webstore.controller.impl;

import com.tailoring.webstore.controller.HelloAPI;
import com.tailoring.webstore.model.dto.HelloDTO;
import com.tailoring.webstore.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloController implements HelloAPI {

    private final HelloService helloService;

    @Override
    public ResponseEntity<List<String>> helloWorld() {
        return new ResponseEntity<>(helloService.helloWorld(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> createHello(HelloDTO helloDTO) {
        helloService.createHello(helloDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
