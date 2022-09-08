package com.pdev.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private HeavyService heavyService;

    @GetMapping("/do-heavy-work")
    public ResponseEntity<MessageResponse> getTheWorkDone(){
        System.out.println("Start getTheWorkDone");
        heavyService.doWorkAsynchronously();
        System.out.println("End getTheWorkDone");
        return ResponseEntity.ok(new MessageResponse("Executing..."));
    }
}
