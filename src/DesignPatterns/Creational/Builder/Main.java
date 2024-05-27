package DesignPatterns.Creational.Builder;

public class Main {
  public static void main(String[] args) {
    ComputerBuilder builder = new GamingComputerBuilder();
    builder.addCPU("Intel i7");
    builder.addGPU("NVIDIA RTX 4070 Ti");
    builder.addRAM("16GB DDR5");
    builder.addStorage("1TB M.2 SSD");
    Computer gamingComputer = builder.build();

    Computer officePC = new ComputerBuilderV2()
                              .withCPU("AMD Ryzen 5")
                              .withGPU("NVIDIA RTX 4060")
                              .withRAM("16GB DDR4").build();

    officePC.displaySpecs();
    System.out.println("\n");
    gamingComputer.displaySpecs();

  }
}
