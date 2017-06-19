package info;

import java.io.Serializable;

public class Time implements Serializable {
	
	/**
	 * 1 : 월요일
	 * 2 : 화요일
	 * 3 : 수요일
	 * 4 : 목요일
	 * 5 : 금요일
	 * 6 : 토요일
	 * 7 : 일요일
	 */
	private int day;
	private String start;
	private String end;
	
	public Time(int d, String s, String e) {
		day = d;
		start = s;
		end = e;
	}
}
