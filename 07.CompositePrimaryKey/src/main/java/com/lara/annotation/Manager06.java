package com.lara.annotation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Manager06 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		// ctr.add(Restrictions.like("pk.firstName", "_n%"));
		ctr.add(Restrictions.like("pk.firstName", "s%"));
		ctr.add(Restrictions.gt("age", 15));

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getPk().getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getPk().getEmail());
			System.out.println(p1.getAge());
			System.out.println(p1.getClass());
			System.out.println("...................");
		}
		System.out.println("done");

	}
}
