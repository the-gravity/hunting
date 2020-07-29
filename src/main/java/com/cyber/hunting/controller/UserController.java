package com.cyber.hunting.controller;

import com.cyber.hunting.common.ResponseMessage;
import com.cyber.hunting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "login")
    public ResponseMessage login(@RequestBody Map<String,Object> body){
        String name = (String) body.get("name");
        String password = (String) body.get("password");
        return ResponseMessage.success(userService.signIn(name,password));
    }
}
