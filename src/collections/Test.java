package collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
//using retain all
	public static void main(String[] args) {
		List<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp(1, "sree"));
		emp.add(new Emp(2, "sree1"));
		emp.add(new Emp(3, "sree2"));
		emp.add(new Emp(4, "sree3"));
		emp.add(new Emp(5, "sree4"));
		// emp.add(new emp(6,"sree8"));
		List<Emp> emp1 = new ArrayList<Emp>();
		emp1.add(new Emp(1, "sree"));
		emp1.add(new Emp(2, "sree1"));
		emp1.add(new Emp(3, "sree2"));
		emp1.add(new Emp(4, "sree3"));
		emp1.add(new Emp(7, "sree4"));

		System.out.println("v1--" + emp.equals(emp1));
		System.out.println("v2--" + emp.retainAll(emp1));

		boolean flag = false;
		for (Emp user1 : emp) {
			for (Emp user2 : emp1) {
				if (!user1.getName().equals(user2.getName())) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}

		System.out.println("Emp Flag Value--" + flag);
	}

}
