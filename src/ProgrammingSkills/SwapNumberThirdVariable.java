package ProgrammingSkills;

import java.util.Scanner;

public class SwapNumberThirdVariable {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int b=sn.nextInt();
		System.out.println("Before Swap\na="+a+"\nb="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap\na="+a+"b"+b);
	}
}
