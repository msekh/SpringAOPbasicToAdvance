package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AccountRepo {

	public void addAccount() {
		log.info( getClass()+"-->"+"Doing my db work: ADD Account");
	}
}
