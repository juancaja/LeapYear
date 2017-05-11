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

	@Test
	public void shouldWorkWith100() throws Exception {
		assertThat(LeapYear.isLeapYear(100), is(false));
	}

	@Test
	public void shouldWorkWith2000() throws Exception {
		assertThat(LeapYear.isLeapYear(2000), is(true));
	}

	@Test
	public void shouldWorkWith400() throws Exception {
		assertThat(LeapYear.isLeapYear(400), is(true));
	}

}