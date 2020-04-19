package com.example.comparator.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class MyDataTypeDefn {
	@Column(name = "dtype_dataTypeDefnId")
	private String dataTypeDefnId;
	@Column(name = "dtype_name")
	private String name;
	@ElementCollection
	private List<String> parameterDefns;

	public MyDataTypeDefn()
	{
	}

	public String getDataTypeDefnId() {
		return dataTypeDefnId;
	}

	public void setDataTypeDefnId(String dataTypeDefnId) {
		this.dataTypeDefnId = dataTypeDefnId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getParameterDefns() {
		return parameterDefns;
	}

	public void setParameterDefns(List<String> parameterDefns) {
		this.parameterDefns = parameterDefns;
	}
}
