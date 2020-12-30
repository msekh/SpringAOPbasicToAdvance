package io.mtech.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class DemoLoggingAspect {

	// this is where we add all of our related advices for logging
	// let's start with an @Before advice

	// matches for AccountRepo and MemberShipRepo, addAccount Method
	// @Before("execution(public void addAccount())")

	// only matches for AccountRepo Method
	// @Before("execution(public void io.mtech.aop.repo.AccountRepo.addAccount())")

	// matches for AccountRepo and MemberShipRepo, addAccount Method
	// @Before("execution(public void io.mtech.aop.repo..*.addAccount())")

	// matches for AccountRepo and MemberShipRepo, addAccount Method
	// @Before("execution(public void io.mtech.aop.repo..*.add*())")
	// @Before("execution(* add*())")

	// pointcut with parameter and without parameter matches only AccountRepo
	// @Before(value = "execution(* io.mtech.aop..*.AccountRepo..*(..))")

	// pointcut with parameter matches for AccountRepo and MemebershipRepo
	// @Before(value = "execution(* io.mtech.aop..*.*(..))")

	// only matches for AccountRepo Method
	// @Before(value = "execution(* io.mtech.aop.repo.AccountRepo.*(..))")

	// matches for AccountRepo and MemberShipRepo, addAccount Method--->pointcut
	

	// @Pointcut("execution(* io.mtech.aop..*.AccountRepo..*(..))")
	@Pointcut("execution(* io.mtech.aop.repo.*.*(..))")
	private void forDaoPackage() {
		// log.info("\n=====>>> Executing @Before advice on addAccount() for all
		// package.");
	}

	// Create pointcut for getter methods
	// @Pointcut("execution(* io.mtech.aop..*.AccountRepo..*.get*(..))")
	@Pointcut("execution(* io.mtech.aop.repo.*.get*(..))")
	private void getter() {
	}

	// Create pointcut for setter methods
	// @Pointcut("execution(* io.mtech.aop..*.AccountRepo..*.set*(..))")
	@Pointcut("execution(* io.mtech.aop.repo.*.set*(..))")
	private void setter() {
	}

	// create pointcut: Include Package ... Exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {
	}
	  //@Before("forDaoPackage()")
		@Before("forDaoPackageNoGetterSetter()")
		public void beforeAdAccountAdvice() {
			log.info("\n=====>>> Executing @Before advice on addAccount()");
		}

		// @Before("forDaoPackage()")
		@Before("forDaoPackageNoGetterSetter()")
		public void performApiAnalytics() {
			log.info("\n=====>>> Performing API analytics");
		}
}