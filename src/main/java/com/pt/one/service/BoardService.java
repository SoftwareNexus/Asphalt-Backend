package com.pt.one.service;

import com.pt.one.dto.BoardDTO;
import com.pt.one.entity.BoardEntity;
import com.pt.one.repository.BoardRepository;
import com.pt.one.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public void create(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toBoardEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
