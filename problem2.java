import java.io.*;
public class problem2
{
    public static void main(String args[]) throws IOException
    {
        long num1=0,num2=1,temp,sum=0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number till which you want to get the sum : ");
        long num = Long.parseLong(buff.readLine());
        while(num2<num)
        {
          temp=num2;
          num2=num1+num2;
          num1=temp;
          //System.out.print(num2+" , ");
          if(num2%2==0)
          {
              sum=sum+num2;
            }
        }
        System.out.print("The sum of even numbers of the fibonacci series is : "+sum);
    }
}