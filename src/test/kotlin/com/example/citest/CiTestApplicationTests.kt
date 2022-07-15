package com.example.citest

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class CiTestApplicationTests {

    @Test
    fun contextLoads() {
    }
}
