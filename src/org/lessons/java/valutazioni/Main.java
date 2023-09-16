package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// ---------------------------------------------------------------------
		// creo un array di studenti lungo 20 dall'istanza della classe Studente
		// e importo e abilito il numero random con la variabile rand

		Studente[] studenti = new Studente[20];
		Random rand = new Random();

		// ---------------------------------------------------------------------

		// ---------------------------------------------------------------------
		// creo due variabili che mi faranno da counter per i studenti promossi e
		// boccati

		int counterBocciati = 0;
		int counterPromossi = 0;

		// ---------------------------------------------------------------------

		// ---------------------------------------------------------------------
		// ciclo per tutto l'array di studenti ,e per ognuno utilizzo il costruttore
		// dove per l'id gli do l'indice dell'array piu 1 perche l'id non puo iniziare
		// con 0,
		// per la percentuale di assenze uso un intero random da 0 a 101 (101 cosi viene
		// incluso pure il 100)
		// e per la media voti un float random da 0 a 5.
		// poi passo ad una condizione di verifica che tramite una funzione della classe
		// Studente mi ritorna una stringa
		// se lo stuidente è bocciato o promosso
		// se lo studente è bocciato incremento il count dei bocciati senno quello dei
		// promossi

		for (int i = 0; i < studenti.length; i++) {

			studenti[i] = new Studente(i + 1, rand.nextInt(0, 101), rand.nextFloat(0, 5));

			System.out.println(studenti[i].idStudente + " " + String.format("%.2f", studenti[i].mediaVoti) + " "
					+ studenti[i].perCentAssenze);

			if (studenti[i ].eBocciato().equals("bocciato")) {

				counterBocciati++;

			} else {

				counterPromossi++;

			}
			System.out.println(studenti[i].eBocciato());

		}
		System.out.println("studenti promossi : " + counterPromossi );
		System.out.println("studenti bocciati : " + counterBocciati );

		// ---------------------------------------------------------------------

		// ---------------------------------------------------------------------
		//creo un array per i promossi e uno per i bocciati come istanze della classe Studente e 
		//per determinare la lunghezza giusta utilizzo i counter creati in precedenza per poi resettarli
		//in piu creo due variabili sia per bocciati che per promossi  dove una mi 
		//tiene conto della media e l'alta dell'id dello studente piu bravo e quello piu scarso
		
		Studente[] bocciati = new Studente[counterBocciati];
		Studente[] promossi = new Studente[counterPromossi];
		counterBocciati = 0;
		counterPromossi = 0;
		int mediaAlunnoPromossoVotoPiuAlto = 0;
		int mediaAlunnoBocciatoVotoPiuAltoBasso = 10;
		int idAlunnoPiuBravo = 0;
		int idAlunnoPeggiore = 0;
		
		//---------------------------------------------------------------------

		
		//---------------------------------------------------------------------
		//ciclo dentro all'array studenti e per ognuno controllo con una condizione se è bocciato ,
		//se lo è assegno nell'array in posizione [counterbocciati]il valore del singolo studente e auntento il counter che mi fa da indice
		//e faccio un altra verifica se la media voti di quel singolo studente è minore della media col vaole piu basso ,
		//salvo l'id di quel studente nella variabile dello studente peggiore
		// e faccio di conseguenza se l'alunno e promosso
		
		
		for (int i = 0; i < studenti.length; i++) {

			if (studenti[i].eBocciato().equals("bocciato")) {

				bocciati[counterBocciati] = studenti[i];
				counterBocciati++;
				if (studenti[i].mediaVoti < mediaAlunnoBocciatoVotoPiuAltoBasso) {
					idAlunnoPeggiore = studenti[i].idStudente;
				}

			} else {

				promossi[counterPromossi] = studenti[i];
				counterPromossi++;
				if (studenti[i].mediaVoti > mediaAlunnoPromossoVotoPiuAlto) {
					idAlunnoPiuBravo = studenti[i].idStudente;
				}

			}
		}

		//---------------------------------------------------------------------

		
		//---------------------------------------------------------------------
		//ciclo nei due array per poter stampare a schemo i valori dei singoli studenti degli array bocciati e promossi 
		// e il quantitativo di quanti sono bocciati e quanti promossi 
		for (int i = 0; i < promossi.length; i++) {
			System.out.println("Alunno Promosso : " + promossi[i].idStudente + " " + promossi[i].mediaVoti + " "
					+ promossi[i].perCentAssenze);
		}
		for (int i = 0; i < bocciati.length; i++) {
			System.out.println("Alunno bocciato : " + bocciati[i].idStudente + " " + bocciati[i].mediaVoti + " "
					+ bocciati[i].perCentAssenze);
		}
		System.out.println("L'alunno Mignore è id : " + idAlunnoPiuBravo);
		System.out.println("L'alunno Peggiore è id : " + idAlunnoPeggiore);
		
		//---------------------------------------------------------------------


	}
}
