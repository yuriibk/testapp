package com.yuriyb.employees;

public class Department {
	
	private String deptName;
	private String deptBossName;
	
	Department(String deptName, String deptBossName){
		this.deptBossName=deptBossName;
		this.deptName=deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptBossName() {
		return deptBossName;
	}

	public void setDeptBossName(String deptBossName) {
		this.deptBossName = deptBossName;
	}
	
	
}
