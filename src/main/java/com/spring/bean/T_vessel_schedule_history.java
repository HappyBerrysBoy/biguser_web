package com.spring.bean;

import java.io.Serializable;

public class T_vessel_schedule_history implements Serializable{

	private String ins_dt;
	private String ins_tm;
	private String terminal_id;
	
	public String getIns_dt() {
		return ins_dt;
	}
	public void setIns_dt(String ins_dt) {
		this.ins_dt = ins_dt;
	}
	
	public String getIns_tm() {
		return ins_tm;
	}
	public void setIns_tm(String ins_tm) {
		this.ins_tm = ins_tm;
	}
	
	public String getTerminal_id() {
		return terminal_id;
	}
	public void setTerminal_id(String terminal_id) {
		this.terminal_id = terminal_id;
	}
	
	
}
