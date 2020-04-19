package com.example.comparator.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class MyDocHeadersList {
	
	@ElementCollection
	private List<String> apiHeders; 

	public MyDocHeadersList()
	{
		
	}

	@JsonIgnore
	public List<String> getApiHeders() {
		return apiHeders;
	}

	@JsonProperty
	public void setApiHeders(List<String> apiHeders) {
		this.apiHeders = apiHeders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apiHeders == null) ? 0 : apiHeders.hashCode());
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
		MyDocHeadersList other = (MyDocHeadersList) obj;
		if (apiHeders == null) {
			if (other.apiHeders != null)
				return false;
		} else if (!apiHeders.equals(other.apiHeders))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyDocHeadersList [apiHeders=" + apiHeders + "]";
	}
	
}
