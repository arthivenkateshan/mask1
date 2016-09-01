package lb10;

import java.util.Scanner;

public class primeOccurance {

	public static void main(String[] args) 
    { int c=0;
		int a=0;
		int k=0;
		int b[]=new int [50];
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	for(int i=n2;i<=n3;i++)
	{
		for(int j=2;j<i/2;j++)
		{ a=1;
		  if(i%j==0)
			{  a=0;
				break;
			}
			
		}
		if(a==1)
		{
			b[k]=i;
			k++;
		}
	}
	
	for(int i=0;i<b.length;i++)
	{
		int n=b[i];
		while(n!=0)
		{
			int m=n%10;
			if(m==n1)
			{
			  c++;
				
			}
			n=n/10;
		}
	}

	System.out.println(c);
	}

}
