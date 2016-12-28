package com.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "User")
public class User implements java.io.Serializable {
	@Id
	@Column(name = "id")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	@NotNull
	@Column(name = "username")
	  private String username;

	@NotNull
	@Column(name = "password")
	  private String passowrd;
	  
	  public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

}
