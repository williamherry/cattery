package com.williamherry.cattery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.williamherry.cattery.models.Cat;
import com.williamherry.cattery.repositories.CatRepository;

@Controller
@RequestMapping("/cats")
public class CatsController {
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private CatRepository catRepository;

	@GetMapping("")
	public String indexPage(Model model) {
		Iterable<Cat> cats = catRepository.findAll();
		model.addAttribute("cats", cats);
		return "cats/index";
	}

	@GetMapping("/new")
	public String newPage() {
		return "cats/new";
	}

	@PostMapping("") // Map ONLY POST Requests
	public  String addNewUser(Cat cat, Model model) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		catRepository.save(cat);
		model.addAttribute("cat", cat);
		return "redirect:cats";
	}
}
