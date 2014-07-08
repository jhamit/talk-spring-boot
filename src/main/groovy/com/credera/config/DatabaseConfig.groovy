package com.credera.config

import org.springframework.boot.orm.jpa.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EntityScan("com.credera.model")
@EnableJpaRepositories("com.credera.repository")
class DatabaseConfig {
}
