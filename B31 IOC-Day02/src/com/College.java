package com;

public class College {

	private int cid;
	
	private String cname;
	
	public College(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + "]";
	}

}
