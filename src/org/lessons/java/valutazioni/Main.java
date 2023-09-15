package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {

		Studente[] studenti = new Studente[20];
		Random rand = new Random();
		for (int i = 1; i <= studenti.length; i++) {
			
			studenti[i-1] = new Studente(i, rand.nextInt(0, 101), rand.nextFloat(0, 5));
			
			System.out.println(	studenti[i-1].idStudente + " " + studenti[i-1].mediaVoti + " " + studenti[i-1].perCentAssenze);
			System.out.println(studenti[i-1].eBocciato());
		}
	}
}
