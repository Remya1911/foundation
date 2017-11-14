package org.dummy.emp1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_DETAILS")
public class Bank {

	public Bank() {

	}

	public Bank(int acc_no, String name, String email, long phone, String city) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Id

	@Column(name = "Acc_no")
	private int acc_no;
	@Column(name = "NAME", length = 150, nullable = false)
	private String name;
	@Column(name = "EMAIL_ID", length = 100, nullable = false, unique = true)
	private String email;
	@Column(name = "PHONE", length = 100)
	private long phone;
	@Column(name = "CITY", length = 150, nullable = false)
	private String city;

}
