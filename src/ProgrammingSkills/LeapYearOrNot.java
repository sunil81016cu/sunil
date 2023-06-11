package ProgrammingSkills;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year=sn.nextInt();
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		System.out.println("Year " +year+ " is a leap Year");
		else
		System.out.println("Year " +year+ " is not leap year");
	}
}
