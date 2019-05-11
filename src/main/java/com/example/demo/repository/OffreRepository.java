package com.example.demo.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Category;
import com.example.demo.model.Client;
import com.example.demo.model.Favorite;
import com.example.demo.model.Location;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.model.Rapport;
import com.example.demo.status.StatusOffre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {
	Optional<Offre> findByDetailsContaining(String title);
	Optional<Offre> findByDescriptionContaining(String description);
	Optional<Offre> findByTitleContaining(String title);
	Optional<Offre> findByTitle(String title);
	Optional<Offre> findByType(String type);
	Optional<Offre> findByStatusOffre(StatusOffre statusOffre);
	Optional<Offre> findBySalary(Long salary);
	Optional<Offre> findByDateLimit(Date dateLimit);
	Optional<Offre> findByCreatedAt(Date createdAt);
	Optional<Offre> findByExperience(Long experience);
	Optional<Offre> findByClient(Client client);
	Optional<Offre> findByCategory(Category category);
	Optional<Offre> findByLocation(Location location);
	Optional<Offre> findByRapport(Rapport rapport);
	Optional<Offre> findByFavorite(Favorite favorite);
	Optional<Offre> findByPostulation(Postulation postulation);
	Optional<Offre> findByClientId(Long id);
	Optional<Offre> findByCategoryId(Long offId);
	Optional<Offre> findByFavoriteId(Long favoritId);
	Optional<Offre> findByRapportId(Long rapportId);
	Optional<Offre> findByLocationId(Long locId);
}
