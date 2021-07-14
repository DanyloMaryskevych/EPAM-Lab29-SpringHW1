package com.epam.spring.core.otherConsumer;

import com.epam.spring.core.other.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanConsumerA {
    private final OtherBeanA otherBeanA;

    @Autowired
    public OtherBeanConsumerA(@Qualifier("otherBeanA") OtherBeanA otherBeanA) {
        System.out.println("OtherBeanConsumerA constructor.");
        this.otherBeanA = otherBeanA;
    }

    public OtherBeanA getOtherBeanA() {
        return otherBeanA;
    }
}
