package com.spring.main;

import com.spring.bean.T_vessel_schedule_history;

public class TermianlInfoImpl implements TerminalInfo{

	private TerminalDao terminalDao = null;
	
	public void setTerminalDao(TerminalDao terminalDao){
		this.terminalDao = terminalDao;
	}
	
	@Override
	public T_vessel_schedule_history getTerminalInfo(String ins_dt, String ins_tm){
		return terminalDao.checkTerminalInfo(ins_dt, ins_tm);
	}
}
