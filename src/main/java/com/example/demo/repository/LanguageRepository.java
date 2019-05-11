package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cv;
import com.example.demo.model.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
	List<Language> findByCv(Cv cv);
	List<Language> findByEstablishmentNameContaining(String establishmentName);
	List<Language> findBylange(String lange);
	List<Language> findBySpeekLevel(String speekLevel);
	List<Language> findByWriteLevel(String writeLevel);
	List<Language> findByReadLevel(String readLevel);
	List<Language> findByCvId(Long cvId);
}
