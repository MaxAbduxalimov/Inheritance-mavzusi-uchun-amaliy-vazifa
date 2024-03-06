public class Lor extends Doctor {
    int bonus = (int) (salary * 1.5);


    public Lor(int id, String firstName, String lastName, byte age, String collage, int experienceYear, int salary) {
        super(id, firstName, lastName, age, collage, experienceYear, salary);
        this.bonus = bonus;
    }

    public void information() {
        System.out.println(firstName + " " + lastName + "\nYoshi: " + age + "\nTamomlagan ta'lim muassasasi: "
                + collage + "\nIsh tajribasi: " + experienceYear + "\nMaoshi: " + salary + "\nBonus: " +
                +bonus);
    }


}
