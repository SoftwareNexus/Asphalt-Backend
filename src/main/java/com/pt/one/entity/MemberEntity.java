package com.pt.one.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Member;

@Entity
@Getter
@Setter
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_seq;
    @Column
    private String member_id;
    @Column
    private String member_pw;
    @Column
    private String member_name;
    @Column
    private String member_nick;
    @Column
    private Integer member_age;
    @Column
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
