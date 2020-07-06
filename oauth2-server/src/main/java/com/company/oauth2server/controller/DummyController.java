package com.company.oauth2server.controller;


import com.company.oauth2server.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController()
public class DummyController {


    private final UserDetailRepository repository;

    @Autowired
    public DummyController(UserDetailRepository repository) {
        this.repository = repository;
    }



    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return String.valueOf(repository.count());
    }
}
