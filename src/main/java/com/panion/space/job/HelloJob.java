package com.panion.space.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class HelloJob implements BaseJob {

    private static Logger _log = LoggerFactory.getLogger(HelloJob.class);

    public HelloJob() {

    }

    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        _log.error("Hello Job执行时间: " + new Date());
        System.out.println("你好酷  😭");

    }
}
