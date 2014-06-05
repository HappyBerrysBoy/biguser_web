package com.spring.main;

import com.spring.bean.T_vessel_schedule_history;

public class TerminalDaoImpl implements TerminalDao{

	@Override
	public T_vessel_schedule_history checkTerminalInfo(String ins_dt, String ins_tm){
		String url = "";
		
		T_vessel_schedule_history terminalInfo = null;
		terminalInfo.setIns_dt("20140603");
		terminalInfo.setIns_tm("100000");
		terminalInfo.setTerminal_id("HPNT");
		
		return terminalInfo;
	}
}
