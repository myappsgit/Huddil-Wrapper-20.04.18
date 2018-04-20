package myapps.solutions.wrapper.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ViewTerms {

	private int id;
	private String userType;
	private Date PolicyActiveDate;
	private Date PolicyCreatedDate;

	public ViewTerms() {

	}

	public ViewTerms(int id) {
		this.id = id;
	}

	public ViewTerms(int id, String userType, Date policyActiveDate, Date policyCreatedDate) {
		this.id = id;
		this.userType = userType;
		this.PolicyActiveDate = policyActiveDate;
		this.PolicyCreatedDate = policyCreatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getPolicyActiveDate() {
		return PolicyActiveDate;
	}

	public void setPolicyActiveDate(Date policyActiveDate) {
		PolicyActiveDate = policyActiveDate;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date getPolicyCreatedDate() {
		return PolicyCreatedDate;
	}

	public void setPolicyCreatedDate(Date policyCreatedDate) {
		PolicyCreatedDate = policyCreatedDate;
	}

}
