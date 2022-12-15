//Linear search algorithm
//sorting algorithm -> Bubble sort algorithm
import java.util.*;
class ArrayLS{
	public static void main(String... args){
		int arr[]={12,17,24,57,36,39};
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the element to search : ");
		int se = sc.nextInt();
		for(;i<arr.length;i++){
			if(arr[i]==se){System.out.println("Element Found at Location : "+(i+1));break;}
		}
		if(i==arr.length){System.out.println("Element not Found");}
	}
}
