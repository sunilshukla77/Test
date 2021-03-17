package com.bvg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {

		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

		String input = args.length == 0 ? "1990-03-21" : args[0];

		System.out.println(input + " Parses as ");

		java.util.Date t;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Name is: " + name);
		in.close();

		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
		}

	}

}
