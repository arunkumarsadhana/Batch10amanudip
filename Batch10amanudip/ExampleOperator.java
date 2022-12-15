class A{
}
class B extends A{
}

class ExampleOperator{
	public static void main(String... args){
		Integer in1 = new Integer(15);
		String str1 = new String("Hello");
		A aobj = new A();
		B bobj = new B(); 
		System.out.println(in1 instanceof Integer);
		System.out.println(str1 instanceof String);
		System.out.println(aobj instanceof B);
		System.out.println(bobj instanceof B);
		int a = 20;
		int b = ++a + a++ + ++a;
		System.out.println("b = "+b);
		int c = 10,d = 12;
		int e = c&d;
		System.out.println("e = " + e);
		int f = c<d?c:d;
		System.out.println("f = " + f);
		int g = 121,h = 8;
		System.out.println("g|h = "+(g|h));
		int m = 37;
		System.out.println("37<<3 = "+(37<<3));
	}
}
//
//21     22
//++a + a++ + ++a
//21 + 21   + 23
//65
//Bitwise operator -> &
//c = 10 -> 
//2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
//128 64  32  16  8   4   2   1
//0   0   0   0   0   0   1  -> 2
//Right shift is dividing the value by 2
//40/2 -> 20/2 -> 10/2 -> 5/2 -> 2
//37>>3 three times we have to repeatedly divide by 2
//37/2 -> 18/2 -> 9/2 -> 4
//left shift multiply by 2
//37*2 -> 74*2 -> 148*2 -> 296
//repeatedly mulitply by 2 as many number of shifts
//0   1   1   1   1   0   0   1 -> 121
//0   0   0   0   1   0   0   0 -> 8(|)
//0   1   1   1   1   0   0   1 -> 121
//0   0   0   0   1   0   1   0 -> 10
//0   0   0   0   1   1   0   0 -> 12 (&)
//0   0   0   0   1   0   0   0 -> 8