import java.util.*;
class JaggedArray{
	public static void main(String... args){
		int[] arr[]=new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the array elements");
		for(int i=0;i<arr.length;i++){//this will give row size
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("-------------DISPLAYING ARRAY ELEMENTS--------------");
		for(int i=0;i<arr.length;i++){//this will give row size
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}