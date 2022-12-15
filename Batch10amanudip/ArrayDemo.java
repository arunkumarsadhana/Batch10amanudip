//Find the sum and average of elements of the array
import java.util.*;
class ArrayDemo{
	public static void main(String... args){
		int arr1[] = new int[5];
		int sum=0;
		float avg;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt();
		}	
		//one more for each loop
		for(int x : arr1){
			System.out.print(x+"\t");
			sum+=x;
		}
		avg = (float)sum/arr1.length;
		System.out.println("Sum = "+sum+" Average = "+avg);
	}
}