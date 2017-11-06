package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = {@NamedQuery(name = "Login.getAll", query = "SELECT b FROM CompanyMaster b")})
public class Login implements Serializable {

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", password=" + password
				+ ", type=" + type + "]";
	}

	
	private static final long serialVersionUID = -5468237997249019694L;

	@Id
	String loginId;
	
	String password;
	
	char type;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	
}
