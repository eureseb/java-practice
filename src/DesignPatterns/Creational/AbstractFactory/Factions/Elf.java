package DesignPatterns.Creational.AbstractFactory.Factions;

public class Elf implements Faction{

  private final String name;

  public Elf(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}
