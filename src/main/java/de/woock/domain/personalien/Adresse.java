package de.woock.domain.personalien;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Adresse {

	private String ort;
	private String strasse;
}
