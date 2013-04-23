package com.boseeda.loyo.infrastructure.persistence;

import javax.ejb.EJB;
import javax.inject.Named;

import com.boseeda.loyo.application.LoyoDataGenerator;

@Named
public class InitData {
	
	@EJB
	private LoyoDataGenerator dg;
	
	public  void createOrgAndPerson(){
		
		dg.createOrgAndPerson();
	};

}
