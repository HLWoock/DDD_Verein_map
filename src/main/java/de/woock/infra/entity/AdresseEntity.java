package de.woock.infra.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class AdresseEntity implements Serializable {

	private String ort;
	private String strasse;
}
