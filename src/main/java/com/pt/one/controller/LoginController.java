package com.pt.one.controller;

import com.pt.one.dto.LoginDTO;
import com.pt.one.dto.LoginResDTO;
import com.pt.one.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    MemberService memberService;

    @PostMapping("/login")
    public LoginResDTO login(@RequestBody LoginDTO loginDTO){
        LoginResDTO loginResDTO = memberService.login(loginDTO);
        return loginResDTO;
    }

}
