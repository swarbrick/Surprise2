package com.example.service;

public class StringToJSON {
	
	String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public StringToJSON(String string) {
		super();
		this.string = string;
	}

	@Override
	public String toString() {
		return "StringToJSON [string=" + string + "]";
	}
	
	

}
