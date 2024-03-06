public class Main {
    public static void main(String[] args) {
        Xirurg neuroSurgeon = new Xirurg(1, "Ali", "Valiyev", (byte) 45, "ADTI", 20, 120000, "Neuro");
        neuroSurgeon.information();

        Lor lor = new Lor(1, "Ism", "Familiya", (byte) 40, "Tibbiyot oliygohi", 15, 100000);
        lor.information();

        PC acer = new PC(1, "Acer", 1000, (byte) 8, 1024, "Core i-5", "RTX 3090", "Istalgan", 27, "Mexanic", "Rog");
        System.out.println(acer.toString());


    }
}