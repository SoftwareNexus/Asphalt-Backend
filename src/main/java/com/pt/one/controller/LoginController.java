package com.pt.one.controller;

import com.pt.one.dto.LoginDTO;
import com.pt.one.dto.LoginResDTO;
import com.pt.one.dto.MemberDTO;
import com.pt.one.service.JoinService;
import com.pt.one.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    MemberService memberService;

    @Operation(summary = "로그인 요청", description = "로그인 정보로 서버에 로그인 요청을 보냅니다.",
    tags = { "Member Controller" })
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = @Content(schema = @Schema(implementation = LoginResDTO.class)))
    })
    @PostMapping("/login")
    public LoginResDTO login(
            @Parameter(description = "회원 아이디 및 비밀번호", required = true)
            @RequestBody LoginDTO loginDTO){
        LoginResDTO loginResDTO = memberService.login(loginDTO);
        return loginResDTO;
    }

    @Autowired
    JoinService joinService;

    @PostMapping("/join")
    public String join(@RequestBody MemberDTO memberDTO){
        joinService.join(memberDTO);
        System.out.println(memberDTO);
        return "회원가입 성공";
    }
}
