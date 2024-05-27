package DesignPatterns.Creational.AbstractFactory.Factions;

public class Orc implements Faction{
  private final String name;

  public Orc(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}
