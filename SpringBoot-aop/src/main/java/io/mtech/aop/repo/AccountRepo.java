package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

import io.mtech.aop.entity.Account;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AccountRepo {

	public void addAccount(Account theAccount, boolean vipFlag) {
		log.info( getClass()+"-->"+"Doing my db work: ADD Account");
	}
	
	public boolean doWork() {
		log.info( getClass()+"-->"+"do work");
		return false;
	}
}
