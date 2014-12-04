package koglerA07_Teamarbeit;

/**
 * @author philippkogler
 * Zweck Klasse Flaeche berechnen
 */
public class Flaeche {
	private int identity;	//1-->Rechteck, 2-->Dreieck, 3-->Kreis
	private double a;		//steht fuer die laenge bei Rechteck, seite a von dreieck, und r fuer Kreis
	private double b;		//steht fuer breite bei rechteck, hoehe bei Dreieck
	
	//Nur fuer Rechteck und Dreieck
	/**
	 * @param a
	 * @param b
	 * @param identity
	 */
	public Flaeche(double a, double b, int identity) {
		this.identity = identity;
		this.a = a;
		this.b = b;
	}
	//Nur fuer den Kreis
	/**
	 * @param r
	 */
	public Flaeche(double r) {
		this.identity = 3;
		this.a = r;
	}
	
	/**
	 * @return Flaeche in double
	 */
	public double calcA() {
		double ergebnis=0;
		double pi = Math.PI;
		switch(identity) {
		case 1: 
			ergebnis = (this.a*this.b);
			break;
		case 2:
			ergebnis = (this.a*this.b)/2;
			break;
		case 3: 
			ergebnis = pi*((a)*(a));
			break;
		}
		return ergebnis;
	}
	/*
	public static void main(String[] args) {
		Flaeche f1 = new Flaeche(12);
		System.out.println(f1.calcA());
	}
	*/
}
