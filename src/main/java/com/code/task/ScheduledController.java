package com.code.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduledController {
    private final Simple simple;

    public ScheduledController(Simple simple) {
        this.simple = simple;
    }
    @GetMapping("/scheduled")
    public String schedule(){
        simple.scheduleTask();
        return "task scheduled";
    }
}