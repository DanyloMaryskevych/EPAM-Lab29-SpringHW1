package com.epam.spring.core.config;

import com.epam.spring.core.beans3.BeanD;
import com.epam.spring.core.beans3.BeanF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.core.beans2")
@ComponentScan(basePackageClasses = {BeanD.class, BeanF.class},
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = ASSIGNABLE_TYPE, value = {BeanD.class, BeanF.class}),
        })
public class AppConfigTwo {
}
