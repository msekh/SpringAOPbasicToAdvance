package io.mtech.aop.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import io.mtech.aop.aspect.DemoLoggingAspect;
<<<<<<< HEAD
import io.mtech.aop.entity.Account;
=======
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest(classes = {AccountRepo.class, DemoLoggingAspect.class})
class AccountRepoTest {

	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private DemoLoggingAspect demoAspect;
<<<<<<< HEAD
	@Autowired
	private Account account;
	

	@Test
	public void invokeAOPStuff() {
		account.setName("Mahadi");
		account.setLevel("Begginer");
		demoAspect.beforeAdAccountAdvice();
		//accountRepo.addAccount(account, true);
=======

	@Test
	public void invokeAOPStuff() {
		demoAspect.beforeAdAccountAdvice();
		accountRepo.addAccount();
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
	}
}
