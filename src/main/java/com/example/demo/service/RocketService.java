package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import com.example.demo.entities.Rocket;
import com.example.demo.entities.Type;



public interface RocketService {
	Page<Rocket> getAllRocketsParPage(int page, int size);

	Rocket saveRocket(Rocket r);
	Rocket updateRocket(Rocket p);
	void deleteRocket(Rocket p);
	void deleteRocketById(Long id);
	Rocket getRocket(Long id);
	List<Rocket> getAllRocket();
	List<Rocket> findByNomRocket(String nom);
	List<Rocket> findByNomRocketContains(String nom);
	List<Rocket> findByNomBudget (String nom, Double prix);
	List<Rocket> findByTyoe(Type type);
	List<Rocket> findByTypeIdTy(Long id);
	List<Rocket> findByOrderByNomRocketAsc();
	List<Rocket> trierRocketsNomsBudget();
}
