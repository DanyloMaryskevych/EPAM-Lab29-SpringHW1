package com.epam.spring.core.chess;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Queen implements Chessman{
    private final String name;
    private final String cost;

    public Queen() {
        name = getName();
        cost = getCost();
    }

    @Override
    public String getName() {
        return "Queen";
    }

    @Override
    public String getCost() {
        return "9";
    }

    @Override
    public String toString() {
        return  "Name=" + name + ", cost=" + cost;
    }
}
