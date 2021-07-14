package com.epam.spring.core.chess;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class King implements Chessman{
    private final String name;
    private final String cost;

    public King() {
        name = getName();
        cost = getCost();
    }

    @Override
    public String getName() {
        return "King";
    }

    @Override
    public String getCost() {
        return "invaluable";
    }

    @Override
    public String toString() {
        return  "Name=" + name + ", cost=" + cost;
    }
}
