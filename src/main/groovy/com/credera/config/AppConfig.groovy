package com.credera.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Import

@EnableAutoConfiguration
@ComponentScan("com.credera")
@Import([DatabaseConfig])
class AppConfig {

    static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args)

    }
}
