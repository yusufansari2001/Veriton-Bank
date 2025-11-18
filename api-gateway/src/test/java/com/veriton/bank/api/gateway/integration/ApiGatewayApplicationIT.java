package com.veriton.bank.api.gateway.integration;

import com.veriton.bank.api.gateway.ApiGatewayApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Integration tests for the {@link ApiGatewayApplication} class.
 */
@SpringBootTest
class ApiGatewayApplicationIT {
    @Test
    void contextLoads() {
        Assertions.assertDoesNotThrow(() -> {
            ApiGatewayApplication.main(new String[]{});
        });
    }
}
