package com.pt.one.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BoardDTO {
    private BigInteger writer_seq;
    private String writer_nick;
    private String title;
    private String content;
}
