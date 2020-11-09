
public class EatCake {
	
	public EatCake() {
		
		//Default constructor
	}
	
	public static void eatCake(Cake cake) {
		
		if(!cake.isEmpty()) {
			cake.takeBite();
			eatCake(cake);
		}
	}

	public static void main(String[] args) {
		
		Cake cake = new Cake();
		
		eatCake(cake);
		
		System.out.println("Done. Noice");

	}

}
