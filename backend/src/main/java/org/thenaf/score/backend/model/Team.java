package org.thenaf.score.backend.model;

import lombok.Getter;

public enum Team {

	WOOD_ELVES("Wood Elves", "we"),
	HIGH_ELVES("High Elves", "he"),
	ELVES("Elves", "el"),
	DARK_ELVES("Dark Elves", "de"),
	OGRES("Ogres", "og"),
	GOBLINS("Goblins", "go"),
	HALFLINGS("Halflings", "ha"),
	LIZARDMEN("Lizardmen", "li"),
	CHAOS("Chaos", "ch"),
	CHAOS_PACT("Chaos Pact", "cp"),
	CHAOS_DWARVES("Chaos Dwarves", "cd"),
	NURGLE("Nurgle", "nu"),
	UNDERWORLD("Underworld", "uw"),
	SKAVEN("Skaven", "sk"),
	VAMPIRES("Vampires", "va"),
	DWARVES("Dwarves", "dw"),
	UNDEAD("Undead", "un"),
	NECROMANTIC("Necromantic", "ne"),
	KHEMRI("Khemri", "kh"),
	AMAZONS("Amazons", "am"),
	HUMANS("Humans", "hu"),
	ORCS("Orcs", "or"),
	SLANN("Slann", "sl");
	
	@Getter
	private final String name;

	@Getter
	private final String acronymn;
	
	Team(String name, String acronym){
		this.name = name;
		this.acronymn = acronym;
	}
}
