package com.flow.ipq;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@Controller
public class IPQController {

    private final ClaimRepository claimRepo;
    private final InterRepo interRepo;
    private final StatusRepo statusRepo;

    @PostConstruct
    public String startTask() {
        while (true) {

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Working on it...");
        }
    }
}
