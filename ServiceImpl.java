package com.karelcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karelcode.model.Agente;
import com.karelcode.repos.AgenteRepository;

@Service
public class ServiceImpl {
	@Autowired
	AgenteRepository agenteRepository;
	//adding an agent to the db...
public void addAgent(String name, String location) {
	Agente agente = new Agente(name, location);
	agenteRepository.save(agente);
}

public List<Agente> getLista(){
	List<Agente>lista = agenteRepository.findAll();
	return lista;
}
}
