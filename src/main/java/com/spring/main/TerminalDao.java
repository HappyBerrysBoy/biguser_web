package com.spring.main;

import com.spring.bean.T_vessel_schedule_history;

public interface TerminalDao {

	T_vessel_schedule_history checkTerminalInfo(String ins_dt, String ins_tm);
}
