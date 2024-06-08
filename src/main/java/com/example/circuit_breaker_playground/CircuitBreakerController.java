package com.example.circuit_breaker_playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    @Autowired
    private CircuitBreakerService circuitBreakerService;

    @GetMapping
    public String get(@RequestParam boolean test) {
        return circuitBreakerService.getApi(test);
    }

}
