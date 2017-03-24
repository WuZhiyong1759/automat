package com.pt.domain;

import java.io.Serializable;

public class Root implements Serializable{
	
	
	/**
	 * 
	 */

	private int id;
	
	private String rname;
	
	private String rpass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRpass() {
		return rpass;
	}

	public void setRpass(String rpass) {
		this.rpass = rpass;
	}
}
