package br.inatel.labs.labsds.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {
	@GetMapping("/ola")
	public String getOla(Model model) {
		model.addAttribute("usuario", "Davi Balbino");
		return "ola-mundo";
	}
}
