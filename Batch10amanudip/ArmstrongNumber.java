//write a program to check whether the number is an armstrong number or not
//9474 
//count of digits of the number -> 4
//loop and get each digit and find the power and sum
//check whether original number equal to armstrong number and print the result
//9474 -> 9^4 + 4^4 + 7^4 + 4^4 -> 6561 + 256 + 2401 + 256 -> 9474
//Math.pow(9,4)
import java.util.*;
class ArmstrongNumber{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0,onum=num,anum=0;//when it is integer division we get only quotient
		while(num!=0){//356/10 -> 35/10 -> 3/10 -> 0
			count++;//this will give the count of digits of the number
			num/=10;//num = num/10;
		}//num = 0
		System.out.println("Count = "+count);
		num = onum;
		while(num!=0){//356/10 -> 35 rem -> 6,35/10 -> 3 rem -> 5 3/10->0 rem->3
			int rem = num%10;//356%10 -> 6
			anum+=Math.pow(rem,count);//0+6^3+5^3+3^3
			num/=10;
		}
		if(anum==onum){System.out.println("IT is an Armstrong Number");}
		else{System.out.println("IT is not an Armstrong Number");}
	}
}