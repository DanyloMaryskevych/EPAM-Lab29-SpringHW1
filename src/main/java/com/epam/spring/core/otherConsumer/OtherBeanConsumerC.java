package com.epam.spring.core.otherConsumer;

import com.epam.spring.core.other.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanConsumerC {
    @Autowired
    private OtherBeanC otherBeanC;

    public OtherBeanConsumerC() {
        System.out.println("\tOtherBeanConsumerC constructor.");
    }

    public OtherBeanC getOtherBeanC() {
        return otherBeanC;
    }
}
