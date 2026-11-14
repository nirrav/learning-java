package com.nirrav.employee.facade;

import java.util.List;

import com.nirrav.employee.model.LeaveRequestDO;

public interface LeaveFacade {

	void applyForLeave(LeaveRequestDO leaveRequest);
	
	List<LeaveRequestDO> getAllLeaves();
	
	void approveLeave(int leaveId);
	
	void rejectLeave(int leaveId);
}
