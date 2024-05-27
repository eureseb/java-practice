package DesignPatterns.Creational.Builder;

public class Computer {
  private String CPU;
  private String GPU;
  private String RAM;
  private String Storage;

  public Computer(){}

  public Computer(String cpu, String gpu, String ram, String storage) {
    this.CPU = cpu;
    this.GPU = gpu;
    this.RAM = ram;
    this.Storage = storage;
  }

  public void displaySpecs(){
    System.out.println("Computer Details:");
    if(this.CPU != null)System.out.println("CPU: " + this.CPU);
    if(this.GPU != null)System.out.println("GPU: " + this.GPU);
    if(this.RAM != null) System.out.println("RAM: " + this.RAM);
    if(this.Storage != null) System.out.println("Storage: " + this.Storage);
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public void setGPU(String GPU) {
    this.GPU = GPU;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public void setStorage(String storage) {
    Storage = storage;
  }
}
