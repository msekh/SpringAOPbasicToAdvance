package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

<<<<<<< HEAD
import io.mtech.aop.entity.Account;
=======
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AccountRepo {

<<<<<<< HEAD
	public void addAccount(Account theAccount, boolean vipFlag) {
		log.info( getClass()+"-->"+"Doing my db work: ADD Account");
	}
	
	public boolean doWork() {
		log.info( getClass()+"-->"+"do work");
		return false;
=======
	public void addAccount() {
		log.info( getClass()+"-->"+"Doing my db work: ADD Account");
>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
	}
}
