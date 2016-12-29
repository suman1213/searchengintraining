package com.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "inputsearch")
public class InputSearch implements java.io.Serializable{
	
	@Id
	@Column(name = "input_search_iD")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long inputsearchiD;
	@NotNull
	@Column(name = "input_name")
	  private String inputname;

	public long getInputsearchiD() {
		return inputsearchiD;
	}

	public void setInputsearchiD(long inputsearchiD) {
		this.inputsearchiD = inputsearchiD;
	}

	public String getInputname() {
		return inputname;
	}

	public void setInputname(String inputname) {
		this.inputname = inputname;
	}

	public String getInputdetails() {
		return inputdetails;
	}

	public void setInputdetails(String inputdetails) {
		this.inputdetails = inputdetails;
	}

	@NotNull
	@Column(name = "input_details")
	  private String inputdetails;
	  
	 
}
