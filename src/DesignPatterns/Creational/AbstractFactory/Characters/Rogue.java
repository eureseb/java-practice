package DesignPatterns.Creational.AbstractFactory.Characters;

public class Rogue implements Character{
  private final String name;

  public Rogue(String name){
    this.name =  name;
  }
  public void useAbility(){
    System.out.println(name + " did a blade toss!");
  }
  public void attack(){
    System.out.println(name + " threw a flurry of attacks!");
  }
}
