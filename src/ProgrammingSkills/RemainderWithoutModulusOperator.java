package ProgrammingSkills;

import java.util.Scanner;

public class RemainderWithoutModulusOperator {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a and b Value : ");
		int a=sn.nextInt();
		int b=sn.nextInt();
		int rem=a-(a/b)*b;
		System.out.println("Remainder "+rem);

	}

}
