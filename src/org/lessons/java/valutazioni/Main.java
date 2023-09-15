package org.lessons.java.valutazioni;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Studente[] studenti = new Studente[20];
		Random rand = new Random();
		int counterBocciati = 0;
		int counterPromossi = 0;

		for (int i = 1; i <= studenti.length; i++) {

			studenti[i - 1] = new Studente(i, rand.nextInt(0, 101), rand.nextFloat(0, 5));

			System.out.println(studenti[i - 1].idStudente + " " + String.format("%.2f", studenti[i - 1].mediaVoti) + " "
					+ studenti[i - 1].perCentAssenze);

			if (studenti[i - 1].eBocciato().equals("bocciato")) {

				counterBocciati++;

			} else {

				counterPromossi++;

			}
			System.out.println(studenti[i - 1].eBocciato());

		}
		Studente[] bocciati = new Studente[counterBocciati];
		Studente[] promossi = new Studente[counterPromossi];
		counterBocciati = 0;
		counterPromossi = 0;
		int mediaAlunnoPromossoVotoPiuAlto = 0 ;
		int mediaAlunnoBocciatoVotoPiuAltoBasso = 10 ;
		int idAlunnoPiuBravo = 0;
		int idAlunnoPeggiore = 0;
		for (int i = 0; i < studenti.length; i++) {
			
			if (studenti[i].eBocciato().equals("bocciato")) {

				bocciati[counterBocciati]= studenti[i];
				counterBocciati++;
				if(studenti[i].mediaVoti < mediaAlunnoBocciatoVotoPiuAltoBasso) {
					idAlunnoPiuBravo = studenti[i].idStudente;
				}


			} else {

				promossi[counterPromossi]= studenti[i];
				counterPromossi++;
				if(studenti[i].mediaVoti > mediaAlunnoPromossoVotoPiuAlto) {
					idAlunnoPeggiore = studenti[i].idStudente;
				}

			}
		}
		
		for (int i = 0; i < promossi.length; i++) {
			System.out.println("Alunno Promosso : " + promossi[i].idStudente + " " + promossi[i].mediaVoti + " " + promossi[i].perCentAssenze) ;
		}
		for (int i = 0; i < bocciati.length; i++) {
			System.out.println("Alunno bocciato : " + bocciati[i].idStudente + " " + bocciati[i].mediaVoti + " " + bocciati[i].perCentAssenze) ;
		}
		System.out.println("L'alunno Mignore è id : " + idAlunnoPiuBravo);
		System.out.println("L'alunno Peggiore è id : " + idAlunnoPeggiore);

	}
}
