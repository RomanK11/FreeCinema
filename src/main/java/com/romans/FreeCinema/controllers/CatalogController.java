package com.romans.FreeCinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {
	@GetMapping("/catalog")
	public String home(Model model) {
		model.addAttribute("title", "Catalog page");
		return "catalog";
	}
}
