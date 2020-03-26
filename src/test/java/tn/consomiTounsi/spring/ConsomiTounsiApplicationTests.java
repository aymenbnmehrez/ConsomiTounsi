package tn.consomiTounsi.spring;

import java.text.ParseException;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.consomiTounsi.spring.entity.City;
import tn.consomiTounsi.spring.entity.Client;
import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.entity.DeliveryMan;
import tn.consomiTounsi.spring.entity.Provider;
import tn.consomiTounsi.spring.entity.User;
import tn.consomiTounsi.spring.service.IAdminService;
import tn.consomiTounsi.spring.service.IClientService;
import tn.consomiTounsi.spring.service.IDeliveryManService;
import tn.consomiTounsi.spring.service.IDeliveryService;
import tn.consomiTounsi.spring.service.IProviderService;
import tn.consomiTounsi.spring.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsomiTounsiApplicationTests {

	@Autowired
	IUserService us;
	@Autowired
	IProviderService ps;
	@Autowired
	IClientService css;
	@Autowired
	IDeliveryManService as;


	@Test

	public void contextLoads() throws ParseException {
/*
		Provider pp = new Provider(2L, "aziz", "sxc");
		Client c = new Client("aymeng", "passworddd", "aymen", "BenMehrez", "ayymen@gmail.com", "image", 22222222,
				null);
		DeliveryMan a = new DeliveryMan("aymennn", "password", "aymen", "BenMehrez", "aymen@gmail.com", "image",
				22222222, null);
		// ps.deleteProvider("3");
		us.mettreAjourEmailByUsername("ayymennnnn@gmail.com", "aymeng");*/
		// us.addUser(pp);
		// as.addDeliveryMan(a);
		// css.addClient(c);
		// us.retrieveAllUsers();

	}

}
