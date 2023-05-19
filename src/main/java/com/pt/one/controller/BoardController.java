package com.pt.one.controller;

import com.pt.one.dto.BoardDTO;
import com.pt.one.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping("/board/create")
    public void create(@RequestBody BoardDTO boardDTO) {
        boardService.create(boardDTO);
    }
}
