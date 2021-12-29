package com.ms.attempt1;

import java.util.HashMap;

public class PersonHashMap {
	
	private String fname;
	private String lname;
	
	
	public PersonHashMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonHashMap(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<PersonHashMap, String> map = new HashMap<>();
		PersonHashMap p1 = new PersonHashMap("fname1","lname1");
		PersonHashMap p2 = new PersonHashMap("fname2","lname2");
		map.put(p1, "first object");
		map.put(p2, "second object");
		map.put(new PersonHashMap("fname2","lname2"), "second overriden object");
		System.out.println(map.size());
		System.out.println(map.get(new PersonHashMap("fname2","lname2")));
	}

}
