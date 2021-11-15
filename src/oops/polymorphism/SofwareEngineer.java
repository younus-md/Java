package oops.polymorphism;

import java.io.IOException;

public class SofwareEngineer extends Person {
	@Override
	public void eat() {
		System.out.println("A software Engineer mostly eat Pizza");
		// super.eat();
	}

	@Override
	public void drink() {
		super.drink();
	}

	// cant override private method but can have same method
	private void work() {
		System.out.println("A Se has to code for his bread");
	}

	static void roam() {
		System.out.println("A Se has roam on weekends");
	}

	void add(String i) {
		System.out.println("Child i");

	}
}
