package my.hello.git;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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

	// String newstring = new SimpleDateFormat("dd/MM/yyyy").format(date);
	// System.out.println(newstring); // 2011-01-18
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthdate=" + getAgeFormatter(age)
				+ " age=" + getAge(age) + ", ID=" + ID + "]";
	}

	private String getAgeFormatter(Date age) {
		return new SimpleDateFormat("dd/MM/yyyy").format(age);

	}

	public static int getAge(Date dateOfBirth) {

		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;

		birthDate.setTime(dateOfBirth);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}

		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		return age;
	}
}
