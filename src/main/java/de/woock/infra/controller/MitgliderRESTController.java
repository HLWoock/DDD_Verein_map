package de.woock.infra.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.woock.infra.converter.MitgliederConverter;
import de.woock.infra.dto.MitgliedDTO;
import de.woock.infra.entity.MitgliedEntity;
import de.woock.infra.service.MitgliederService;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MitgliderRESTController {
	
	private final MitgliederService   mitgliederService;
	private final MitgliederConverter mitgliederConverter;
	
	private final ObservationRegistry registry;
	
	@GetMapping("/mitglieder")
	public List<MitgliedDTO> alleMitglieder() {
		return mitgliederService.alleMitglieder()
                                .stream()
                                .map(mitglied -> MitgliederConverter.toDto(mitglied))
                                .collect(Collectors.toList());
	}
	
	@PostMapping("/mitglied")
	public MitgliedEntity aufnehmen(@RequestBody() MitgliedDTO mitgliedDTO) {
		log.debug("Nehme {} aus {} auf.", mitgliedDTO.getUsername(), mitgliedDTO.getAdresse().getOrt());
		Observation.start("verein.mitglied.aufnehmen", registry)
	               .observe(() -> "Verein");
		return mitgliederService.aufnehmen(mitgliederConverter.toEntity(mitgliedDTO));
	}
	
	@DeleteMapping("/mitglieder")
	public void alleMitgliederLoeschen() {
		mitgliederService.alleMitgliederLoeschen();
	}
	
	@ExceptionHandler
	public ProblemDetail handleException(IllegalArgumentException ex) {
		return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, ex.getMessage());
	}
}
