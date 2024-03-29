import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        // Create instances of employees and students
        Employee employee1 = new Employee("Aibek", "Orazov", "Doctor", 885262.0);
        Employee employee2 = new Employee("Kane", "Harry", "Footballer", 31800.0);

        Student student1 = new Student("Lionel", "Messi", 2.08);
        Student student2 = new Student("Wane", "Rooney", 3.65);

        peopleList.add(employee1);
        peopleList.add(employee2);
        peopleList.add(student1);
        peopleList.add(student2);


        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            if (person instanceof Payable) {
                Payable payablePerson = (Payable) person;
                System.out.printf("%s earns %.2f tenge%n", person, payablePerson.getPaymentAmount());
            }
        }
    }
}
