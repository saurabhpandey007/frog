package com.cyblib.dto;

public class AdminDTO {
	
	private String name;
	private String adminId;
	private String adminPass;
	
	
	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdminId() {
		return adminId;
	}


	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}


	public String getAdminPass() {
		return adminPass;
	}


	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}


	@Override
	public String toString() {
		return "AdminDTO [name=" + name + ", adminId=" + adminId + ", adminPass=" + adminPass + "]";
	}
	

	
	
}
