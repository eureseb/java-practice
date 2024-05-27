package DesignPatterns.Creational.AbstractFactory.Factions;

import DesignPatterns.Creational.AbstractFactory.Characters.Warrior;

public class Human implements Faction{
  private final String name;

  public Human(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}
