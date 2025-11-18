package com.veriton.bank.account.api.integration;

import com.veriton.bank.account.api.AccountApiApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Integration tests for the {@link AccountApiApplication} class.
 */
@SpringBootTest
class AccountApiApplicationIT {
    @Test
    void contextLoads() {
        Assertions.assertDoesNotThrow(() -> {
            AccountApiApplication.main(new String[]{});
        });
    }
}
