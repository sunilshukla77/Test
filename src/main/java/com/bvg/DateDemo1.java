package com.bvg;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo1 {

	public static void main(String[] args) {
		// Instantiate a Date object
		Date date = new Date() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public String toString() {
				return "Todays date is " + super.toString();
			}
		};
		// display time and date using toString()
		String str = String.format("Current Date/Time : %tc", date);

		System.out.printf(str);

		System.out.printf("\n \t %1$s %2$tB %2$td, %2$tY", "Due date:", date);
		System.out.println("\n\n\t\t" + date.toString());
		Date today = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd");

		System.out.println(ft.format(today));

	}
}
