class Employeedetails {
    public static void main(String[] args) {
        int dept[][][]={
            {{112,1,3456},{112,2,3457},{112,3,3458}},
            {{113,1,7689},{113,2,7689},{113,3,7690}}
        };
        for(int i=0;i<dept.length;i++)
        {
            System.out.println("dept "+(i+1)+" : "+"\t");
            for(int j=0;j<dept[i].length;j++)
            {
                System.out.print("emp "+(j+1)+" : "+"\t");
                for(int k=0;k<dept[i][j].length;k++)
                {
			System.out.print(dept[i][j][k]+"\t");
		}
		System.out.println();
	   }
	   System.out.println();
	}
	}
}	