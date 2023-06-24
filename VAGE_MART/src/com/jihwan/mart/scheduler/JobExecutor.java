package com.jihwan.mart.scheduler;


import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobExecutor implements Job {
    private static final SimpleDateFormat TIMESTAMP_FMT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS");

    @Override
    public void execute(JobExecutionContext ctx) throws JobExecutionException {
        System.out.println("Job Executed [" + new Date(System.currentTimeMillis()) + "]");

        /**
         * JobData에 접근
         */
        JobDataMap dataMap = ctx.getJobDetail().getJobDataMap();

        String currentDate = TIMESTAMP_FMT.format(new Date());
        String triggerKey = ctx.getTrigger().getKey().toString(); // group1.trggerName

        String jobSays = dataMap.getString("jobSays"); // Hello World!
        float myFloatValue = dataMap.getFloat("myFloatValue"); // 3.141

        System.out.println(String.format("[%s][%s] %s %s", currentDate, triggerKey, jobSays, myFloatValue));
    }
}





