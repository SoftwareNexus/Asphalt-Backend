package com.pt.one.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginResDTO {
    private String login_success;
    private Integer member_seq;
    private String member_id;
    private String member_pw;
    private String member_name;
    private String member_nick;
    private Integer member_age;
    private String member_gender;
}
