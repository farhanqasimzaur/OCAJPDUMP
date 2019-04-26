package src.main;

import java.time.LocalDate;

public class Q1 {

	/**
	 * @param args
	 * Given the code fragment:
	 * What is the result?
	 * (A) 2012-02-10
	 * (B) 2012-02-11
	 * (C) Compilation Fails
	 * (D) A date time exception is thrown?
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 01, 32);
		date.plusDays(10);
		System.out.println(date);
	}

}
