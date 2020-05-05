package com.raghav.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.raghav.demo.dao.AlienRepository;
import com.raghav.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepository repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}

	//	@RequestMapping("/getAlien")
	//	public ModelAndView getAlien(@RequestParam int aid) {
	//		ModelAndView mv = new ModelAndView("showAlien.jsp");
	//		Alien alien = repo.findById(aid).orElse(new Alien());
	//
	//		System.out.println(repo.findByTech("Java"));
	//		System.out.println(repo.findByAidGreaterThan(102));
	//		System.out.println(repo.findByTechSorted("Java"));
	//		mv.addObject(alien);
	//		return mv;
	//	}
	//	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		return repo.findAll();
	}

	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}


}
