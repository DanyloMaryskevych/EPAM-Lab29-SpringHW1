package com.epam.spring.core.chess;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Rook implements Chessman{
    private final String name;
    private final String cost;

    public Rook() {
        name = getName();
        cost = getCost();
    }

    @Override
    public String getName() {
        return "Rook";
    }

    @Override
    public String getCost() {
        return "5";
    }

    @Override
    public String toString() {
        return  "Name=" + name + ", cost=" + cost;
    }
}
