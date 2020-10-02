package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Cipher;

public interface CipherDao extends CrudRepository<Cipher, Integer> {
	
	public List<Cipher> findAll();
	public List<Cipher> findByPersonPersonId(int personId);
	public List<Cipher> findByPersonPersonIdOrderByCipherIdAsc(int personId);
	public List<Cipher> findByPersonPersonNameOrderByCipherIdAsc(String personName);
	
//	public Cipher findByFoodId(int id);
//	public Cipher findByDishName(String dishName);
//	public Cipher findByCalories(double awfoijaoifjiojwi); //variable name doesn't matter
//	public Cipher findByDishNameAndCalories(String dishName, double calories);

}
