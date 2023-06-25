package com.jihwan.mart.scheduler;


import com.jihwan.mart.config.ContextConfiguration;
import com.jihwan.mart.service.MartService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


public class JobExecutor implements Job {
    private static final SimpleDateFormat TIMESTAMP_FMT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS");

    @Override
    public void execute(JobExecutionContext ctx) throws JobExecutionException {
//        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
//        MartService martService = context.getBean("martService", MartService.class);
//
//        List<MartDTO> listDto = martService.selectProduct();
//
//        for (MartDTO name : listDto
//        ) {
//            System.out.println(name);
//        }

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        MartService martService = context.getBean("martService", MartService.class);
        boolean result= martService.calculate();
        if(result){
            System.out.println("정산성공");
            boolean reuslt2 = martService.orderClear();
            if(reuslt2){
                System.out.println("주문상태 변경 완료");
            }else {
                System.out.println("주문 상태 변경 실패 확인바랍니다.");
            }
        }else {
            System.out.println("정산실패");
        }
        

        System.out.println("Job Executed [" + new Date(System.currentTimeMillis()) + "]");
//
//        /**
//         * JobData에 접근
//         */
//        JobDataMap dataMap = ctx.getJobDetail().getJobDataMap();
//
//        String currentDate = TIMESTAMP_FMT.format(new Date());
//        String triggerKey = ctx.getTrigger().getKey().toString(); // group1.trggerName
//
//        String jobSays = dataMap.getString("jobSays"); // Hello World!
//        float myFloatValue = dataMap.getFloat("myFloatValue"); // 3.141
//
//        System.out.println(String.format("[%s][%s] %s %s", currentDate, triggerKey, jobSays, myFloatValue));
    }
}





