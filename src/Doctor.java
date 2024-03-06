public class Doctor {
    int id;
    String firstName;
    String lastName;
    byte age;
    String collage;
    int experienceYear;
    int salary;

    public Doctor() {
    }

    public Doctor(int id, String firstName, String lastName, byte age, String collage, int experienceYear, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.collage = collage;
        this.experienceYear = experienceYear;
        this.salary = salary;
    }
}
