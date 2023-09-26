package abstract1;

public class Encapsulation {

	public static void main(String[] args) {
		MahindraXuv700 mycar = new MahindraXuv700();
		mycar.setcolour("black");
		mycar.setcost(2200000);
		//mycar.setcolour("white");
		System.out.println(" my car colour is :" + mycar.getcolour());
		System.out.println("topmodel xuv700 cost ;"+ mycar.getcost());
		

	}

}
 class Car{
	 private String colour;
	 
	 public  String getcolour() {
		return colour;
		 
	 }
	 public void setcolour(String newcolour) {
		 colour= newcolour;
	 }
 }
	 
	 class MahindraXuv700 extends Car{
		 private int cost;
		 public int getcost() {
			return cost;
			 
		 }
		 public void setcost(int newcost) {
			 cost = newcost;
		 }
		 
	 }
	

