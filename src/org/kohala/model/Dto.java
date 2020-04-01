package org.kohala.model;

public class Dto {
	
	private int idx;
	private String name;
	private String phone;
	
	public Dto(int i, String string, String string2) {
		idx = i;
		name = string;
		phone = string2;
		// TODO Auto-generated constructor stub
	}
	public Dto() {
		// TODO Auto-generated constructor stub
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String toString() {
		return name+"\t"+phone;
	}

}
