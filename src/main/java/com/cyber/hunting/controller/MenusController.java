package com.cyber.hunting.controller;

import com.cyber.hunting.common.ResponseMessage;
import com.cyber.hunting.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class MenusController {
    @Autowired
    MenusService menusService;

    @GetMapping(value = "menus")
    public ResponseMessage login(){
        return ResponseMessage.success(menusService.listMenus());
    }
}
