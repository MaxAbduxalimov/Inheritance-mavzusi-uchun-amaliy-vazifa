public class Sounds extends Electronics {
    int frequencies;
    int volume;


    public Sounds(int id, String brand, int price, int chastota, int volume) {
        super(id, brand, price);
        this.frequencies = chastota;
        this.volume = volume;
    }
}
