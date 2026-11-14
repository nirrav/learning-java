package com.nirrav.employee.dao;

import java.util.List;

import com.nirrav.employee.model.LeaveRequestDO;

public interface LeaveDAO {

	void applyForLeave(LeaveRequestDO leaveRequest);

	List<LeaveRequestDO> getAllLeaves();

	LeaveRequestDO getLeaveById(int leaveId);

	void updateLeaveStatus(int leaveId, String status);
}
