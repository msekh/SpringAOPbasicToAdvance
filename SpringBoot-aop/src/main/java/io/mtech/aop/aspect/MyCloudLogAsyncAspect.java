package io.mtech.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
@Order(1)
public class MyCloudLogAsyncAspect {
	// @Before("forDaoPackage()")
			@Before("io.mtech.aop.aspect.MyAopExpressions.forDaoPackageNoGetterSetter()")
			public void logToCloudAsync() {
				log.info("\n=====>>>Logging Cloud to Async  fasion");
			}
}
