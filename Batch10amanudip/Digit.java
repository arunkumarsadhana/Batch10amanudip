//Write a program to get addition and product of digits of the number
//9474 -> 9 + 4 + 7 + 4 -> 24
//9474 -> 9 * 4 * 7 * 4 -> 1008
import java.util.*;
class Digit{
        public static void main(String[] args)
       {
            Scanner in=new Scanner (System.in);
            int num=in.nextInt();
            int sum=0,mul=1;
            while(num>0)
            {
              int rem=num%10;
              sum+=rem;
              mul*=rem;
              num/=10;
              }
              System.out.println("sum:"+sum);
	      System.out.println("mul:"+mul);       
        }
}
//find reverse of a number
//I/P -> 367 O/P -> 763