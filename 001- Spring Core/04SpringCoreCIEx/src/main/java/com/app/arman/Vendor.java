package com.app.arman;

public class Vendor {

	private String vcode;
	private String vaddr;

	public Vendor(String vcode, String vaddr) {
		super();
		this.vcode = vcode;
		this.vaddr = vaddr;
	}

	@Override
	public String toString() {
		return "Vendor [vcode=" + vcode + ", vaddr=" + vaddr + "]";
	}

}
