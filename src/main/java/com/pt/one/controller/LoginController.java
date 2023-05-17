package com.pt.one.controller;

import com.pt.one.dto.MemberDTO;
import com.pt.one.entity.MemberEntity;
import com.pt.one.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    JoinService joinService;

    @PostMapping("/join")
    public String join(@RequestBody MemberDTO memberDTO){
        joinService.join(memberDTO);
        System.out.println(memberDTO);
        return "회원가입 성공";
    }




}
