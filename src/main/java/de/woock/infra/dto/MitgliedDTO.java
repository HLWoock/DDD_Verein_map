package de.woock.infra.dto;

import java.io.Serializable;

import de.woock.domain.personalien.Adresse;
import de.woock.domain.personalien.Anrede;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MitgliedDTO implements Serializable {
	Long        id;
	Anrede      anrede;
	String      vorname;
	String      name;
    String      username;
    String      telefon;
    String      mobil;
    String      email;
    Adresse     adresse;
}
