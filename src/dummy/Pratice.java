package dummy;

public class Pratice {
	//parameterized constructor
	String name;
	int rollno;
	int age;
  Pratice(String n,int r){
	 name=n;
	 rollno=r;
	 
 }
  public Pratice(String n,int r,int a) {
	name=n;
	rollno=r;
	age=a;
	
}
  public void display(){
	  System.out.println(name+"  "+rollno+"  "+age); 
  }
	
	public static void main(String[] args) {
		Pratice p1=new Pratice("kb", 10);
		Pratice p2=new Pratice("aa", 0, 29);
		p1.display();
		p2.display();

	}  

}
