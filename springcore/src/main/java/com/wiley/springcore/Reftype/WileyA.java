package com.wiley.springcore.Reftype;

public class WileyA {
	private int counta;
	private WileyB ob;
	public int getCounta() {
		return counta;
	}
	public void setCounta(int counta) {
		this.counta = counta;
	}
	public WileyB getOb() {
		return ob;
	}
	public void setOb(WileyB ob) {
		this.ob = ob;
	}
	
	public WileyA() {
		super();
	}
	@Override
	public String toString() {
		return "WileyA [counta=" + counta + ", ob=" + ob + "]";
	}
	
}
