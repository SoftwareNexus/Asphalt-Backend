package com.pt.one.entity;

import com.pt.one.dto.MemberDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.lang.reflect.Member;

@Entity
@Getter
@Setter
@Table(name = "member")
@Accessors(chain = true)
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_seq;
    @Column(name = "member_id")
    private String member_id;
    @Column(name = "member_pw")
    private String member_pw;
    @Column(name = "member_name")
    private String member_name;
    @Column(name = "member_nick")
    private String member_nick;
    @Column(name = "member_age")
    private Integer member_age;
    @Column(name = "member_gender")
    private String member_gender;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMember_id(memberDTO.getMember_id());
        memberEntity.setMember_pw(memberDTO.getMember_pw());
        memberEntity.setMember_name(memberDTO.getMember_name());
        memberEntity.setMember_nick(memberDTO.getMember_nick());
        memberEntity.setMember_age(memberDTO.getMember_age());
        memberEntity.setMember_gender(memberDTO.getMember_gender());

        return memberEntity;
    }
}
