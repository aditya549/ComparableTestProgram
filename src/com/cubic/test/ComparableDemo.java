package com.cubic.test;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private String edepartment;
	private int esalary;
	private String place;
	public Employee(int eid, String ename, String edepartment, int esalary, String place) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
		this.esalary = esalary;
		this.place = place;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eid-o.eid;
	}
		
}
public class ComparableDemo {
	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<>();
		Employee e=new Employee(10, "reddy", "JavaDeveloper", 20000, "Hyderabad");
		Employee e1=new Employee(20, "adithya", "Testing", 25000, "Nizambad");
		Employee e2=new Employee(30, "nanda", "DotNet", 30000, "Bangalore");
		Employee e3=new Employee(40, "abel", "WebDesigning", 40000, "Pune");
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println("-----Employee Records-------");
		System.out.println("----------------------------------");
		System.out.println("Name || Eid || Departmnet || Salary || Place");
		System.out.println("----------------------------------");
		for(Employee emp:ts) {
			System.out.println(emp.getEname()+"\t||" +emp.getEid()+"\t||" +emp.getEdepartment()+"\t||"+emp.getEsalary()+"\t||"+emp.getPlace());
		}
	}
}
