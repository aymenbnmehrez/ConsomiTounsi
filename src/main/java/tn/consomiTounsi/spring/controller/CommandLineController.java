package tn.consomiTounsi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.CommandLinePk;
import tn.consomiTounsi.spring.service.ICommandLineService;


@RestController

public class CommandLineController {

	@Autowired
	ICommandLineService iCommandLineService;

	@GetMapping("/get-all-commandLines")
	@ResponseBody
	public List<CommandLine> getCommandLines() {
		List<CommandLine> list = iCommandLineService.getAllCommandLines();
		return list;
	}

	@PostMapping("/add-command")
	@ResponseBody
	public CommandLine addCommand(@RequestBody CommandLine c) {
		CommandLine command = iCommandLineService.addCommand(c);
		return command;
	}
	@DeleteMapping("/remove-command/{command-id}")
	@ResponseBody
	public void deleteCommand(@PathVariable("command-id") CommandLinePk commandLinePk) {
		iCommandLineService.deleteCommand(commandLinePk);
	}
	
	@PutMapping("/calcul-amount-commandLines")
	@ResponseBody
	public void calculAmountCommandLine(String idProd , String idOrder ) {
		iCommandLineService.calculAmountCommandLine(idProd, idOrder);
		
	}
}
