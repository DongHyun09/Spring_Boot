package com.kdh.web.entity;

public class PeopleInfo {
	
	private String name;
	private int age;
	private String job;
	private String relation;
	private String forme;
	private String forme2;
	private String dv;
	private int num;
	

	public PeopleInfo() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public PeopleInfo(String name, int age, String job, String relation, String forme, String forme2, String dv,
			int num) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.relation = relation;
		this.forme = forme;
		this.forme2 = forme2;
		this.dv = dv;
		this.num = num;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	public String getForme() {
		return forme;
	}


	public void setForme(String forme) {
		this.forme = forme;
	}


	public String getForme2() {
		return forme2;
	}


	public void setForme2(String forme2) {
		this.forme2 = forme2;
	}


	public String getDv() {
		return dv;
	}


	public void setDv(String dv) {
		this.dv = dv;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}



	@Override
	public String toString() {
		return "PeopleInfo [name=" + name + ", age=" + age + ", job=" + job + ", relation=" + relation + ", forme="
				+ forme + ", forme2=" + forme2 + ", dv=" + dv + ", num=" + num + "]";
	}
	
	
}
