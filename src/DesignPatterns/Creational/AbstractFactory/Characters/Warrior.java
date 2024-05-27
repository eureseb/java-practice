package DesignPatterns.Creational.AbstractFactory.Characters;

import DesignPatterns.Creational.AbstractFactory.Characters.Character;

public class Warrior implements Character {
  private final String name;

  public Warrior(String name){
    this.name =  name;
  }
  public void useAbility(){
    System.out.println(name + " thrusted it's shield!");
  }
  public void attack(){
    System.out.println(name + " swung it's sword!");
  }
}
