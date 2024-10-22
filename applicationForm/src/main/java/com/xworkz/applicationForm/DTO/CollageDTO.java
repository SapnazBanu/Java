package com.xworkz.applicationForm.DTO;

public class CollageDTO {

	private String name;
	private String email;
	private long mobile;
	private String address;
	private String fathername;
	private String Mothername;
	private int age;

	public CollageDTO(String name, String email, long mobile, String address, String fathername, String mothername,
			int age) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.fathername = fathername;
		Mothername = mothername;
		this.age = age;
	}

	@Override
	public String toString() {
		return "CollageDTO [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", fathername=" + fathername + ", Mothername=" + Mothername + ", age=" + age + "]";
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return Mothername;
	}

	public void setMothername(String mothername) {
		Mothername = mothername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}