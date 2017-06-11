package com.mustafaergan.controller;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mustafaergan.service.GuvenlikService;

@RestController
@Scope("session")
@RequestMapping("/guvenlik")
public class GuvenlikController {
	
	@Autowired
	GuvenlikService guvenlikService;
	
	@RequestMapping(value = "/sorusturma",method = RequestMethod.GET)
	public String sorgula() {
		return guvenlikService.merhabaDe() + "Rest Servis";
	}

}
