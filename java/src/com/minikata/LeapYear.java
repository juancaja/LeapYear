package com.minikata;

public final class LeapYear {

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;

		if (year % 4 == 0) { // year is divisible by 4
			if (year % 100 == 0) { // year is divisible by 100
				isLeapYear = false;
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}

		return isLeapYear;
	}

}
