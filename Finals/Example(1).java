package Finals;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b=1;
		Scanner s=new Scanner(System.in);
		System.out.print("please enter a number: ");
		a=s.nextInt();
		for(int j=0;j<a;j++)
		{
		for(int i=0;i<=j;i++)
		{
			System.out.print(b+" ");
			b++;
		}
		System.out.println(" ");
		}
	}
}

