package DesignPatterns.Creational.Builder;

public interface ComputerBuilder {
  Computer build();
  void addCPU(String cpu);
  void addGPU(String gpu);
  void addRAM(String ram);
  void addStorage(String storage);

}
