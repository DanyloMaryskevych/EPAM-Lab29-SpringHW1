package com.epam.spring.core.otherConsumer;

import com.epam.spring.core.other.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanConsumerB {
    private OtherBeanB otherBeanB;

    public OtherBeanConsumerB() {
        System.out.println("OtherBeanConsumerB constructor.");
    }

    public OtherBeanB getOtherBeanB() {
        return otherBeanB;
    }

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }
}
