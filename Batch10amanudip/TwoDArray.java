class TwoDArray{
	public static void main(String... args){
		int[] arr1[]=new int[3][4];
		int arr2[][] = new int[3][];	
		int arr3[][];
		int arr4[][] = {
					{10,20},
					{40,50,60,80},
					{70,80,90}
                               };
		for(int i=0;i<arr4.length;i++){//rows
			for(int j=0;j<arr4[i].length;j++){//columns
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println();
		}
	}
}