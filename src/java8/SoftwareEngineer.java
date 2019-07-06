package java8;

public class SoftwareEngineer {
    int salary;
    String name;

    SoftwareEngineer(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
