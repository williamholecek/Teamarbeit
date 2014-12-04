import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
/*
 * Eine Klasse zum erstellen von Zahlen. Diese Klasse soll auch die Zahlen addieren können 
 * author Keles Ibrahim
 * version 
 */

/**
 * @author ibrahim
 *
 */
public class Zahlen {
	private ArrayList<Integer>liste;
	public  Zahlen(ArrayList<Integer> list) {
		this.liste = list;
	}
	
	/**
	 * @return summe
	 */
	public int summe() {
		int ergebnis = 0;
		for (int i=0; i<liste.size(); i++) {
			ergebnis += liste.get(i);
		}
		return ergebnis;
	}
	
	/**
	 * @return min
	 */
	public int minimum() {
		Object[] temp = this.liste.toArray();
		Arrays.sort(temp);
		return (int) temp[0];
	}
	
	/**
	 * @return max
	 */
	public int maximum() {
		Object[] temp = this.liste.toArray();
		Arrays.sort(temp);
		return (int) temp[temp.length-1];
	}
	
	/*
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(3);
		l1.add(2);
		Zahlen z1 = new Zahlen(l1);
		System.out.println(z1.maximum());
	}
	*/
}
