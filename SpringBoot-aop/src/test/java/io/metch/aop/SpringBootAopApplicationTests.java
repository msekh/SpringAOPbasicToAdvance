package io.metch.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.mtech.aop.aspect.DemoLoggingAspect;
import io.mtech.aop.repo.AccountRepo;
import lombok.extern.slf4j.Slf4j;

//@RunWith(SpringRunner.class)

@Slf4j
@SpringBootTest(classes = {AccountRepo.class, DemoLoggingAspect.class})
class SpringBootAopApplicationTests {

	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private DemoLoggingAspect demoAspect;

	@Test
	public void invokeAOPStuff() {
		demoAspect.beforeAdAccountAdvice();
		//accountRepo.addAccount();

	}

}
