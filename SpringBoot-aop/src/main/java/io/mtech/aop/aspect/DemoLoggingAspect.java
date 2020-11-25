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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b

	// matches for AccountRepo and MemberShipRepo, addAccount Method
	// @Before("execution(public void io.mtech.aop.repo..*.add*())")
	// @Before("execution(* add*())")

	// pointcut with parameter and without parameter matches only AccountRepo
	// @Before(value = "execution(* io.mtech.aop..*.AccountRepo..*(..))")

	// pointcut with parameter matches for AccountRepo and MemebershipRepo
<<<<<<< HEAD
	// @Before(value = "execution(* io.mtech.aop..*.*(..))")
=======
	@Before(value = "execution(* io.mtech.aop..*.*(..))")
=======
	
	// matches for AccountRepo and MemberShipRepo, addAccount Method
	//@Before("execution(public void io.mtech.aop.repo..*.add*())")
	@Before("execution(* add*())")
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b

	// only matches for AccountRepo Method
	// @Before(value = "execution(* io.mtech.aop.repo.AccountRepo.*(..))")

	// matches for AccountRepo and MemberShipRepo, addAccount Method--->pointcut
	@Pointcut("forDaoPackage()")
	public void beforeAdAccountAdvice() {
		log.info("\n=====>>> Executing @Before advice on addAccount()");
	}

	//@Before("execution(* *io.mtech.aop.repo.*.*(..))")
	@Before("execution(* io.mtech.aop..*.AccountRepo..*(..))")
	private void forDaoPackage() {
		log.info("\n=====>>> Executing @Before advice on addAccount() for all package.");
	}
}
