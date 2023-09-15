package org.lessons.java.valutazioni;

public class Studente {
	
	public int idStudente;
	public int perCentAssenze;
	public float mediaVoti;
	
	 Studente(int idStudente, int perCentAssenze , float mediaVoti){
		this.idStudente = idStudente;
		this.perCentAssenze = perCentAssenze;
		this.mediaVoti = mediaVoti;
	}

	public String eBocciato() {
		if (this.perCentAssenze > 50) {
			return "bocciato";
		} else if (this.perCentAssenze > 25 && this.perCentAssenze < 50) {
			if (this.mediaVoti > 2) {
				return "promosso";
			} else {
				return "bocciato";
			}
		} else {
			if (this.mediaVoti >= 2) {
				return "promosso";
			} else {
				return "bocciato";
			}
		}
	}
}