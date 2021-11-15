package oops.polymorphism;

import java.io.IOException;

public class Person {
	public void eat() throws NullPointerException {
		System.out.println("A Person can eat anything which is eatable except other Person's head");
	}

	public void drink() {
		System.out.println("A person has a choice to drink soft/hard drinks");
	}

	private void work() {
		System.out.println("A Person has to work to earn his bread");
	}

	static void roam() {
		System.out.println("A Person can roam");
	}

	void add(int i) {
		System.out.println("i");

	}
}
