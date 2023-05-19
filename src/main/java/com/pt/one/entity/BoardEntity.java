package com.pt.one.entity;

import com.pt.one.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "board")
@Accessors(chain = true)
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger board_seq;

    @Column(name = "writer_seq")
    private BigInteger writer_seq;
    @Column(name = "writer_nick")
    private String writer_nick;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "create_date")
    @CreationTimestamp
    private LocalDateTime create_date;
    @Column(name = "delete_date")
    private LocalDateTime delete_date;

    public static BoardEntity toBoardEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity()
                .setWriter_seq(boardDTO.getWriter_seq())
                .setWriter_nick(boardDTO.getWriter_nick())
                .setTitle(boardDTO.getTitle())
                .setContent(boardDTO.getContent());
        return boardEntity;
    }
}
