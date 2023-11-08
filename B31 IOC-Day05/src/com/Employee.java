package com;

public class Employee {
	private int eid;

	private String ename;

	private Company company;// byType

	private Company company2;

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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Company getCompany2() {
		return company2;
	}

	public void setCompany2(Company company2) {
		this.company2 = company2;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", company=" + company + ", company2=" + company2 + "]";
	}

}
