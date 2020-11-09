
public class Cake {

	private int bites = 10;
	public Cake() {
		
		
	}
	
	public void takeBite() {
		
		bites--;
		System.out.println("Mmmmmm..... (this is a lie)");
		System.out.println(bites);
	}
	
	public boolean isEmpty() {
		
		return bites == 0;
	}
}
