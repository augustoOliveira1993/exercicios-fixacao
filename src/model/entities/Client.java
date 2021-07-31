package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private Date birdDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String name, String email, Date birdDate) {
		this.name = name;
		this.email = email;
		this.birdDate = birdDate;
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

	public Date getBirdDate() {
		return birdDate;
	}

	public void setBirdDate(Date birdDate) {
		this.birdDate = birdDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + " (");
		sb.append(sdf.format(this.birdDate) + ") - ");
		sb.append(this.email);
		return sb.toString();
	}
}
