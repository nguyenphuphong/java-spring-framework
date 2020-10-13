package vn.kase.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.kase.spring.model.SampleRequest;
import vn.kase.spring.model.SampleResponse;
import vn.kase.spring.service.SampleService;

@RestController
@RequestMapping("/")
public class SampleController {
    @Autowired
    private SampleService service;

    @PostMapping("/greeting")
    public SampleResponse greeting(@RequestBody SampleRequest request) {
        return SampleResponse.builder().message(service.getGreetingMessage(request.getName())).build();
    }
}
