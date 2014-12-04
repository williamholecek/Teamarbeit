package koglerA07_Teamarbeit;

/**
 * @author philippkogler
 * Klasse Volumen
 */
public class Volumen {
	private int identity; //1-->Pyramide, 2-->Kegel, 3-->Quader
	private double g;	//Grundflaeche
	private double hoehe; //Hoehe
	private double a;
	private double b;
	private double c;
	
	/**
	 * @param g
	 * @param h
	 * @param identity --> identifikation
	 */
	public Volumen(double g, double h, int identity) {
		this.identity = identity;
		this.g = g;
		this.hoehe = h;
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @param identity --> identifikation
	 */
	public Volumen(double a, double b, double c, int identity) {
		this.identity = identity;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * @return Volumen in double
	 */
	public double calcVol() {
		double ergebnis = 0;
		switch(identity) {
		case 1: 
			ergebnis = (g*hoehe)/3;
			break;
			
		case 2: 
			ergebnis = (g*hoehe)/3;
			break;
			
		case 3: 
			ergebnis = a*b*c;
			break;
		}
		return ergebnis;
	}
	
	/*
	public static void main(String[] args) {
		Volumen v1 = new Volumen(12,12,2);
		System.out.println(v1.calcVol());
	}
	*/
}
