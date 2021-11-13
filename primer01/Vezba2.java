package primer01;

import java.util.Scanner;

public class Vezba2 {
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
				
		System.out.print("Unesite stranicu a: ");
		double stranicaKvadrata = unos.nextDouble();
		
		double povrsinaKvadrata = stranicaKvadrata * stranicaKvadrata;
		System.out.println("Povrsina kvadrata je: " + povrsinaKvadrata);
		
		double obimKvadrata = stranicaKvadrata * 4;
		System.out.println("Obim kvadrata je: " + obimKvadrata);
		
		
		System.out.print("Unesite stranicu a: ");
		double stranicaPravougaonikaA = unos.nextDouble();
		
		System.out.print("Unesite stranicu b: ");
		double stranicaPravougaonikaB = unos.nextDouble();
		
		double povrsinaPravougaonika = stranicaPravougaonikaA * stranicaPravougaonikaB;
		System.out.println("Povrsina pravougaonika je: " + povrsinaPravougaonika);
		
		double obimPravougaonika =  (2 * stranicaPravougaonikaA) + (2 * stranicaPravougaonikaB);
		System.out.println("Obim pravougaonika je: " + obimPravougaonika);
		
		unos.close();
	}

}
