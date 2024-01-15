package de.woock.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.woock.infra.entity.MitgliedEntity;

public interface MitgliederRepository extends JpaRepository<MitgliedEntity, Long>{
//	long deleteByStreat
}
