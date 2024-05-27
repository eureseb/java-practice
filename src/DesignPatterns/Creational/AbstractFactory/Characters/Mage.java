package DesignPatterns.Creational.AbstractFactory.Characters;

public class Mage implements Character{
  private final String name;

  public Mage(String name){
    this.name =  name;
  }
  public void useAbility(){
    System.out.println(name + " casted a fire storm!");
  }
  public void attack(){
    System.out.println(name + " swung its staff!");
  }
}
