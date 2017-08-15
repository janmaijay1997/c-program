
import java.util.Scanner;
 class A
 {
public static void main(String args[])
{
	int a []=new int[100];
	int b[]=new int[100];
	int n,j,k,c=0,i;
	
	Scanner Sc =new Scanner(System.in);
	
	n=Sc.nextInt();
	
	for(i=0;i<n;i++)
	{
		a[i]=Sc.nextInt();
		k=a[i];
		
		b[i]=fg(k);
		
		
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(b[i]>b[j])
			{
			c++;
			
			}
		}
	}
	System.out.println(c);
}

	public static int fg(int num)
	  {
	int t=0;
	   while(num>0)
	  {
	  t+=num%6;

	   num=num/6;
	   }
	   return t;



	}
 }
