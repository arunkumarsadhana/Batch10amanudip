//Linear search algorithm
//sorting algorithm -> Bubble sort algorithm
import java.util.*;
class BubbleSort{
	public static void main(String... args){
		int arr[]={12,14,13,15,11,16};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
					if(arr[j]<arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
		}
		for(int x:arr){
			System.out.print(x+"\t");
		}
	}
}
