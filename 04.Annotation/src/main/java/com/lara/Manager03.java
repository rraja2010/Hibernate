package com.lara;

import java.util.List;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Person> list = s1.getNamedQuery("q2").setInteger("param1", 10).list();

		for (Person obj : list) {
			System.out.println(obj.getId());
			System.out.println(obj.getFirstname());
			System.out.println(obj.getLastname());
			System.out.println(obj.getAge());
			System.out.println(obj.getMarks());
			System.out.println(obj.getAddress());
			System.out.println(".............");
		}
		System.out.println("done");
		System.exit(0);
	}
}
