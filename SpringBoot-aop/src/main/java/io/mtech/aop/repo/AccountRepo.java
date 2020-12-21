package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

import io.mtech.aop.entity.Account;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AccountRepo {

	private String name;
	private String serviceCode;

	public void addAccount(Account theAccount, boolean vipFlag) {
		log.info(getClass() + "-->" + "Doing my db work: ADD Account");
	}

	public boolean doWork() {
		log.info(getClass() + "-->" + "do work");
		return false;
	}

	public String getName() {
		log.info(getClass() + "-->" + "in getName()");
		return name;
	}

	public void setName(String name) {
		log.info(getClass() + "-->" + "in  setName()");

		this.name = name;
	}

	public String getServiceCode() {
		log.info(getClass() + "-->" + "in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		log.info(getClass() + "-->" + "in setServiceCode()");
		this.serviceCode = serviceCode;
	}

}
