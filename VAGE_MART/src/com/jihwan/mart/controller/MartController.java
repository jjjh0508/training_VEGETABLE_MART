package com.jihwan.mart.controller;

import com.jihwan.mart.config.ContextConfiguration;
import com.jihwan.mart.dto.MartDTO;
import com.jihwan.mart.scheduler.TestScheduler;
import com.jihwan.mart.service.MartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller("martController")
public class MartController {

    public void run() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                TestScheduler testScheduler = new TestScheduler();
                testScheduler.schrun();
            }
        });
        thread.start();
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names
        ) {
            System.out.println(name);
        }

        while (true) {
            System.out.println("메뉴를 골라주세요 : 1, 제품보기");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                MartService martService = context.getBean("martService", MartService.class);

                List<MartDTO> listDto = martService.selectProduct();

                for (MartDTO name : listDto
                ) {
                    System.out.println(name);
                }
                break;
            }
        }
    }
}
