import java.io.*;
public class problem1
{
    int sum=0;
    int multiple(int n , int check)
    {
        for(int i = check; i<n; i++)
        {
            if(i%check==0)
            {
            sum=sum+i; 
           // System.out.print(i+" , ");
           //k System.out.println(sum+" , ");
            }
        }
       return sum;
    }
   public static void main(String args[]) throws IOException
   {
       BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the number below which you would like to find the sum of multiples of 3 & 5 :");
       int num=Integer.parseInt(buff.readLine());
       problem1 obj = new problem1();
       int sum3 = obj.multiple(num,3);
       int sum5 = obj.multiple(num,5);
       System.out.println("The sum of multiple of 3 and 5 below "+num+" is "+sum5);
    }
}
