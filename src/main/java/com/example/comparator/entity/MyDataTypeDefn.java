package com.example.comparator.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Embeddable
public class MyDataTypeDefn {
	@Column(name = "dtype_dataTypeDefnId")
	private String dataTypeDefnId;
	@Column(name = "dtype_name")
	private String name;
	@ElementCollection
	@JsonInclude(value = Include.NON_EMPTY)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataTypeDefnId == null) ? 0 : dataTypeDefnId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parameterDefns == null) ? 0 : parameterDefns.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDataTypeDefn other = (MyDataTypeDefn) obj;
		if (dataTypeDefnId == null) {
			if (other.dataTypeDefnId != null)
				return false;
		} else if (!dataTypeDefnId.equals(other.dataTypeDefnId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parameterDefns == null) {
			if (other.parameterDefns != null)
				return false;
		} else if (!parameterDefns.equals(other.parameterDefns))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyDataTypeDefn [dataTypeDefnId=" + dataTypeDefnId + ", name=" + name + ", parameterDefns="
				+ parameterDefns + "]";
	}
	
}
