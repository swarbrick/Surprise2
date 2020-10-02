package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Cipher;
import com.example.model.Person;
import com.example.repo.CipherDao;
import com.example.repo.PersonDao;
import com.example.service.CipherService;
import com.example.service.StringToJSON;

@Controller("CipherController")
@CrossOrigin(origins="http://localhost:4200")
public class CipherController {

	private CipherDao cipherDao;
	private PersonDao personDao;

	@Autowired
	public CipherController(CipherDao cipherDao, PersonDao personDao) {
		super();
		this.cipherDao = cipherDao;
		this.personDao = personDao;
	}
	
	@GetMapping("/ciphersByPersonName/{personName}")
	public @ResponseBody List<Cipher> findAllCiphersByPersonName(@PathVariable("personName") String personName){
		System.out.println("Inside controller");
		List<Cipher> cl = cipherDao.findByPersonPersonNameOrderByCipherIdAsc(personName);
		return cl;
	}
	
	@PostMapping("/getDecrypt/{cipher}/{k}")
	public @ResponseBody StringToJSON getDecrypt(@PathVariable("cipher") String cipher, @PathVariable("k") int k){
		StringToJSON d = new StringToJSON(CipherService.decrypt(cipher, k));
		return d;
	}
	
	@PostMapping("/createEncrypt/{string}/{k}/{personName}")
	public @ResponseBody Cipher createEncrypt(@PathVariable("personName") String personName, @PathVariable("string") String string, @PathVariable("k") int k){
		String c = CipherService.encrypt(string, k);
		Person p = personDao.findByPersonName(personName);
		personDao.save(p);
		Cipher cipher = new Cipher(c, k, p);
		cipherDao.save(cipher);		
		return cipher;
	}
}
