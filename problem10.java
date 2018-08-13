public class problem10
{
    public static void main(String args[])
    {
        int i =0;
      int num =0,sum=0;
      int n = 20000000;
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    sum = sum +i;
	 }	
      }	
      System.out.println(sum);
   }
}
