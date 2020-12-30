package io.mtech.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAopExpressions {
	@Pointcut("execution(* io.mtech.aop.repo.*.*(..))")
	public void forDaoPackage() {
		// log.info("\n=====>>> Executing @Before advice on addAccount() for all
		// package.");
	}

	// Create pointcut for getter methods
	// @Pointcut("execution(* io.mtech.aop..*.AccountRepo..*.get*(..))")
	@Pointcut("execution(* io.mtech.aop.repo.*.get*(..))")
	public void getter() {
	}

	// Create pointcut for setter methods
	// @Pointcut("execution(* io.mtech.aop..*.AccountRepo..*.set*(..))")
	@Pointcut("execution(* io.mtech.aop.repo.*.set*(..))")
	public void setter() {
	}

	// create pointcut: Include Package ... Exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {
	}
}
