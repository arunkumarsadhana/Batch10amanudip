//There are 3 students 1st student with 3 subjects,2nd student with 4 subjects,3rd student with 2 subjects intialize the 
//array and display the each student subject mark
import java.util.*;
class JaggedStudent{
	public static void main(String... args){
		int[] arr[]=new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
				System.out.println("Input Student "+(i+1)+" Marks :"); 
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
				System.out.print("Student "+(i+1)+" Marks :"); 
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}