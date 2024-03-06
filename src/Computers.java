public class Computers extends Electronics {
    byte RAM;
    int memory;
    String CPU;
    String GPU;

    public Computers(int id, String brand, int price, byte RAM, int memory, String CPU, String GPU) {
        super(id, brand, price);
        this.RAM = RAM;
        this.memory = memory;
        this.CPU = CPU;
        this.GPU = GPU;
    }
}
