package com.mustafaergan.spring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MatematikService {
	int sonuc;
	public int toplam(int a, int b) {
		sonuc = a+b;
		return sonuc;
	}
	public int getSonuc() {
		return sonuc;
	}
}
