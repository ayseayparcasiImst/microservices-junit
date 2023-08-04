package com.imst.event.map.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imst.event.map.test.model.Result;
import com.imst.event.map.test.service.AddService;

@RestController
@RequestMapping("add")
public class AddController {

    @Autowired
    private AddService addService;

    @GetMapping
    public Result add(@RequestParam int a, @RequestParam int b) {
        return addService.add(a, b);
    }
}
