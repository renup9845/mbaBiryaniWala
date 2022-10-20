package com.biryaniwala.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Aspect
@Component

public class biryaniAspect {

	private static final Logger log = LoggerFactory.getLogger(biryaniAspect.class);
	
	@Before("execution (public * from com.biryaniwala.controller.biryaniController.getAllBiryani())")
	public void logbeforebiryani() {
		log.info("Biryani Is Adding....");
		
	}
	
	@After("execution (public * from com.biryaniwala.controller.biryaniController.getAllBiryani())")
	public void logafterbiryani() {
		log.info("Biryani Added....");
	}


}
