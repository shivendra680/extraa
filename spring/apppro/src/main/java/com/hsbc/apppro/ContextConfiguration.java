package com.hsbc.apppro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = {"com.apppro.service","com.apppro.aspect"})
public class ContextConfiguration {

}
