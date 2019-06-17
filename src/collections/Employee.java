package collections;

public class Employee implements Comparable<Employee> {
    int age;
    String name;

    Employee(int age, String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    public int compareTo(Employee o) {
        if (age == o.age)
            return 0;
        else if (age < o.age)
            return -1;

        else
            return 1;
    }
}
