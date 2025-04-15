package com.Collection;

public class Men {
	String name;
	int age;
	String job;
	double sal;
	Men(){
	}
	
	

	public Men(String name, int age, String job, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Men [name=" + name + ", age=" + age + ", job=" + job + ", sal=" + sal + "]";
	}
	

}
