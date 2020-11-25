package io.mtech.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

	// matches for AccountRepo and MemberShipRepo, addAccount Method
	// @Before("execution(public void io.mtech.aop.repo..*.add*())")
	// @Before("execution(* add*())")

	// pointcut with parameter matches only AccountRepo
	// @Before("execution(* add*(io.mtech.aop.entity.Account, ..))")

	// pointcut with parameter matches for AccountRepo and MemebershipRepo
	@Before(value = "execution(* io.mtech.aop..*.*(..))")
=======
	
	// matches for AccountRepo and MemberShipRepo, addAccount Method
	//@Before("execution(public void io.mtech.aop.repo..*.add*())")
	@Before("execution(* add*())")
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22

	// only matches for AccountRepo Method
	// @Before(value = "execution(* io.mtech.aop.repo.AccountRepo.*(..))")
	// matches for AccountRepo and MemberShipRepo, addAccount Method--->pointcut
	// @Before("execution(* io.mtech.aop.repo..*(..))")
	public void beforeAdAccountAdvice() {
		log.info("\n=====>>> Executing @Before advice on addAccount()");
	}

}
