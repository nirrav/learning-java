package com.nirrav.employee.facade;

import java.util.List;

import com.nirrav.employee.model.LeaveRequestDO;

public class LeaveFacadeImpl implements LeaveFacade {

	private final LeaveService leaveService;
	
	public LeaveFacadeImpl(LeaveService leaveService) {
		this.leaveService= leaveService;
	}
	
	@Override
	public void applyForLeave(LeaveRequestDO leaveRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LeaveRequestDO> getAllLeaves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void approveLeave(int leaveId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rejectLeave(int leaveId) {
		// TODO Auto-generated method stub
		
	}

}
