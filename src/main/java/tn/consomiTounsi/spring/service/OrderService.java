package tn.consomiTounsi.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.CommandLinePk;
import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.entity.Order;
import tn.consomiTounsi.spring.entity.Product;
import tn.consomiTounsi.spring.entity.User;
import tn.consomiTounsi.spring.repository.ICommandLineRepository;
import tn.consomiTounsi.spring.repository.IOrderRepository;
import tn.consomiTounsi.spring.repository.IProductRepository;
import tn.consomiTounsi.spring.repository.IUserRepository;


@Service
public class OrderService implements IOrderService{
	
	private static final Logger L = LogManager.getLogger(OrderService.class);
	
	@Autowired
	IOrderRepository iOrderRepository;
	@Autowired
	ICommandLineRepository iCommandLineRepository;
	@Autowired
	IProductRepository iProductRepository;
	@Autowired
	IUserRepository iUserRepository;
	
	@Override
	public List<Order> getAllOrders() {
		List<Order> orders = (List<Order>) iOrderRepository.findAll();
		
		for(Order order:orders){
			L.info("users +++:"+order);
		}
		return orders;
	}
	@Override
	public Order addOrder(Order o) {
		return iOrderRepository.save(o);
	}
	
	@Override
	public void deleteOrder(String id) {
		iOrderRepository.deleteById(Long.parseLong(id));	
		
	}
	@Override
	public void calculAmountOrder(String id) {
	
		
		Order order = iOrderRepository.findById(Long.parseLong(id)).get();
		double amountOrder=0;

		List<CommandLine> commandLines = (List<CommandLine>) iCommandLineRepository.findAll();
		for(CommandLine commandLine:commandLines){
if (commandLine.getCommandLinePk().getOrder_id()==(Long.parseLong(id)))
{
	amountOrder=amountOrder+commandLine.getAmount();
	}

order.setAmount(amountOrder);
iOrderRepository.save(order);

}

		

	}
	@Override
	public List<String> getAllOrdersByProduct(String id) {

		Product product = iProductRepository.findById(Long.parseLong(id)).get();
		List<String> orders = new ArrayList<>();
		
		for(CommandLine com : product.getCommandLines()){
Order order=com.getOrder();
	
		
orders.add(order.getAdress());	
	}
		return orders;
}
	
	
	
	@Override
	public List<Order> getAllOrdersByUser(String id) {
		//User user = iUserRepository.findById(Long.parseLong(id)).get();
		
		
		List<Order> orders = (List<Order>) iOrderRepository.findAll();
		List<Order> OrderOfUser = new ArrayList<>();

		for(Order order :orders){
			if (order.getClients().getId()==(Long.parseLong(id)))
			{
				OrderOfUser.add(order);
		}
	} return OrderOfUser;
}
}