public class Laptop extends Computers {
    int displaySize;
    byte weight;
    int batteryCapasity;

    public Laptop(int id, String brand, int price, byte RAM, int memory, String CPU, String GPU, int displaySize, byte weight, int batteryCapasity) {
        super(id, brand, price, RAM, memory, CPU, GPU);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryCapasity = batteryCapasity;
    }
}
