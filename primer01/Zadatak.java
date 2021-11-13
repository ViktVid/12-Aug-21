package primer01;

import java.util.Scanner;

public class Zadatak {
	
	public static void main (String[] args) {
		Scanner zadatak = new Scanner(System.in);
		
	/*  Unestite svoje ime: Petar
		Unestite svoje prezime: Petrovic
		Unesite poluprecnik kruznice: 3
		Rezultati za: Petra Petrovica su
		Obim kruga je:  2*3*3.14
		Povrsina kruga je:  3*3*3.14 */
		
		System.out.println("Unesite svoje ime: ");
		String ime = zadatak.nextLine();

		System.out.println("Unesite svoje prezime: ");
		String prezime = zadatak.nextLine();
		
		System.out.println("Unesite poluprecnik: ");
		double r = zadatak.nextDouble();

		System.out.println("Rezultati za korisnika " + ime + '\u00A0' + prezime + '\u00A0' + "su:");
		double o = 2 * r * 3.14;
		System.out.println("Obim kruga: " + o);
		
		double p = 3.14 * (r * r);
		System.out.println("Povrsina kruga: " + p);
		
		zadatak.close();
	}
}
