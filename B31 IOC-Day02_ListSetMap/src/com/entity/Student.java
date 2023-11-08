package com.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid;

	private List<String> sname;

	private Set<Integer> srollno;

	private Map<Integer, String> school;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public List<String> getSname() {
		return sname;
	}

	public void setSname(List<String> sname) {
		this.sname = sname;
	}

	public Set<Integer> getSrollno() {
		return srollno;
	}

	public void setSrollno(Set<Integer> srollno) {
		this.srollno = srollno;
	}

	public Map<Integer, String> getSchool() {
		return school;
	}

	public void setSchool(Map<Integer, String> school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", srollno=" + srollno + ", school=" + school + "]";
	}

}
