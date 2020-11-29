package com.williamherry.cattery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cats")
public class CatsController {
	@GetMapping("")
	public String indexPage() {
		return "cats/index";
	}

	@GetMapping("/new")
	public String newPage() {
		return "cats/new";
	}
}
