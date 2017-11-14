/**
 * 
 */
package org.dummy.emp;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="EMPLOYEE_DETAILS")
public class Employee {
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, long phone) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getPrividentFund() {
		return prividentFund;
	}

	public void setPrividentFund(float prividentFund) {
		this.prividentFund = prividentFund;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}



	@Id
	@GeneratedValue
	
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "NAME",length=150,nullable=false)
	private String name;
	@Column(name = "EMAIL_ID",length=100,nullable=false,unique=true)
	private String email;
	@Column(name = "PHONE",length=100)
	private long phone;
	@Column(name = "BASIC_SALARY")
	private double basicSalary;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "TA")
	private float travelAllowance;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "PF")
	private float prividentFund;
	@Transient
	private float netSalary;
}
