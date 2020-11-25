package io.mtech.aop.repo;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MembershipRepo {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b

	public boolean addSillyMember() {
		log.info(getClass() + ": " + "DOING STUFF: " + "Adding a Membership Account.");

		return true;
	}

	public void gotoSleep() {
		log.info("i am going to sleep");

	}
<<<<<<< HEAD
=======
=======
	
	public boolean addSillyMember() {
		log.info(getClass()+": "+"DOING STUFF: "+"Adding a Membership Account.");
		return true;
	}

>>>>>>> 887aaf3c0343eddab08ebd3b0f4bc930542fdf22
>>>>>>> cd81ace4a0ac67aa344f01f057afed3f3984894b
}
