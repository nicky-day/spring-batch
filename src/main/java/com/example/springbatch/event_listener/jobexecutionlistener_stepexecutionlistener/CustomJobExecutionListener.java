package com.example.springbatch.event_listener.jobexecutionlistener_stepexecutionlistener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
/*
public class CustomJobExecutionListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job is started");
        System.out.println("jobName : " + jobExecution.getJobInstance().getJobName());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        long startTime = jobExecution.getStartTime().getTime();
        long endTime = jobExecution.getEndTime().getTime();

        System.out.println("총 소요시간 : " + (endTime - startTime));
    }
}

 */
