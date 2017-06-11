package com.mustafaergan.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mustafaergan.dao.DAO;

@Service
@Transactional
public class GuvenlikService {

	public String merhabaDe() {
		return "Merhaba";
	}
	
	public void veriEkle(){
		DAO dao = new DAO();
	}
	
}
