package koglerA07_Teamarbeit;

import java.util.ArrayList;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("In den Folgenden Zeilen werden die verschieden Klassen getestet");
		Flaeche f1 = new Flaeche(10,10,1);	//Rechteck
		Flaeche f2 = new Flaeche(20,20,2);	//Dreieck
		Flaeche f3 = new Flaeche(15);		//Kreis
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Testen der Klasse Flaeche:\t\tmit statischen Werten");
		System.out.println("Flaeche von Rechteck:\t"+f1.calcA());
		System.out.println("Flaeche von Dreieck:\t"+f2.calcA());
		System.out.println("Flaeche von Kreis:\t"+f3.calcA());
		System.out.println("-----------------------------------------------------------------");
		
		Volumen v1 = new Volumen(10,10,1);
		Volumen v2 = new Volumen(10,20,2);
		Volumen v3 = new Volumen(10,10,10,3);
		System.out.println("Testen der Klasse Volumen:\t\tmit statischen Werten");
		System.out.println("Flaeche von Pyramide:\t"+v1.calcVol());
		System.out.println("Flaeche von Kegel:\t"+v2.calcVol());
		System.out.println("Flaeche von Quader:\t"+v3.calcVol());
		System.out.println("-----------------------------------------------------------------");
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(36);
		l1.add(34);
		l1.add(44);
		Zahlen z1 = new Zahlen(l1);
		System.out.println("Testen der Klasse Zahlen:\t\tmit statischen Werten");
		System.out.println("Wert von Summe:\t\t"+z1.summe());
		System.out.println("Wert von Maximum:\t"+z1.maximum());
		System.out.println("Wert von Minimum:\t"+z1.minimum());
	}
}
