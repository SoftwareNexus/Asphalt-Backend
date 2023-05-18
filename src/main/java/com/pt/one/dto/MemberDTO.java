package com.pt.one.dto;

import com.pt.one.entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {

    private Integer member_seq;
    private String member_id;
    private String member_pw;
    private String member_name;
    private String member_nick;
    private Integer member_age;
    private String member_gender;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMember_seq(memberEntity.getMember_seq());
        memberDTO.setMember_id(memberEntity.getMember_id());
        memberDTO.setMember_pw(memberEntity.getMember_pw());
        memberDTO.setMember_name(memberEntity.getMember_name());
        memberDTO.setMember_nick(memberEntity.getMember_nick());
        memberDTO.setMember_age(memberEntity.getMember_age());
        memberDTO.setMember_gender(memberEntity.getMember_gender());
        return memberDTO;
    }
}
