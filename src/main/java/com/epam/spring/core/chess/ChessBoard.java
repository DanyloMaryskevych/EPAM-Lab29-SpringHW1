package com.epam.spring.core.chess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChessBoard {
    private final List<Chessman> chessmanList;
    private Chessman someChessman;
    private final Chessman someChessman1;
    private final Chessman someChessman2;

    @Autowired
    public ChessBoard(List<Chessman> chessmanList,
                      @Qualifier("bishop") Chessman someChessman1,
                      @Qualifier("queen") Chessman someChessman2) {
        this.chessmanList = chessmanList;
        this.someChessman1 = someChessman1;
        this.someChessman2 = someChessman2;
    }

    @Autowired
    public void setChessman(Chessman chessman) {
        this.someChessman = chessman;
    }

    public List<Chessman> getChessmanList() {
        return chessmanList;
    }

    public Chessman getSomeChessman() {
        return someChessman;
    }

    public Chessman getSomeChessman1() {
        return someChessman1;
    }

    public Chessman getSomeChessman2() {
        return someChessman2;
    }
}
