package ProgrammingSkills;

import java.util.Scanner;

public class QuotientWithoutPlusOperator {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter two numnber : ");
		int a=sn.nextInt();
		int b=sn.nextInt();
		int quotient=0;
		while(a>b) {
			a=a-b;
			quotient++;
	}
		System.out.println("Quotient is "+quotient);

	}

}
