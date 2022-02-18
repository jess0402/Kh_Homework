package com.kh.mathhw;

import java.text.DecimalFormat;

public class MathStudy {

	public static void main(String[] args) {
		
		//1. 3456.5324     => 올림해서 소수점첫째자리까지 표현
		double num = 3456.5324;
		DecimalFormat df = new DecimalFormat("0.0");
		String result = df.format(Math.ceil(num*10.0)/10.0);
		System.out.println("1. " + num + " -> " + result
							+ " (올림해서 소수점 첫째자리까지 표현)");
		
		//2. 577.26784     => 반올림해서 소수점둘째자리까지 표현
		num = 577.26784;
		df = new DecimalFormat("0.00");
		result = df.format(Math.round(num*100.0)/100.0);
		System.out.println("2. " + num + " -> " + result
				+ " (반올림해서 소수점 둘째자리까지 표현)");
		
		//3. 552.2987      => 올림해서 소수점셋째자리까지 표현
		num = 552.2987;
		df = new DecimalFormat("0.000");
		result = df.format(Math.ceil(num*1000.0)/1000.0);
		System.out.println("3. " + num + " -> " + result
				+ " (올림해서 소수점 셋째자리까지 표현)");
		
		//4. -845.215      => 내림해서 소수점첫째자리까지 표현
		num = -845.215;
		df = new DecimalFormat("0.0");
		result = df.format(Math.floor(num*10.0)/10.0);
		System.out.println("4. " + num + " -> " + result
				+ " (내림해서 소수점 첫째자리까지 표현)");

		//5. 324456.24497  => 올림해서 소수점둘째자리까지 표현
		num = -845.215;
		df = new DecimalFormat("0.00");
		result = df.format(Math.floor(num*100.0)/100.0);
		System.out.println("5. " + num + " -> " + result
				+ " (내림해서 소수점 둘째자리까지 표현)");

	}

}
