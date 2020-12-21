package io.mtech.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
//@EnableAspectJAutoProxy
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
<<<<<<< HEAD

	// @Pointcut("execution(* *io.mtech.aop.repo.*.*(..))")
	@Pointcut("execution(* io.mtech.aop..*.AccountRepo..*(..))")
	// @Pointcut("execution(* io.mtech.aop..*.AccountRepo..*(..))")
	private void forDaoPackage() {
		log.info("\n=====>>> Executing @Before advice on addAccount() for all package.");
	}

	@Before("forDaoPackage()")
||||||| merged common ancestors
	@Pointcut("forDaoPackage()")
=======
	@Before("forDaoPackage()")
>>>>>>> AOP-PointCut-Declaration
	public void beforeAdAccountAdvice() {
		log.info("\n=====>>> Executing @Before advice on addAccount()");
	}

<<<<<<< HEAD
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		log.info("\n=====>>> Performing API analytics");
||||||| merged common ancestors
	//@Before("execution(* *io.mtech.aop.repo.*.*(..))")
	@Before("execution(* io.mtech.aop..*.AccountRepo..*(..))")
	private void forDaoPackage() {
		log.info("\n=====>>> Executing @Before advice on addAccount() for all package.");
=======
	//@Before("execution(* *io.mtech.aop.repo.*.*(..))")
	@Pointcut("execution(* io.mtech.aop..*.AccountRepo..*(..))")
	private void forDaoPackage() {
		//log.info("\n=====>>> Executing @Before advice on addAccount() for all package.");
>>>>>>> AOP-PointCut-Declaration
	}
<<<<<<< HEAD

||||||| merged common ancestors
=======
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		log.info("\n=====>>> Performing API analytics");
	}

>>>>>>> AOP-PointCut-Declaration
}
