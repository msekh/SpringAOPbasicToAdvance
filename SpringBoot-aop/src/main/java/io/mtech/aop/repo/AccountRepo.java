package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

@Component
public class AccountRepo {

	public void addAccount() {
		System.out.println(getClass()+"-->"+"Doing my db work: ADD Account");
	}
}
