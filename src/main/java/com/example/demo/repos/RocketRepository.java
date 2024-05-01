package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Rocket;
import com.example.demo.entities.Type;

public interface RocketRepository extends JpaRepository<Rocket, Long> {
	List<Rocket> findByNomRocket(String nom);
	 List<Rocket> findByNomRocketContains(String nom); 
	 @Query("select r from Rocket r where r.nomRocket like %?1 and r.prixRocket > ?2")
	 List<Rocket> findByNomBudget (String nom, Double prix);
	 
	 @Query("select r from Rocket r where r.type = ?1")
	 List<Rocket> findByType (Type type);

	 List<Rocket> findByTypeIdTy(Long id);
	 List<Rocket> findByOrderByNomRocketAsc();
	 
	 @Query("select r from Rocket r order by r.nomRocket ASC, r.prixRocket DESC")
	 List<Rocket> trierRocketsNomsBudget ();



}
