package com.mgprojects.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mgprojects.models.Avenger;

public interface AvengerService {

	
	List<Avenger> getList();
	
	Avenger findById(int id);
	
	Avenger findByHeroName(String heroName);
}
