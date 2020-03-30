package tn.consomiTounsi.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.CommandLinePk;


@Repository
public interface ICommandLineRepository extends CrudRepository<CommandLine, CommandLinePk>{
	
	public List<CommandLine> findByCommandLinePk(CommandLinePk commandLinePk);
   // public List<CommandLine>  findByIdCommandLinePk(int date);

}
