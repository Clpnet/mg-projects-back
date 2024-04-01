package com.mgprojects.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mgprojects.models.Avenger;
import com.mgprojects.services.impl.AvengerServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin(origins = "*")
@Tag(name = "AvengerController", description = "Endpoints para la gestion de avengers")
public class AvengerController {

	@Autowired
	private AvengerServiceImpl _avengerService;

	@GetMapping("/avengers")
	@Operation(summary = "Lista", description = "Obtiene los heroes existentes")
	List<Avenger> getAll() {
		return _avengerService.getList();
	}

	@GetMapping("/avenger")
	@Operation(summary = "Unidad", description = "Obtiene el heroe de acuerdo a su identificador")
	Avenger getFindById(@RequestParam("id") int id) {
		
		System.out.println(id);
		return _avengerService.findById(id);
	}

	/*@GetMapping("/avenger/{heroName}")
	@Operation(summary = "Unidad", description = "Obtiene el heroe de acuerdo a su nombre")
	Avenger getFindById(@PathParam("heroName") String heroName) {
		return _avengerService.findByHeroName(heroName);
	}
*/
}
