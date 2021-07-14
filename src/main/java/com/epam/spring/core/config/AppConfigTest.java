package com.epam.spring.core.config;

import com.epam.spring.core.chess.Chessman;
import com.epam.spring.core.chess.King;
import com.epam.spring.core.chess.Queen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.core.chess")
public class AppConfigTest {
}
