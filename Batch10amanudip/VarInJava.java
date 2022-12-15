class VarInJava{
	private int a = 20;//instance variable
	public static int c = 40;//static/class variable
	public static void main(String... args){
		int b= 30;//local variable
		VarInJava vi = new VarInJava();
		System.out.println("a = "+vi.a+" b = "+b+" c = "+c);
	}
}
//inside static method we cannot access instance variable directly without creating object
//JVM Will call main method with class name before creating any objects
//VarInJava.main();
//we have 3 types of variables in java
//local variable any thing declared or defined within the method scope is as long as the method is active
//local variable has no scope outside the method
//access specifiers is it required for local variable -> no
//so access specifiers not allowed for local variable
//static/class variable -> anything declared within the class and outside all methods with the keyword static
//we call it as static/class variable
//it has class level scope
//and it is one time intialization only and it is shared among objects
//access modifiers allowed
//instance variable anything declared within the class and outside all methods we call it as instance variable
//each object will have a copy of its own instance variable
//access specifiers allowed for instance variable