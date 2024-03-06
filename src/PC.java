public class PC extends Computers {
    String monitor;
    int displaySize;
    String keyboard;
    String mouse;

    public PC(int id, String brand, int price, byte RAM, int memory, String CPU, String GPU, String monitor, int displaySize, String keyboard, String mouse) {
        super(id, brand, price, RAM, memory, CPU, GPU);
        this.monitor = monitor;
        this.displaySize = displaySize;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor='" + monitor + '\'' +
                ", displaySize=" + displaySize +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", RAM=" + RAM +
                ", memory=" + memory +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
