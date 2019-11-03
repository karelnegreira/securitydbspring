package com.karelcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.karelcode.model.Agente;
import com.karelcode.repos.AgenteRepository;
import com.karelcode.repos.UsersRepository;

@Controller
public class WebController {
	@Autowired
	AgenteRepository agenteRepository;
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping("/register")
	public String add(@RequestParam(name ="agentname", required = false) String name, @RequestParam(name ="agentlocation", required = false)String location) {
	Agente agente = new Agente(name, location);
	agenteRepository.save(agente);
	return "register";
	}
	/*is going to map url -> localhost:8080/lista, querying all elements from DB and displays them into display.htm*/
	@GetMapping("/lista")
	public String getList(Model modelAndView) {
		modelAndView.addAttribute("agentes", agenteRepository.findAll());
		return "display";
	}

}
