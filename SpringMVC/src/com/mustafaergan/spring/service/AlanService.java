package com.mustafaergan.spring.service;

import org.springframework.stereotype.Service;

@Service
public class AlanService {
	
	int sonuc;
	
	public int alanHesapla(int a, int b, int h){
		sonuc = a*b*h;
		return sonuc;
	}
	
	public int getSonuc() {
		return sonuc;
	}

}
