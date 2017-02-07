/**
 * 
 */
package edu.miamioh.bergmahb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author bergmahb Class to make Person objects which have an instance variable
 *         of a name
 */
public class Person implements Comparable<Object> {
	String name = "";

	/**
	 * Constructor for Person
	 * 
	 * @param name
	 *            The name of the Person
	 */
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Person person1 = new Person("Harrison");
		Person person2 = new Person("Bergman");

		ArrayList<Person> people = new ArrayList<Person>();
		Scanner in = new Scanner(System.in);

		for (int a = 0; a < 10; a++) {
			System.out.println("Please add a name to the list below");
			String str = in.next();
			Person person = new Person(str);
			people.add(person);
		}

		sort(people);

		in.close();
		System.out.println((people.get(0)).getName());
		System.out.println((people.get(9)).getName());
	}

	@Override
	public int compareTo(Object p) {

		if ((this.name).equals((Person) p)) {
			return 0;
		} else
			return -1;

	}

	public static void sort(ArrayList<Person> o) {
		for (int q = 0; q < o.size(); q++) {
			for (int l = q + 1; l < o.size(); l++) {
				if (o.get(q).compareTo(o.get(l)) > 0) {
					String temp = o.get(l).getName();
					o.get(l).setName(o.get(q).getName());
					o.get(q).setName(temp);
				}

			}

		}
	}

}
