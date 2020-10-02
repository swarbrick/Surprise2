package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	
	@Column(name="person_name", unique=true, nullable=false)
	private String personName;
	
	@OneToMany(mappedBy="person", fetch=FetchType.EAGER)
	private List<Cipher> cipherList = new ArrayList<>();
	
	public Person() {}

	public Person(int personId, String personName, List<Cipher> cipherList) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.cipherList = cipherList;
	}

	public Person(String personName, List<Cipher> cipherList) {
		super();
		this.personName = personName;
		this.cipherList = cipherList;
	}

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<Cipher> getCipherList() {
		return cipherList;
	}

	public void setCipherList(List<Cipher> cipherList) {
		this.cipherList = cipherList;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", cipherList=" + cipherList + "]";
	}
	
	

}
