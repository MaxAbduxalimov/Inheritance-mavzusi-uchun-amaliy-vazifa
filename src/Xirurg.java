public class Xirurg extends Doctor {
    int bonus = salary * 2;
    String typeOfSurgery;


    public Xirurg(int id, String firstName, String lastName, byte age, String collage, int experienceYear, int salary, String typeOfSurgery) {
        super(id, firstName, lastName, age, collage, experienceYear, salary);
        this.bonus = bonus;
        this.typeOfSurgery = typeOfSurgery;
    }

    public void information() {
        System.out.println(firstName + " " + lastName + "\nYoshi: " + age + "\nTamomlagan ta'lim muassasasi: "
                + collage + "\nIsh tajribasi: " + experienceYear + "\nMaoshi: " + salary + "\nBonus: " +
                +bonus + "\nJarrohlik yo'nalishi: " + typeOfSurgery);
    }
}
