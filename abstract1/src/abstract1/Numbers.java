package abstract1;

public class Numbers {
	 int a = 0;
	int b=1;
	String name="Autmation testing";
	Numbers(){
		this.a++;
		System.out.println(a);
	}
	
public static void main(String[] args) {
		Numbers a= new Numbers();
		Numbers a1= new Numbers();
		a.addition();
		a1.addition();
		a.multiplication();
		a1.multiplication();
		a.substraction();
		a1.substraction();
	}
public void addition() {
		a=a+1;
		a=b+2;
		System.out.println(a);
	}
public void multiplication() {
	a=a*1;
	a=b*2;
	System.out.println(a);
}
public void substraction() {
	a=a*1;
	a=b*2;
	System.out.println(a);
}


	

}
