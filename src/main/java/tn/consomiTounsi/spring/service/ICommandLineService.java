package tn.consomiTounsi.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.CommandLinePk;
import tn.consomiTounsi.spring.entity.Delivery;


@Service

public interface ICommandLineService {
	List<CommandLine> getAllCommandLines();
	CommandLine addCommand(CommandLine c);
	void deleteCommand(CommandLinePk commandLinePk);
	void calculAmountCommandLine(String idProd , String idOrder);

	
}
