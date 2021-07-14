package com.epam.spring.core;

import com.epam.spring.core.chess.ChessBoard;
import com.epam.spring.core.chess.Chessman;
import com.epam.spring.core.config.AppConfigChess;
import com.epam.spring.core.config.AppConfigOne;
import com.epam.spring.core.config.AppConfigOther;
import com.epam.spring.core.config.AppConfigTwo;
import com.epam.spring.core.otherConsumer.OtherBeanConsumerA;
import com.epam.spring.core.otherConsumer.OtherBeanConsumerB;
import com.epam.spring.core.otherConsumer.OtherBeanConsumerC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Configuration for beans1");
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfigOne.class);
        Arrays.asList(context1.getBeanDefinitionNames()).forEach(System.out::println);


        System.out.println("\nConfiguration for beans2 and beans3");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfigTwo.class);
        Arrays.asList(context2.getBeanDefinitionNames()).forEach(System.out::println);


        System.out.println("\nConfiguration for other beans");
        ApplicationContext context3 = new AnnotationConfigApplicationContext(AppConfigOther.class);

        OtherBeanConsumerA otherBeanConsumerA = context3.getBean(OtherBeanConsumerA.class);
        OtherBeanConsumerB otherBeanConsumerB = context3.getBean(OtherBeanConsumerB.class);
        OtherBeanConsumerC otherBeanConsumerC = context3.getBean(OtherBeanConsumerC.class);
        System.out.println(otherBeanConsumerA.getOtherBeanA());
        System.out.println(otherBeanConsumerB.getOtherBeanB());
        System.out.println(otherBeanConsumerC.getOtherBeanC());


        System.out.println("\nConfiguration for chess");
        ApplicationContext context4 = new AnnotationConfigApplicationContext(AppConfigChess.class);

        ChessBoard chessBoard = context4.getBean(ChessBoard.class);
        List<Chessman> chessmanList = chessBoard.getChessmanList();
        chessmanList.forEach(System.out::println);
        System.out.println("Some chessman: " + chessBoard.getSomeChessman());
        System.out.println("Some chessman1: " + chessBoard.getSomeChessman1());
        System.out.println("Some chessman2: " + chessBoard.getSomeChessman2());
    }
}
