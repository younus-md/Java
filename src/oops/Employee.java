package oops;

public class Employee {
	String str = "Welcome Raj to Java";

	static void add(String s, Object o) {
		System.out.println("Using newInstance()--");
	}
	static void add(Object so) {
		System.out.println("In Object--");
	}
	static void add(String so) {
		System.out.println("In String-");
	}
	
	

	// 5 ways to create object
	static public void main(String[] args) {
		Employee e = new Employee();
		System.out.println("common way of creating object--" + e.str);
		try {
			Employee emp = Employee.class.newInstance();
			System.out.println("Using newInstance()--" + emp.str);
			emp.add("ABC", "ABC");
			emp.add(null);
		} catch (InstantiationException | IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Account account = new Account();
		account.setName("Raj");
		account.setAcctBal("200000");
		System.out.println("act details--" + account.getAcctBal());
		account.setAcctBal("600000");
		System.out.println("act details--" + account.getAcctBal());
		// account.acctBal = "8989";
		System.out.println("act details after update--" + account.getAcctBal());

	}
}
