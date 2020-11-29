package com.williamherry.cattery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cats")
public class CatsController {
	@GetMapping("")
	public String hello() {
		return "cats/index";
	}
}
