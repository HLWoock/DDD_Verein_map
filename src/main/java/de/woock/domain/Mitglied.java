package de.woock.domain;

import java.time.LocalDate;

import de.woock.domain.personalien.Adresse;
import de.woock.domain.personalien.Anrede;
import de.woock.domain.personalien.Geschlecht;
import de.woock.domain.schufa.Bonitaet;
import de.woock.domain.status.Vertragsart;

public class Mitglied {
	
	Anrede      anrede;
	String      vorname;
	String      name;
    String      username;
    LocalDate   geburtsdatum;
    String      telefon;
    String      mobil;
	String      email;
	Adresse     adresse;
    Geschlecht  geschlecht;
    Bonitaet    bonitaet;
    Vertragsart vertragsart;

}
