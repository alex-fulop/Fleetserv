package com.fulopcorp.fleetserv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/index")
	private String goHome() {
		return "index";
	} asdasdasdd
}
