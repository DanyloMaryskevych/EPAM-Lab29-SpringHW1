package com.epam.spring.core.chess;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Bishop implements Chessman{
    private final String name;
    private final String cost;

    public Bishop() {
        name = getName();
        cost = getCost();
    }

    @Override
    public String getName() {
        return "Bishop";
    }

    @Override
    public String getCost() {
        return "3";
    }

    @Override
    public String toString() {
        return  "Name=" + name + ", cost=" + cost;
    }
}
