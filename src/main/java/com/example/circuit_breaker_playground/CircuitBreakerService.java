package com.example.circuit_breaker_playground;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class CircuitBreakerService {

    @CircuitBreaker(name = "getApi", fallbackMethod = "fallbackApi")
    public String getApi(boolean test) {
        if(test) {
            return "success";
        }

        throw new RuntimeException("circuit-breaker-open");
    }

    public String fallbackApi(boolean test, Throwable t) {
        return "circuit-breaker-fallback";
    }


}
