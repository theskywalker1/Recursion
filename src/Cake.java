
public class Cake {

	private int bites = 10;
	public Cake() {
		
		//Default constructor
	}
	
	public void takeBite() {
		
		bites--;
		System.out.println("Mmmmmm..... (this is a lie)");
	}
	
	public boolean isEmpty() {
		
		return bites == 0;
	}
}
