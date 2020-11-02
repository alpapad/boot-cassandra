package com.test.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.CqlSessionBuilder;

@SpringBootApplication
public class CassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(CassandraApplication.class, args);
    }

    @Bean(name = "cassandraMigrationCqlSession")
    public CqlSession cassandraMigrationCqlSession(CqlSessionBuilder cqlSessionBuilder) {
        return cqlSessionBuilder.build();
    }

    @Bean
    @Primary
    public CqlSession applicationCqlSession(CqlSessionBuilder cqlSessionBuilder) {
        return cqlSessionBuilder.build();
    }
}
