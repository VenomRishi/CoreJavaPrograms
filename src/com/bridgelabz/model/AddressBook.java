package com.bridgelabz.model;

import java.util.List;

public class AddressBook {
	private List<MH> mh;
	private List<DL> dl;
	private List<HR> hr;
	private List<GJ> gj;
	private String statename;

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public List<MH> getMh() {
		return mh;
	}

	public void setMh(List<MH> mh) {
		this.mh = mh;
	}

	public List<DL> getDl() {
		return dl;
	}

	public void setDl(List<DL> dl) {
		this.dl = dl;
	}

	public List<HR> getHr() {
		return hr;
	}

	public void setHr(List<HR> hr) {
		this.hr = hr;
	}

	public List<GJ> getGj() {
		return gj;
	}

	public void setGj(List<GJ> gj) {
		this.gj = gj;
	}

	@Override
	public String toString() {
		return "AddressBook [mh=" + mh + ", dl=" + dl + ", hr=" + hr + ", gj=" + gj + "]";
	}

}
