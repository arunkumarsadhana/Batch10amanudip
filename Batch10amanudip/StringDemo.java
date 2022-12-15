//String index also starts with 0
class StringDemo{
	public static void main(String... args){
		String str1 = "     Using String Literal     ";
		String str2 = new String("Using New Keyword New");
		char arr[]={'U','s','i','n','g',' ','c','h','a','r',' ','a','r','a','a','y'};
		String str3 = new String(arr);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1.length());
		System.out.println(str1.isEmpty());
		System.out.println(str1.trim());
		System.out.println(str1.trim().toUpperCase());
		System.out.println(str1.trim().toLowerCase());
		float f = 45.567f;
		String str4 = String.valueOf(f);
		System.out.println(str4);
		String str5 = str2.substring(6,9);
		String str6 = str3.substring(11);
		String str7 = str5.concat(str6);
		System.out.println(str7);
		System.out.println(str2.indexOf('N',2));
		System.out.println(str2.lastIndexOf("New"));
		char arr1[]= new char[str2.length()];
		str2.getChars(5,17,arr1,0);
		System.out.println(arr1);
	}
}