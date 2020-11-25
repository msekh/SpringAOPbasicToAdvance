package io.mtech.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.mtech.aop.entity.Account;
import io.mtech.aop.javaConfig.DemoConfig;
import io.mtech.aop.repo.AccountRepo;
import io.mtech.aop.repo.MembershipRepo;

@SpringBootApplication
public class SpringBootAopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// read spring config java class
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountRepo theAccountRepo = ctx.getBean("accountRepo", AccountRepo.class);

		// get the Membership bean from spring container
		MembershipRepo theMembershipRepo = ctx.getBean("membershipRepo", MembershipRepo.class);
		
		Account myAccount = new Account();

		// call the business method
		theAccountRepo.addAccount(myAccount, true);
		theAccountRepo.doWork();

		//call membership business method
		theMembershipRepo.addSillyMember();
		theMembershipRepo.gotoSleep();

		// do it again! System.out.println("\nlet's call it again!\n");

		// call the business method again
		//theAccountDAO.addAccount();

		// close the context
		ctx.close();

	}

}
