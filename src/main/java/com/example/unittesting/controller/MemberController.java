package com.example.unittesting.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.unittesting.Servise.MemberServise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MemberController {

@Autowired
private MemberServise MemberServise;


@GetMapping("/member")
public ResponseEntity<?> getAllMember(){
    return ResponseEntity.ok(this.MemberServise.getAll());
}
    

}
