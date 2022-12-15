//Input is a string convert to char array and print the position of o in the string
class StringDemo2{
	public static void main(String... args){
		String str = "I am learning Core Java Now";
		String strArr[] = str.split(" ");
		for(String st:strArr){
			System.out.println(st);
		}
		String str1 = "I Arun am part of anudip";
		String strStr1Arr[] = str1.split(" ",2);
		for(String st1:strStr1Arr){
			System.out.println(st1);
		}
		
		System.out.println(str.replace('o','e'));
	}
}
//indexOf('o');