package DesignPatterns.Creational.AbstractFactory.Characters;

public interface CharacterFactory {
  Character createWarrior(String name);
  Character createMage(String name);
  Character createRogue(String name);

}
