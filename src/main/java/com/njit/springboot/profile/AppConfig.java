package com.njit.springboot.profile;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 晓东 on 2019/7/12.
 * QQ:2774398338
 */
@Configuration
public class AppConfig {

   @Conditional(MyCondition.class)
   @Bean(name = "windows")
    public DamoBean damoBean(){
        return new DamoBean("from windows");
    }
    
}
