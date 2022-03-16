package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonData {
	private ArrayList<Person> people;
	
	public PersonData() {
		people = new ArrayList<>();
		Person A = new Person();
		A.name = "Gabriel";
		A.age = "20";
		A.city = "Cali";
		
		Person B = new Person();
		B.name = "Gabriela";
		B.age = "21";
		B.city = "California";
		
		Person C = new Person();
		C.name = "Camilo";
		C.age = "36";
		C.city = "Buga";
		
		Person D = new Person();
		D.name = "Jessica";
		D.age = "89";
		D.city = "Bogota";
		
		Person E = new Person();
		E.name = "Esteban";
		E.age = "12";
		E.city = "Quito";
		
		Person F = new Person();
		F.name = "Juan";
		F.age = "64";
		F.city = "Venezuela";
		
		people.add(A);
		people.add(B);
		people.add(C);
		people.add(D);
		people.add(E);
		people.add(F);
	}
	
	public void print(){
		for(Person a : people) {
			System.out.println(a.name + "," + a.age + ", " + a.city);
		}
	}
	
	public void sortByName() {
		Collections.sort(people, new Comparator<Person>(){
			
			@Override
			public int compare(Person A, Person B) {
				return A.name.compareTo(B.name);
			}
		});
		
	}
	
	public void sortByAge() {
Collections.sort(people, new Comparator<Person>(){
			
			@Override
			public int compare(Person A, Person B) {
				return A.age.compareTo(B.age);
			}
		});
	}
	
	public void sortByCity() {
Collections.sort(people, new Comparator<Person>(){
			
			@Override
			public int compare(Person A, Person B) {
				return A.city.compareTo(B.city);
			}
		});
	}
}
