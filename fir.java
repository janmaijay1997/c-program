class Fir
{

public static void main(String args[])
	{
			int i=1,d,co=0,sum=0,rev,n,v=0;
			String s1;
			while(co<40)		
			{
					s1=i+"";
					n=i;
					//System.out.println("string"   +s1);
					d=s1.length();
					//System.out.println("length"   +d);
					while(i>0)
					{
						rev=i%10;
						sum=sum+(int)Math.pow(rev,d);
						i=i/10;
						
						
					}
					
					
					
					
					
					if(sum==n)
					{
						
						System.out.println(v+"    "+n);
						v++;
					co++;
					}
					
					++n;
					i=n;
					sum=0;
							
					//System.out.println("length of co "+co);
					
					
				
				
			}
			
			
	
}

}


