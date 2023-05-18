package com.pt.one.service;

import com.pt.one.dto.MemberDTO;
import com.pt.one.entity.MemberEntity;
import com.pt.one.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.Member;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberRepository memberRepository;
    public void join(MemberDTO memberDTO){
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

    public String validation(String member_id) {
        Optional<MemberEntity> member_check = memberRepository.findByMember_id(member_id);
        if (member_check.isPresent()){
            return "unable";
        }
        return "able";
    }
}
