package com.njit.springboot.profile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by 晓东 on 2019/7/12.
 * QQ:2774398338
 */
@Configuration
@PropertySource(value = "classpath:damo.yml")
public class ProfileConfig {
    @Bean(name="demo")
    @Profile("dev")
    @ConfigurationProperties(prefix = "damonbean.dev")
    public DamoBean devDemoBean(){
        return new DamoBean("from devDemoBean profile");
    }
    @Bean(name="demo")
    @Profile("pro")
    @ConfigurationProperties(prefix = "damonbean.pro")
    public DamoBean proDemoBean(){
        return new DamoBean("from proDemoBean profile");
    }

}
