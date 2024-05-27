package DesignPatterns.Creational.Builder;

public class ComputerBuilderV2 {
  private String cpu;
  private String gpu;
  private String ram;
  private String storage;

  public ComputerBuilderV2 withCPU(String cpu){
    this.cpu = cpu;
    return this;
  }
  public ComputerBuilderV2 withGPU(String gpu){
    this.gpu = gpu;
    return this;
  }
  public ComputerBuilderV2 withRAM(String ram){
    this.ram = ram;
    return this;
  }
  public ComputerBuilderV2 withStorage(String storage){
    this.storage = storage;
    return this;
  }

  public Computer build(){
    return new Computer(this.cpu, this.gpu, this.ram, this.storage);
  }
}
