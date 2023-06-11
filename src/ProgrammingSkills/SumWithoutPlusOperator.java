package ProgrammingSkills;

import java.util.*;

public class SumWithoutPlusOperator {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the numbers to be added ");
		int a=sn.nextInt();
		int b=sn.nextInt();
		int c;
		while(b>0) {
			c = a & b;
			a=a^b;
			b=c<<1;
		}
		System.out.println("Sum is "+a);
	}
}
