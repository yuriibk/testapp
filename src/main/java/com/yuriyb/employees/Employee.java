package com.yuriyb.employees;

public class Employee {
	
	private int id;
	private String name;
	private String dpName;
	private String dpBossName;
	private static int count=1;
	
	public Employee(String name, Department dp){
		this.name = name;
		this.dpName = dp.getDeptName();
		this.dpBossName = dp.getDeptBossName();
		this.id = count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDpName() {
		return dpName;
	}

	public void setDpName(String dpName) {
		this.dpName = dpName;
	}

	public String getDpBossName() {
		return dpBossName;
	}

	public void setDpBossName(String dpBossName) {
		this.dpBossName = dpBossName;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}
	
}
