package main;

import model.Clickeable;
import model.Person;
import model.PersonData;

public class Main {
	public static void main(String [] args) {
		Person p = new Person();
		//
		Clickeable c = (a,b) -> {
			System.out.println("Este es un nuevo mensaje declarado" + a + " " + b);
		};
		p.setOnClick(c);
		
		PersonData data = new PersonData();
		data.print();
		System.out.println("-----");
		data.sortByName();	
		data.print();
		System.out.println("-----");
		data.sortByAge();
		data.print();
		System.out.println("-----");
		data.sortByCity();
		data.print();
		System.out.println("-----");
	}
	
	
	
}
