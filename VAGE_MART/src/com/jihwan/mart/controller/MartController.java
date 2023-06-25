package com.jihwan.mart.controller;

import com.jihwan.mart.config.ContextConfiguration;
import com.jihwan.mart.dto.*;
import com.jihwan.mart.scheduler.TestScheduler;
import com.jihwan.mart.service.MartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Controller("martController")
public class MartController {

    public void run() {

        TestScheduler testScheduler = new TestScheduler();
        testScheduler.schrun();

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[] names = context.getBeanDefinitionNames();


        exe:
        while (true) {
            System.out.println("메뉴를 골라주세요 : 1:판매중인 과일보기, 2.판매중인 야채보기, 3:물건팔기, 4.오늘 판매한 상품보기 5.종료하기");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            MartService martService = context.getBean("martService", MartService.class);
            switch (num) {
                case 1:

                    List<FruitDTO> fruitListDto = martService.selectFruitProduct();

                    for (FruitDTO name : fruitListDto
                    ) {
                        System.out.println(name);
                    }
                    break;
                case 2:
                    List<VegetableDTO> vegListDTO = martService.selectVegetableProduct();
                    for (VegetableDTO name : vegListDTO
                    ) {
                        System.out.println(name);
                    }
                    break;
                case 3:
                    Map<String, String> map = producrSale();
                    SaleFruitDTO saleFruitDTO = new SaleFruitDTO();
                    saleFruitDTO.setProNum(Integer.parseInt(map.get("proNum")));
                    saleFruitDTO.setWeigh(Integer.parseInt(map.get("amount")));
                    PayDTO payDTO = new PayDTO();
                    payDTO.setPrice(Integer.parseInt(map.get("amount")) * Integer.parseInt(map.get("price")));
                    boolean result = martService.orderSale(saleFruitDTO);
                    if (result) {
                        System.out.println("구매 성공");
                        boolean result2 = martService.payment(payDTO);
                        if (result2) {
                            System.out.println("결제성공");
                        }
                    } else {
                        System.out.println("구매 실패");
                    }
                    break;
                case 4:
                    List<OrderDTO> orderList = martService.selectOrder();
                    for (OrderDTO orderDTO : orderList) {
                        System.out.println(orderDTO);
                    }

                    break ;
                case 5:
                    System.out.println("프로그램을 종료합니다");

                    break exe;


            }
        }
    }

    private Map<String, String> producrSale() {
        Map<String, String> map = new HashMap<>();
        System.out.println("판매할 종류를 골라주세요 1. 과일 , 2 야채 :");
        String amount;
        String price;
        String proNum;

        Scanner sc = new Scanner(System.in);
        String no = sc.nextLine();
        while (true) {
            switch (no) {
                case "1":
                    System.out.println("과일을 골라주세요. 1.사과, 2.귤, 3.딸기, 4.수박");
                    String fruitNum;
                    fruitNum = sc.nextLine().trim();

                    if (fruitNum.equals("1")) {
                        proNum = "1";
                        System.out.println("사과는 100g당 3000원입니다 구매할 무게를 입력해주세요 1=100g");
                        amount = sc.nextLine();
                        price = "3000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);

                        return map;


                    } else if (fruitNum.equals("2")) {
                        proNum = "2";
                        System.out.println("2.귤은 100g당 1000원입니다. 구매할 무게를 입력해주세요 1=100g ");
                        amount = sc.nextLine();
                        price = "1000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);

                        return map;
                    } else if (fruitNum.equals("3")) {
                        proNum = "3";
                        System.out.println("딸기는 1kg당 4000원입니다.구매할 무게를  입력해주세요");
                        amount = sc.nextLine();
                        price = "4000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);

                        return map;
                    } else if (fruitNum.equals("4")) {
                        proNum = "4";
                        System.out.println("수박은 한통당 200000원 입니다 구매할 수량을 입력하세요");
                        amount = sc.nextLine();
                        price = "20000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);

                        return map;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }

                case "2":
                    System.out.println("야채을 골라주세요. 1.상추, 2.배추, 3.시금치, 4.방울토마토");
                    String vegeNum;
                    vegeNum = sc.nextLine().trim();
                    if (vegeNum.equals("1")) {
                        proNum = "5";
                        System.out.println("상추는 100g당 1000원입니다 구매할 무게를 입력해주세요 1=100g");
                        amount = sc.nextLine();
                        price = "1000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);

                        return map;
                    } else if (vegeNum.equals("2")) {
                        proNum = "6";
                        System.out.println("배추는 개당 2000원입니다 구매할 무게를 입력해주세요");
                        amount = sc.nextLine();
                        price = "2000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);
                        return map;
                    } else if (vegeNum.equals("3")) {
                        proNum = "7";
                        System.out.println("시금치는 100g당 1500원입니다 구매할 무게를 입력해주세요 1=100g");
                        amount = sc.nextLine();
                        price = "1500";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);
                        return map;
                    } else if (vegeNum.equals("4")) {
                        proNum = "8";
                        System.out.println("방울는 100g당 3000원입니다 구매할 무게를 입력해주세요 1=100g");
                        amount = sc.nextLine();
                        price = "3000";
                        map.put("proNum", proNum);
                        map.put("amount", amount);
                        map.put("price", price);
                        return map;
                    } else {
                        System.out.println("잘못입력하셨습니다.");
                        break;
                    }
            }

        }
    }
}
