package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.Characters.Character;
import DesignPatterns.Creational.AbstractFactory.Characters.CharacterFactory;
import DesignPatterns.Creational.AbstractFactory.Factions.ElfFactory;
import DesignPatterns.Creational.AbstractFactory.Factions.FactionFactory;
import DesignPatterns.Creational.AbstractFactory.Factions.HumanFactory;
import DesignPatterns.Creational.AbstractFactory.Factions.OrcFactory;

public class Main {
  public static void main(String[] args) {
    FactionFactory humanFactory = new HumanFactory();
    FactionFactory elfFactory = new ElfFactory();
    FactionFactory orcFactory = new OrcFactory();

    CharacterFactory humanCharacterFactory = humanFactory.getCharacterFactory();
    CharacterFactory elfCharacterFactory = elfFactory.getCharacterFactory();
    CharacterFactory orcCharacterFactory = orcFactory.getCharacterFactory();

    Character humanWarrior = humanCharacterFactory.createWarrior("Human Warrior");
    Character elfMage = elfCharacterFactory.createMage("Elf Mage");
    Character orcRogue = orcCharacterFactory.createRogue("Orc Rogue");

    // Use characters as needed
    humanWarrior.attack();
    elfMage.attack();
    orcRogue.attack();


    // I am not happy with this implementation. I think there is too much coupling between CharacterFactory and FactionFactory
  }
}
