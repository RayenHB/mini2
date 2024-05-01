package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Rocket;
import com.example.demo.repos.RocketRepository;
import com.example.demo.entities.Type;

@SpringBootTest
class RocketsApplicationTests {
	@Autowired
	private RocketRepository rocketRepository;
	@Test
	public void testCreateRocket() {
	Rocket rock = new Rocket("Falcon 9",2200.500,new Date());
	rocketRepository.save(rock);
	}
	@Test
	public void testFindRocket()
	{
	Rocket r = rocketRepository.findById(1L).get();
	System.out.println(r);
	}
	
	@Test
	public void testUpdateRocket()
	{
	Rocket r = rocketRepository.findById(1L).get();
	r.setBudget(1000.0);
	rocketRepository.save(r);
	}
	@Test
	public void testDeleteRocket()
	{
	rocketRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousRockets()
	{
	List<Rocket> rocks = rocketRepository.findAll();
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}
	@Test
	public void testFindByNomRocket()
	{
	List<Rocket> rocks = rocketRepository.findByNomRocket("falcon 9");
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}
	@Test
	public void testFindByNomRocketContains ()
	{
	List<Rocket> rocks=rocketRepository.findByNomRocketContains("falcon");
	for (Rocket r : rocks)
	{
	System.out.println(r);
	} }
	@Test
	public void findByCategorieIdTy()
	{
	List<Rocket> rocks = rocketRepository.findByTypeIdTy(1L);
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	 }
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Rocket> rocks = rocketRepository.findByOrderByNomRocketAsc();
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}
	@Test
	public void testfindByNomBudget()
	{
	List<Rocket> rocks = rocketRepository.findByNomBudget("falco 8", 1000.0);
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}
	@Test
	public void testfindByType()
	{
	Type ty = new Type();
	ty.setIdTy(1L);
	List<Rocket> rocks = rocketRepository.findByType(ty);
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}
	@Test
	public void testTrierRocketNomsBudget()
	{
	List<Rocket> rocks = rocketRepository.trierRocketsNomsBudget();
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}

}
