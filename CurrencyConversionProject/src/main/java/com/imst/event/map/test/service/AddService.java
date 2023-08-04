package com.imst.event.map.test.service;

import org.springframework.stereotype.Service;

import com.imst.event.map.test.model.Result;

@Service
public class AddService {
    public Result add(int a, int b) {
        int sum = a + b;
        System.out.println("*****************************************************************************************************************");
        return new Result(sum);
    }
}