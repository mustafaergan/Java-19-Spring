package com.mustafaergan.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mustafaergan.spring.service.AlanService;

@Controller
@RequestMapping("/merhaba")
public class MerhabaController {
//	AlanService alanService;
	
//	public MerhabaController() {
//		AlanService alanService = new AlanService();
//		int sonuc = alanService.alanHesapla(5, 4, 3);
//	}
	
	@Autowired
	AlanService alanservice;
	
	@RequestMapping(value = "/selamcak.mustafa", method = RequestMethod.GET)
	public String selamCak(){
//		AlanService alanService = new AlanService();
//		int sonuc = alanService.alanHesapla(5, 4, 3);
		return "merhaba";
	}
	
	@RequestMapping(value = "/alanhesapla", method = RequestMethod.GET)
	public String alanHesap(ModelMap map){
//		AlanService alanService = new AlanService();
//		int sonuc = alanService.alanHesapla(5, 4, 3);
		alanservice.alanHesapla(5, 4, 3);
		map.addAttribute("text",alanservice.getSonuc());
		return "merhaba";
	}
	
	@RequestMapping(value = "/alanhesaplaSonuc", method = RequestMethod.GET)
	public String alanHesapSonuc(ModelMap map){
		map.addAttribute("text",alanservice.getSonuc());
		return "merhaba";
	}

}
