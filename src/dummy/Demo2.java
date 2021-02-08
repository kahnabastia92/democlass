package dummy;

public class Demo2 {

	public static int addition(int a,int b){
		
		int c;
		c=a+b;
		return c;
	}
	public static String verifyString(String str1,String str2){
		
		String res=null;
		
		if (str1.equalsIgnoreCase(str2)) {
			 res="string is equal";
		}
		else {
			 res="string is not equal";
		}
		return res;
	}
	public static boolean comparevalues(int x,int y){
		
		if (x==y) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		int d=Demo2.addition(10, 10);
		System.out.println(d);
		String result=Demo2.verifyString("hello", "hi");
		System.out.println(result);
		boolean bool=Demo2.comparevalues(10, 10);
		System.out.println(bool);
	}

}
