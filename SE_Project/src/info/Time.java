package info;

import java.io.Serializable;

public class Time implements Serializable {
	
	/**
	 * 1 : ������
	 * 2 : ȭ����
	 * 3 : ������
	 * 4 : �����
	 * 5 : �ݿ���
	 * 6 : �����
	 * 7 : �Ͽ���
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
