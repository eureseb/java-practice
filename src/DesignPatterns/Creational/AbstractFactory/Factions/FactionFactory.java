package DesignPatterns.Creational.AbstractFactory.Factions;

import DesignPatterns.Creational.AbstractFactory.Characters.Character;
import DesignPatterns.Creational.AbstractFactory.Characters.CharacterFactory;

public interface FactionFactory {
  CharacterFactory getCharacterFactory();
}
