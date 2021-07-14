package com.epam.spring.core.chess;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class Knight implements Chessman{
    private final String name;
    private final String cost;

    public Knight() {
        name = getName();
        cost = getCost();
    }

    @Override
    public String getName() {
        return "Knight";
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
