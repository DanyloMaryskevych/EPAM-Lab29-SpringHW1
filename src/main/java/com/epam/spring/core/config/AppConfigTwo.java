package com.epam.spring.core.config;

import com.epam.spring.core.beans3.BeanD;
import com.epam.spring.core.beans3.BeanE;
import com.epam.spring.core.beans3.BeanF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.core.beans2")
@ComponentScan(basePackages = "com.epam.spring.core.beans3",
/*
        We can use basePackageClasses property to say Spring where to look for Components:
                basePackageClasses = BeanF.class or
                basePackageClasses = {BeanD.class, BeanF.class},
        but Spring will look for all Classes in the package where these classes are, so we need to use Filters.
*/
        // We can do it in two ways: includeFilters or excludeFilters.

/*
        1. If we want to include filters, we need to enable default filters.
        useDefaultFilters: Indicates whether automatic detection of classes annotated with @Component @Repository,
                @Service, or @Controller should be enabled. (Spring IO)

        useDefaultFilters = false,

        includeFilters = {
                @ComponentScan.Filter(
                        type = ASSIGNABLE_TYPE,
                        classes = {BeanD.class, BeanF.class}),
        }
*/


/*      2. Secondly, filter classes.
                includeFilters: Specifies which types are eligible for component scanning. (Spring IO)
                excludeFilters: Specifies which types are not eligible for component scanning. (Spring IO)
        There are five types of filters available for ComponentScan.Filter :
                ANNOTATION:  includes or excludes classes in the component scans which are marked with given annotations.
                ASSIGNABLE_TYPE: filters all classes during the component scan that either extend the class
                                 or implement the interface of the specified type.
                ASPECTJ: when we want to use expressions to pick out a complex subset of classes.
                REGEX: checks if the class name matching a given regex pattern.
                CUSTOM

*/

        excludeFilters = {
                @ComponentScan.Filter(
                        type = ASSIGNABLE_TYPE,
                        classes = BeanE.class)
        })
public class AppConfigTwo {
}
