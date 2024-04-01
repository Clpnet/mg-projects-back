package com.mgprojects.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Avenger {

	public int id;
	public String name;
	public String heroName;
	public String skill;
	public boolean isDead;
	public double score;

	public static List<Avenger> avengeList() {

		return new ArrayList<>(List.of(new Avenger(1, "Sp", "Spiderman", "Telaraña", false, 8.5),
				new Avenger(2, "WX", "Wolverine", "Garras", false, 7.8),
				new Avenger(3, "Ir", "Iron Man", "Tecnología avanzada", true, 9.0),
				new Avenger(4, "Th", "Thor", "Control del trueno", true, 8.9),
				new Avenger(5, "Ca", "Capitán América", "Super fuerza y agilidad", true, 8.7),
				new Avenger(6, "Hk", "Hulk", "Super fuerza", false, 8.2),
				new Avenger(7, "Bw", "Black Widow", "Habilidad en combate", true, 7.6),
				new Avenger(8, "Hw", "Hawkeye", "Maestro arquero", true, 7.4),
				new Avenger(9, "Bp", "Black Panther", "Fuerza y velocidad mejoradas", true, 8.4),
				new Avenger(10, "Cp", "Capitana Marvel", "Vuelo y super fuerza", true, 8.6)));

	}

}
