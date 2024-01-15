package de.woock.infra.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;

@SuppressWarnings("serial")
@AllArgsConstructor
@Data
@MappedSuperclass
public abstract class Kopfdaten implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Version
	private int version;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date created;

	public Kopfdaten() {
		super();
		created = new Date();
	}
}
