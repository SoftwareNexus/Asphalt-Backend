package com.pt.one.service;

import com.pt.one.dto.MemberDTO;
import com.pt.one.entity.MemberEntity;
import com.pt.one.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.Member;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberRepository memberRepository;
    public void join(MemberDTO memberDTO){
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
}
