package io.mtech.aop.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import io.mtech.aop.aspect.DemoLoggingAspect;
import io.mtech.aop.entity.Account;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest(classes = {AccountRepo.class, DemoLoggingAspect.class})
class AccountRepoTest {

	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private DemoLoggingAspect demoAspect;
	@Autowired
	private Account account;
	

	@Test
	public void invokeAOPStuff() {
		account.setName("Mahadi");
		account.setLevel("Begginer");
		demoAspect.beforeAdAccountAdvice();
		//accountRepo.addAccount(account, true);
	}
}
