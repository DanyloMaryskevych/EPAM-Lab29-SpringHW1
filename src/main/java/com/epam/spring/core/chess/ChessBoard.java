package com.epam.spring.core.chess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChessBoard {
    private final List<Chessman> chessmanList;

    @Autowired
    public ChessBoard(List<Chessman> chessmanList) {
        this.chessmanList = chessmanList;
    }

    public List<Chessman> getChessmanList() {
        return chessmanList;
    }
}
