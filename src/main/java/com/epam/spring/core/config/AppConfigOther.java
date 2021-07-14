package com.epam.spring.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.epam.spring.core.other", "com.epam.spring.core.otherConsumer"})
public class AppConfigOther {
}
