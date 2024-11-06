package com.code.task;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class Simple {
    private final ThreadPoolTaskScheduler taskScheduler;

    public Simple(ThreadPoolTaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }
    public void scheduleTask(){
        Runnable task=new Runnable() {
            @Override
            public void run() {
                System.out.println("whatsup"+ new Date()+ "message: hello, this is a scheduled task!");
            }
        };

        taskScheduler.schedule(task, new Date(System.currentTimeMillis()+9000));
    }
}
