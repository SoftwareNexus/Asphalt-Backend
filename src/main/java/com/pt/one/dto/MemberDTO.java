package com.pt.one.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class MemberDTO {

    private Integer member_seq;
    private String member_id;
    private String member_pw;
    private String member_name;
    private String member_nick;
    private Integer member_age;
    private String member_gender;

}
