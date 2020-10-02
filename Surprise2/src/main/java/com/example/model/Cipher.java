package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Cipher")
public class Cipher {
	
	@Id
	@Column(name="cipher_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cipherId;
	
	@Column(name="cipher", unique=false, nullable=false)
	private String cipher;
		
	@Column(name="k", unique=false, nullable=false)
	private int k;
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JsonIgnore
    @JoinColumn(name ="person_id", nullable=false)
	private Person person;
	
	public Cipher() {}

	public Cipher(String cipher, int k, Person person) {
		super();
		this.cipher = cipher;
		this.k = k;
		this.person = person;
	}



	public Cipher(int cipherId, String cipher, int k, Person person) {
		super();
		this.cipherId = cipherId;
		this.cipher = cipher;
		this.k = k;
		this.person = person;
	}



	public int getCipherId() {
		return cipherId;
	}

	public void setCipherId(int cipherId) {
		this.cipherId = cipherId;
	}

	public String getCipher() {
		return cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Cipher [cipherId=" + cipherId + ", cipher=" + cipher + ", person="
				+ person + "]";
	}	

}
