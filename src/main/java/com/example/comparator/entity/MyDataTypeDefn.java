package com.example.comparator.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class MyDataTypeDefn {
	private String d_dataTypeDefnId;
	private String d_name;
	@ElementCollection
	private List<String> parameterDefns;

	public MyDataTypeDefn()
	{
	}
	
	public String getD_dataTypeDefnId() {
		return d_dataTypeDefnId;
	}

	public void setD_dataTypeDefnId(String d_dataTypeDefnId) {
		this.d_dataTypeDefnId = d_dataTypeDefnId;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public List<String> getParameterDefns() {
		return parameterDefns;
	}

	public void setParameterDefns(List<String> parameterDefns) {
		this.parameterDefns = parameterDefns;
	}
}
