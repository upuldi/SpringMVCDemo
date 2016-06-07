package com.mycompany.myapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by udoluweera on 6/7/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mycompany.myapp")
public class AppConfiguration {
}
