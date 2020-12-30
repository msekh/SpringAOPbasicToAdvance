package io.mtech.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
@Order(3)
public class MyApiAnalyticsAspect {
	// @Before("forDaoPackage()")
	@Before("io.mtech.aop.aspect.MyAopExpressions.forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		log.info("\n=====>>> Performing API analytics");
	}
}
