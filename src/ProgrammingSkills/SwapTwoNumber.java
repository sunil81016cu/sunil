package ProgrammingSkills;
import java.util.*;
public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a and b Values : ");
		int a=sn.nextInt();
		int b=sn.nextInt();
		System.out.println("Before swap\na="+a+"\nb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap\na="+a+"\nb="+b);
	}
}
