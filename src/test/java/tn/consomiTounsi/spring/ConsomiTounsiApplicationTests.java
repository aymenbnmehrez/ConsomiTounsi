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



	@Test

	public void contextLoads() throws ParseException {


	}

}
