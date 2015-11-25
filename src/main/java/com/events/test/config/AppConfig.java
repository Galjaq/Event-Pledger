package com.events.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Configuration for Spring's root application context
 */
@Configuration
@ComponentScan(basePackages = { "com.events.test" })
@Import({ TransactionBeanContextConfig.class })
public class AppConfig {

}