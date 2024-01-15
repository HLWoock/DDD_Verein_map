package de.woock.infra.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import de.woock.infra.dto.MitgliedDTO;
import de.woock.infra.entity.MitgliedEntity;

@Component
public class MitgliederConverter {
	
	private static ModelMapper mapper = new ModelMapper();

	public static MitgliedDTO toDto(MitgliedEntity mitgliedEntity) {
		return mapper.map(mitgliedEntity, MitgliedDTO.class);
	}

	public MitgliedEntity toEntity(MitgliedDTO mitgliedDTO) {
		return mapper.map(mitgliedDTO, MitgliedEntity.class);
	}

}
