package DesignPatterns.Creational.Builder;

public class GamingComputerBuilder implements ComputerBuilder{
  private final Computer computer;
  public GamingComputerBuilder(){
    this.computer = new Computer();
  }

  public void addCPU(String cpu){
    computer.setCPU(cpu);
  }
  public void addGPU(String gpu){
    computer.setGPU(gpu);
  }
  public void addRAM(String ram){
    computer.setRAM(ram);
  }
  public void addStorage(String storage){
    computer.setStorage(storage);
  }

  public Computer build(){
    return this.computer;
  }
}
