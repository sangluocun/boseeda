package com.boseeda.loyo.application;

import javax.ejb.Remote;

@Remote
public interface LoyoDataGenerator {
	public  void createOrgAndPerson();
}
