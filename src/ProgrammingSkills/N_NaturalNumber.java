package ProgrammingSkills;

import java.util.Scanner;

public class N_NaturalNumber {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sn.nextInt();
		if(n>=1) {
			for(int i=0;i<=n;i++)
				System.out.println(i+" ");
		}
	}
}
