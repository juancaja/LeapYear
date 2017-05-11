package com.minikata;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LeapYearTest {
	@Test
	public void shouldWorkWithFour() throws Exception {
		assertThat(LeapYear.isLeapYear(4), is(true));
	}

	@Test
	public void shouldWorkWithThree() throws Exception {
		assertThat(LeapYear.isLeapYear(3), is(false));
	}

}