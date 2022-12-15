import java.util.*;
class StudentAverage{
	public static void main(String... args){
		int subj[]=new int[6];
		int total=0;
		float average;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<subj.length;i++){
			System.out.print("Input Subject "+(i+1)+" Marks : ");
			subj[i] = sc.nextInt();
			total+=subj[i];
			System.out.println();
		}
		average = (float)total/subj.length;
		System.out.println("Total = "+total+" Average = "+average);
	}
}