package de.woock.infra.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdresseDTO implements Serializable {

	private String ort;
	private String strasse;
}
