package dummy;

public class Demo5 {
//parseInt():it will convert string to integer.
//valueOf():it will convert integer to string.	
	public static void main(String[] args) {
		
		String str1="10";
		String str2="100";
        
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		
		System.out.println(x+y);
		
		int a=1000;
		int b=10000;
		
		String str3=String.valueOf(a);
		String str4=String.valueOf(b);
		
		System.out.println(str3.concat(str4));
	}

}
