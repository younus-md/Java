package java8;

public class SoftwareEngineer {
	int salary;
	String name;
	String lastName;

	SoftwareEngineer(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	public SoftwareEngineer(int salary, String name, String lastName) {
		super();
		this.salary = salary;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [salary=" + salary + ", name=" + name + ", lastName=" + lastName + "]";
	}

}
