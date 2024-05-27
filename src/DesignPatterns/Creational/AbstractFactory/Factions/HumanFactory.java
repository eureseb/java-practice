package DesignPatterns.Creational.AbstractFactory.Factions;

import DesignPatterns.Creational.AbstractFactory.Characters.Character;
import DesignPatterns.Creational.AbstractFactory.Characters.CharacterFactory;
import DesignPatterns.Creational.AbstractFactory.Characters.Mage;
import DesignPatterns.Creational.AbstractFactory.Characters.Rogue;
import DesignPatterns.Creational.AbstractFactory.Characters.Warrior;

public class HumanFactory implements FactionFactory{
  @Override
  public CharacterFactory getCharacterFactory() {
    return new CharacterFactory() {
      @Override
      public Character createWarrior(String name) {
        return new Warrior(name);
      }

      @Override
      public Character createMage(String name) {
        return new Mage(name);
      }

      @Override
      public Character createRogue(String name) {
        return new Rogue(name);
      }
    };
  }
}
