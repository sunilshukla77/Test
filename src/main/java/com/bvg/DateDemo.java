package com.bvg;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo {

	public static void main(String[] args) {

		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

		String input = args.length == 0 ? "1993-01-15" : args[0];

		System.out.println(input + " Parses as ");

		java.util.Date t;

		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
		}

	}

}
