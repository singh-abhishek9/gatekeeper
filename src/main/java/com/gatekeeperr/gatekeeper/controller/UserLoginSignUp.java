package com.gatekeeperr.gatekeeper.controller;

import com.gatekeeperr.gatekeeper.dto.UserDto;
import com.gatekeeperr.gatekeeper.services.UserLoginSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class UserLoginSignUp {

    @Autowired
    private  UserLoginSignUpService userLoginSignUpService;

    @PostMapping("/signup")
    public void signup(@RequestBody UserDto userDto)
    {
        userLoginSignUpService.signup(userDto);
    }

}
