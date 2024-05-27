package DesignPatterns.Creational.AbstractFactory.Characters;

public interface CharacterFactory {
  public Character createWarrior(String name);
  public Character createMage(String name);

  public Character createRogue(String name);
}
