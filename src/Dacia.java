
public class Dacia extends Auto{
	
	int flexLevel;

	public Dacia(int geschwindigkeit, int flexLevel) {
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
