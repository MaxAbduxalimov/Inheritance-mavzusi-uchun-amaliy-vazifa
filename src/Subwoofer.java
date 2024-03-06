public class Subwoofer extends Sounds {
    String typeOfSubwoofer;
    byte weight;

    public Subwoofer(int id, String brand, int price, int chastota, int volume, String typeOfSubwoofer, byte weight) {
        super(id, brand, price, chastota, volume);
        this.typeOfSubwoofer = typeOfSubwoofer;
        this.weight = weight;
    }
}
