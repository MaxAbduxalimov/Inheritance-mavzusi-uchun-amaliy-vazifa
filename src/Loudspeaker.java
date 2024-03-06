public class Loudspeaker extends Sounds {
    String typesOfLoudspeaker;

    public Loudspeaker(int id, String brand, int price, int chastota, int volume, String typesOfLoudspeaker) {
        super(id, brand, price, chastota, volume);
        this.typesOfLoudspeaker = typesOfLoudspeaker;
    }
}
