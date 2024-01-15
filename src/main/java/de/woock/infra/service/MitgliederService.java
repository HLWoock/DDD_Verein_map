package de.woock.infra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import de.woock.infra.entity.MitgliedEntity;
import de.woock.infra.repository.MitgliederRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class MitgliederService {
	
	private final MitgliederRepository mitgliederRepository;
	
	public MitgliedEntity aufnehmen(MitgliedEntity mitgliedEntity) {
		log.debug("Neues Mitglied aufgenommen");
		return mitgliederRepository.save(mitgliedEntity);
	}

	public List<MitgliedEntity> alleMitglieder() {
		return mitgliederRepository.findAll();
	}

	public void alleMitgliederLoeschen() {
        mitgliederRepository.deleteAll();		
	}

}
