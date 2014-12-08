package my.hello.git;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("A", birthdate("25.02.1986"), "100");
		System.out.println(p1);
	}

	private static Date birthdate(String birthdate) {// throws Exception {
		String dateFormat = "dd.MM.yyyy";
		try {
			return new SimpleDateFormat(dateFormat).parse(birthdate);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
