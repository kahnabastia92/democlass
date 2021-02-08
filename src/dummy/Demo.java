package dummy;

public class Demo {
	
	public static int a=20;
	private static double d=34.45;
	protected static String s="kb";
	static char c='c';
	
	public static void publicMethod(){
		System.out.println("Acessing public variable " +a);
	}
	private static void privateMethod(){
		System.out.println("Acessing private variable " +d);
	}
	protected static void protectedMethod(){
		System.out.println("Acessing protected variable " +s);
	}
	static void defaultMethod(){
		System.out.println("Acessing defaulgt variable " +c);
	}
	public static void main(String[] args) {
		Demo.privateMethod();
		Demo.privateMethod();
		Demo.protectedMethod();
		Demo.defaultMethod();

	}

}
