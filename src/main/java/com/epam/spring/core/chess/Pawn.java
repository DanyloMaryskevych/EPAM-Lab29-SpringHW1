package com.epam.spring.core.chess;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(6)
@Primary
public class Pawn implements Chessman{
    private final String name;
    private final String cost;

    public Pawn() {
        name = getName();
        cost = getCost();
    }

    @Override
    public String getName() {
        return "Pawn";
    }

    @Override
    public String getCost() {
        return "1";
    }

    @Override
    public String toString() {
        return  "Name=" + name + ", cost=" + cost;
    }
}
