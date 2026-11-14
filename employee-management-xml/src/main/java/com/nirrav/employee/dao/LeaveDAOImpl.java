package com.nirrav.employee.dao;

import java.util.ArrayList;
import java.util.List;

import com.nirrav.employee.model.LeaveRequestDO;

public class LeaveDAOImpl implements LeaveDAO {

	private final List<LeaveRequestDO> leaves= new ArrayList<>();
	
	@Override
	public void applyForLeave(LeaveRequestDO leaveRequest) {
		// TODO Auto-generated method stub
		leaves.add(leaveRequest);
		System.out.println("Leave application sent successfully!!");
	}

	@Override
	public List<LeaveRequestDO> getAllLeaves() {
		// TODO Auto-generated method stub
		return leaves;
	}

	@Override
	public LeaveRequestDO getLeaveById(int leaveId) {
		// TODO Auto-generated method stub
		for(LeaveRequestDO leave: leaves) {
			if(leave.getLeaveId()==leaveId) {
				return leave;
			}
		}
		return null;
	}

	@Override
	public void updateLeaveStatus(int leaveId, String status) {
		// TODO Auto-generated method stub
		LeaveRequestDO leave= getLeaveById(leaveId);
		
		if(leave != null) {
			if(status.equalsIgnoreCase("approved")) {
				leave.setLeaveStatus("APPROVED");
				System.out.println("Leave Approved with ID: "+leaveId);
			}
			else if(status.equalsIgnoreCase("rejected")) {
				leave.setLeaveStatus("REJECTED");
				System.out.println("Leave Rejected with ID: "+leaveId);
			}
			else {
				System.out.println("INVALID STATUS!!!");
			}
		}
	}

}
