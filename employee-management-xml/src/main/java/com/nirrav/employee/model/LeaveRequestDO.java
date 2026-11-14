package com.nirrav.employee.model;

import java.util.Date;

public class LeaveRequestDO {

	private int leaveId;
	private int employeeId;
	private Date startDate;
	private Date endDate;
	private String leaveType;
	private String leaveStatus;
	
	/**
	 * @return the leaveId
	 */
	public int getLeaveId() {
		return leaveId;
	}
	/**
	 * @param leaveId the leaveId to set
	 */
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the leaveType
	 */
	public String getLeaveType() {
		return leaveType;
	}
	/**
	 * @param leaveType the leaveType to set
	 */
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	/**
	 * @return the leaveStatus
	 */
	public String getLeaveStatus() {
		return leaveStatus;
	}
	/**
	 * @param leaveStatus the leaveStatus to set
	 */
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	
	@Override
	public String toString() {
		return "LeaveRequestDO [leaveId=" + leaveId + ", employeeId=" + employeeId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus + "]";
	}
}
