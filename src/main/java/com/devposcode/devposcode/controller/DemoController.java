package com.devposcode.devposcode.controller;

import com.devposcode.devposcode.helper.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Autowired
    MessageUtils messageUtils;

    @GetMapping("/api1")
    public String readData(){
      return   messageUtils.message();
    }

    @GetMapping("/api2")
    public String readMessage(){
        return   "new api 1";
    }

    @GetMapping("/api3")
    public String readThird(){
        return   "new api 3";
    }
}
