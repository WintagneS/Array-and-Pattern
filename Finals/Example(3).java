package Finals;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("Please enter a number: ");
		a=s.nextInt();
		for(int b=0;b<a;b++)
		System.out.println(Numbers(b));
		}
	
	
	
	public static int Numbers(int n1)
	{
			if(n1==0 || n1==1)
			{
				return 1;
			}
			if(n1%2==0)
				return Numbers(n1-1)+Numbers(n1-2)+1;
			else
				return Numbers(n1-1)+Numbers(n1-2);
	}
}
