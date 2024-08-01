package Finals;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dizi[] = {2,0,5,0,0,7,14,0,21};
		
		int b=0;
		for(int a=0;a<9;a++)
		{
			if(dizi[a]==0)
			{
				b++;
			}
			else
			{
				System.out.print(dizi[a]+" ");
			}
		}
		for(int c=0;c<b;c++)
		{
			System.out.print("0 ");
		}
		}
		
	}


