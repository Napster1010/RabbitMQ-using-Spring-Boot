package com.rabbit.controller;

import com.rabbit.bean.Employee;
import com.rabbit.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messaging")
public class MainController {
    @Autowired
    private MessageSender messageSenderService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newMessage(@RequestBody String message){
        messageSenderService.sendMessage(message);
        return "Message sent successfully!!";
    }
}
