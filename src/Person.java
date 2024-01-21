public class Person implements Payable {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Person";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public double getPaymentAmount(){
        return 0.0;
    }
}