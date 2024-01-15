package de.woock.infra.entity;

import static jakarta.persistence.EnumType.STRING;

import java.io.Serializable;

import de.woock.domain.personalien.Anrede;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@SuppressWarnings({ "serial" })
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "Mitglied")
public class MitgliedEntity extends Kopfdaten implements Serializable {
	
	@Enumerated(STRING) Anrede        anrede;
	                    String        vorname;
	                    String        name;
                        String        username;
                        String        telefon;
                        String        mobil;
                        String        email;
    @Embedded           AdresseEntity adresse;
}
