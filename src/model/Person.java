package model;

public class Person {
	public String name;
	public String age;
	public String city;
	
	public void setOnClick(Clickeable c) {
		c.onClick("a", "b");
	}
}
