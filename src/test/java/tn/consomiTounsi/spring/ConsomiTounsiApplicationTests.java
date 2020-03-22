package tn.consomiTounsi.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.consomiTounsi.spring.entity.Client;
import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.entity.DeliveryMan;
import tn.consomiTounsi.spring.service.IDeliveryService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsomiTounsiApplicationTests {

	@Autowired
	IDeliveryService ds;
	
	@Test
	public void contextLoads() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("01/02/2020");
		Client c =new Client();
		DeliveryMan dm = new DeliveryMan();
		//Delivery d = new Delivery(date,12f,"in progress");
		 
		
		//ds.addDelivery(d);
		ds.getAllDeliveries();
		
	}

}
