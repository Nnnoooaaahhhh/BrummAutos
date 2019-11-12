
public class BMW extends Auto{
	
	int flexLevel;

	public BMW(int geschwindigkeit, int flexLevel) {
		super(geschwindigkeit);
		this.flexLevel=flexLevel;

		
	}
	
	void fahren() {
		System.out.println("Ich fahre "+geschwindigkeit+"km/h");
	}
	
	void flexLevel() {
		System.out.println("Mein FLEXLEVEL ist "+flexLevel);
	}
	
	

}
