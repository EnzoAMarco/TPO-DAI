package com.mobile_dev.tpo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("url para todos los endpoints de este controller")
public class ControllerEjemplo {


    @GetMapping("url para el endpoint")
    public ResponseEntity<String> ejemplo(String txt) {
        return ResponseEntity.ok(txt);
    }

}
