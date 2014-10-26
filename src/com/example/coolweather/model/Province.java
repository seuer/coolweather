package com.example.coolweather.model;

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
	private int provincedId;
	
	public int getProvincedId() {
		return provincedId;
	}
	public void setProvincedId(int provincedId) {
		this.provincedId = provincedId;
	}
	public int getId() {
		return id;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	
	

}
