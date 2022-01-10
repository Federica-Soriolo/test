package com.fede.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fede.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Pinco", "Pallino", "Pinco"));
		lista.add(new Contatto("Dario", "Lampa", "Dario"));
		lista.add(new Contatto("Rosa", "Venti", "Rosa"));
	}
}
