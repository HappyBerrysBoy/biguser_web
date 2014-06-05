package com.spring.main;

import com.spring.bean.T_vessel_schedule_history;

public interface TerminalInfo {

	T_vessel_schedule_history getTerminalInfo(String ins_dt, String ins_tm);
}
