package tn.consomiTounsi.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.CommandLinePk;
import tn.consomiTounsi.spring.repository.ICommandLineRepository;


@Service
public class CommandLineService implements ICommandLineService{


	private static final Logger L = LogManager.getLogger(CommandLineService.class);
	
	@Autowired
	ICommandLineRepository iCommandLineRepository;

	@Override
	public List<CommandLine> getAllCommandLines() {
		List<CommandLine> commandLines = (List<CommandLine>) iCommandLineRepository.findAll();
		
		for(CommandLine commandLine:commandLines){
			L.info("commandLine +++:"+commandLine);
		}
		return commandLines;
	}
	@Override
	public CommandLine addCommand(CommandLine c) {
		return iCommandLineRepository.save(c);

	}
	
	@Override
	public void deleteCommand(CommandLinePk commandLinePk) {
		iCommandLineRepository.deleteById(commandLinePk);	
		
	}
	@Override
	public void calculAmountCommandLine(String idProd , String idOrder) {
		// TODO Auto-generated method stub
		CommandLinePk clPk=new CommandLinePk(Long.parseLong(idProd),Long.parseLong(idOrder));
		List<CommandLine> cl =iCommandLineRepository.findByCommandLinePk(clPk);
		float amountCommandLine;
		float productPrice=cl.get(0).getProduct().getPrice();
		L.info("product price : "+productPrice);
		amountCommandLine=cl.get(0).getQuantity()*productPrice;
		L.info("amlount command line : "+amountCommandLine);
		cl.get(0).setAmount(amountCommandLine);
		iCommandLineRepository.save(cl.get(0));
		
	}


}
