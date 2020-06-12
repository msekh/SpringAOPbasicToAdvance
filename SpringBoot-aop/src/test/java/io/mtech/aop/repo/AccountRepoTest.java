package io.mtech.aop.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import io.mtech.aop.aspect.DemoLoggingAspect;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest(classes = {AccountRepo.class, DemoLoggingAspect.class})
class AccountRepoTest {

	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private DemoLoggingAspect demoAspect;

	@Test
	public void invokeAOPStuff() {
		demoAspect.beforeAdAccountAdvice();
		accountRepo.addAccount();
	}
}
