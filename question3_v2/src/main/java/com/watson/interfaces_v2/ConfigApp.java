package com.watson.interfaces_v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

        @Bean(name = "cal")
        public Calculater getService() {
            return new CalculaterImplement();
        }

    }
