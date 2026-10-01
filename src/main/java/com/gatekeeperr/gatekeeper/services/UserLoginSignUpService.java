package com.gatekeeperr.gatekeeper.services;

import com.gatekeeperr.gatekeeper.dto.UserDto;
import com.gatekeeperr.gatekeeper.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginSignUpService {

    @Autowired
    private UserRepo userRepo;

    public void signup(UserDto userDto)
    {
        userRepo.save(userDto);
    }

}
