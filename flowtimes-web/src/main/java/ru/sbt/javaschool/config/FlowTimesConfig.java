package ru.sbt.javaschool.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@Configuration
@EnableScheduling
@ComponentScan(basePackages = "ru.sbt.javaschool")
@PropertySource(value = {"classpath:craftycat.properties"}, ignoreResourceNotFound = true, encoding = "UTF-8")
public class FlowTimesConfig {
    @Value("${craftycat.param3:o_O}")
    private String myParam;

    @PostConstruct
    public void init() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + myParam);
    }

}