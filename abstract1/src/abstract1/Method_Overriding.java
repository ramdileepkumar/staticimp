package abstract1;


public class Method_Overriding {

	public static void main(String[] args) {
		Testing ts= new Testing();
		ts.Technicalskills();
		ts.Communicationskills();
		ts.Programminglanguages();
		
		
		 
	}
	public void Technicalskills() {
		System.out.println("Automation testing");
	}
	public void Communicationskills() {
		System.out.println("English");
	}
	public void Programminglanguages() {
		System.out.println("c language");
	}
}
 class Testing extends Method_Overriding{
	 @Override
	 public void Technicalskills() {
			System.out.println("API testing");
		}
	 @Override
	 public void Communicationskills() {
			System.out.println("french");
		}
	 @Override
	 public void Programminglanguages() {
		 System.out.println("java");
	 }
	 
	 }


