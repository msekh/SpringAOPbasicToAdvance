package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

<<<<<<< HEAD
import io.mtech.aop.entity.Account;
=======
<<<<<<< HEAD
import io.mtech.aop.entity.Account;
=======
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AccountRepo {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b
	public void addAccount(Account theAccount, boolean vipFlag) {
		log.info( getClass()+"-->"+"Doing my db work: ADD Account");
	}
	
	public boolean doWork() {
		log.info( getClass()+"-->"+"do work");
		return false;
<<<<<<< HEAD
=======
=======
	public void addAccount() {
		log.info( getClass()+"-->"+"Doing my db work: ADD Account");
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b
	}
}
