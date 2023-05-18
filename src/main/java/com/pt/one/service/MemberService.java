package com.pt.one.service;

import com.pt.one.dto.LoginDTO;
import com.pt.one.dto.LoginResDTO;
import com.pt.one.dto.MemberDTO;
import com.pt.one.entity.MemberEntity;
import com.pt.one.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Member;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public LoginResDTO login(LoginDTO loginDTO){
        Optional<MemberEntity> memberEntity = memberRepository.findByMember_id(loginDTO.getMember_id());
        LoginResDTO loginResDTO = new LoginResDTO();
        // 아이디 정보가 있는 경우
        if (memberEntity.isPresent()) {
            // 비밀번호 확인
            if (memberEntity.get().getMember_pw().equals(loginDTO.getMember_pw())) {
                // 로그인 성공
                loginResDTO.setLogin_success("성공");
                loginResDTO.setMember_seq(memberEntity.get().getMember_seq());
                loginResDTO.setMember_id(memberEntity.get().getMember_id());
                loginResDTO.setMember_pw(memberEntity.get().getMember_pw());
                loginResDTO.setMember_name(memberEntity.get().getMember_name());
                loginResDTO.setMember_nick(memberEntity.get().getMember_nick());
                loginResDTO.setMember_age(memberEntity.get().getMember_age());
                loginResDTO.setMember_gender(memberEntity.get().getMember_gender());
                return loginResDTO;
            }
        }
        loginResDTO.setLogin_success("실패");
        return loginResDTO;
    }
}
