package com.mustafaergan.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mustafaergan.spring.service.AlanService;
import com.mustafaergan.spring.service.MatematikService;

@Controller
@RequestMapping("matematik")
public class MatematikController {

	@Autowired
	AlanService alanservice;
	
	@Autowired
	MatematikService matetikServis;
	
	@RequestMapping(value = "/sonucgoster", method = RequestMethod.GET)
	public String selamCak(ModelMap map){
		map.addAttribute("text",alanservice.getSonuc());
		return "matematik";
	}
	
	@RequestMapping(value = "/toplama/{param1}/{param2}", method = RequestMethod.GET)
	public String toplama(ModelMap map, @PathVariable("param1") int param1,
										@PathVariable("param2") int param2){
		matetikServis.toplam(param1, param2);
		map.addAttribute("text",alanservice.getSonuc());
		map.addAttribute("sonuc",matetikServis.getSonuc());
		return "matematik";
	}
	
}
