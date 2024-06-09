package com.uis.sisgan.controller;

import com.uis.sisgan.persistence.entity.*;
import com.uis.sisgan.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/sign-up")
public class UserController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<UserRegistrationRequest> registerUser(@RequestBody UserRegistrationRequest request) {
        Object response = registrationService.registerUser(request);
        return ResponseEntity.ok((UserRegistrationRequest) response);
    }



}
