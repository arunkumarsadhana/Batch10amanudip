class ThreeDArray{
	public static void main(String... args){
		int[][] arr[] = {
					{{1,2,3,4},{5,6,7,8}},
					{{9,10,11,12},{13,14,15,17}},
					{{18,19,20,21},{22}}	
                                };
		for(int i=0;i<arr.length;i++){//rows
			for(int j=0;j<arr[i].length;j++){//column
				for(int k=0;k<arr[i][j].length;k++){//element
					System.out.print(arr[i][j][k]+"\t");
				     }
				System.out.println();
			     }
			System.out.println();
  		     }
	}
}
//arr[2][3] -> no of elments = 2*3 = 6 elements
//arr[3][4][2] -> no of elements = 3*4*2 = 24 elements