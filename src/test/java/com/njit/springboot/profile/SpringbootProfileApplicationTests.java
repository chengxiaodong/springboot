package com.njit.springboot.profile;

import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootProfileApplication.class)
@Slf4j
public class SpringbootProfileApplicationTests {
//	@Autowired(required = false)
//	@Qualifier(value = "windows")
//	private DamoBean damoBean;
	@Ignore
	@Test
	public void testDevProfile(){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("pro");
		context.register(ProfileConfig.class);
		context.refresh();

		DamoBean damoBean = context.getBean(DamoBean.class);
		log.info("+++++++++++++++++++++++++++++++++++");
		log.info(damoBean.toString());
	}

/*	@Test
	public void testCondition(){
		log.warn(damoBean.toString());
	}*/
}
