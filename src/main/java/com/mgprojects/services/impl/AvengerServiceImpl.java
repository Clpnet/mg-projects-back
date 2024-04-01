package com.mgprojects.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.mgprojects.models.Avenger;
import com.mgprojects.services.AvengerService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class AvengerServiceImpl implements AvengerService {

	@Override
	public List<Avenger> getList() {

		log.info("Se devolverá la lista de avengers");

		return Avenger.avengeList();
		// TODO Auto-generated method stub
	}

	@Override
	public Avenger findById(int id) {

		log.info("Se devolverá el avenger de acuerdo a su identificador");
		// TODO Auto-generated method stub		
		List<Avenger> list = Avenger.avengeList();
		Avenger a = list.stream().filter(e->e.id==id).findFirst().orElse(null);
		return a;

	}

	@Override
	public Avenger findByHeroName(String heroName) {
		// TODO Auto-generated method stub
		return (Avenger) Avenger.avengeList().stream().filter(e -> e.heroName.contains(heroName));
	}

}
