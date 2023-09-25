package abstract1;

public class Method_Overloading {

	public static void main(String[] args) {
		Method_Overloading mo1= new Method_Overloading();
		mo1.mydetails("dileep");
		mo1.mydetails(24);
        mo1.mydetails("dileepkumar", 24);
        mo1.mydetails(1234567891);
        mo1.mydetails(28, 22);
        mo1.mydetails(15.2);
        mo1.mydetails(24,"ramdileep kumar" );
	}


String name;
int age;
public void mydetails(String name) {
	System.out.println(name);
}
public void mydetails(int age) {
	System.out.println(age);
}
public void mydetails(String name,int age) {
	System.out.println("name:"+name+" "+"age"+ age);
}
public void mydetails(long mblno) {
	System.out.println(mblno);
}
public void mydetails(int a,int b) {
	System.out.println(a+b);
}
public void mydetails(double a) {
	System.out.println(a);
}
public void mydetails(int age,String name) {
	System.out.println("age"+ age + " "+"name:"+name);
}

}
