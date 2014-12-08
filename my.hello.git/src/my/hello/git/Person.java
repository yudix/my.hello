package my.hello.git;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Date age;
	private String ID;

	public Person() {
		super();
	}

	public Person(String name, Date age, String iD) {
		super();
		this.name = name;
		this.age = age;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public Date getAge() {
		return age;
	}

	public String getID() {
		return ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public void setID(String iD) {
		ID = iD;
	}
//	String newstring = new SimpleDateFormat("dd/MM/yyyy").format(date);
//	System.out.println(newstring); // 2011-01-18
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + getAgeFormatter(age) + ", ID=" + ID + "]";
	}

private String getAgeFormatter(Date age) {
	 return new SimpleDateFormat("dd/MM/yyyy").format(age);
	 
}
}
