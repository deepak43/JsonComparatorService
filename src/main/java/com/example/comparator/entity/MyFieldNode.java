package com.example.comparator.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class MyFieldNode {

	@Id
	@GeneratedValue
	@JsonIgnore
	private int id;
	private String name;
	private String label;
	private String description;
	private String dataTypeDefnId;
	
	@Embedded
	private MyDataTypeDefn dataTypeDefn;
	
	@Embedded 
	private MyDocHeadersList dataTypeDefnParameters;
	
	private float sequence;
	private boolean searchableFlag;
	private boolean deletedFlag;
	private boolean primaryKeyFlag;
	private boolean uniqueKeyFlag;
	private boolean nullableFlag;
	private String tenantId;
	private boolean localizedFlag;
	
	public MyFieldNode()
	{
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDataTypeDefnId() {
		return dataTypeDefnId;
	}

	public void setDataTypeDefnId(String dataTypeDefnId) {
		this.dataTypeDefnId = dataTypeDefnId;
	}

	public MyDataTypeDefn getDataTypeDefn() {
		return dataTypeDefn;
	}

	public void setDataTypeDefn(MyDataTypeDefn dataTypeDefn) {
		this.dataTypeDefn = dataTypeDefn;
	}

	public MyDocHeadersList getDataTypeDefnParameters() {
		return dataTypeDefnParameters;
	}

	public void setDataTypeDefnParameters(MyDocHeadersList dataTypeDefnParameters) {
		this.dataTypeDefnParameters = dataTypeDefnParameters;
	}

	public float getSequence() {
		return sequence;
	}

	public void setSequence(float sequence) {
		this.sequence = sequence;
	}

	public boolean isSearchableFlag() {
		return searchableFlag;
	}

	public void setSearchableFlag(boolean searchableFlag) {
		this.searchableFlag = searchableFlag;
	}

	public boolean isDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public boolean isPrimaryKeyFlag() {
		return primaryKeyFlag;
	}

	public void setPrimaryKeyFlag(boolean primaryKeyFlag) {
		this.primaryKeyFlag = primaryKeyFlag;
	}

	public boolean isUniqueKeyFlag() {
		return uniqueKeyFlag;
	}

	public void setUniqueKeyFlag(boolean uniqueKeyFlag) {
		this.uniqueKeyFlag = uniqueKeyFlag;
	}

	public boolean isNullableFlag() {
		return nullableFlag;
	}

	public void setNullableFlag(boolean nullableFlag) {
		this.nullableFlag = nullableFlag;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public boolean isLocalizedFlag() {
		return localizedFlag;
	}

	public void setLocalizedFlag(boolean localizedFlag) {
		this.localizedFlag = localizedFlag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataTypeDefn == null) ? 0 : dataTypeDefn.hashCode());
		result = prime * result + ((dataTypeDefnId == null) ? 0 : dataTypeDefnId.hashCode());
		result = prime * result + ((dataTypeDefnParameters == null) ? 0 : dataTypeDefnParameters.hashCode());
		result = prime * result + (deletedFlag ? 1231 : 1237);
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + (localizedFlag ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (nullableFlag ? 1231 : 1237);
		result = prime * result + (primaryKeyFlag ? 1231 : 1237);
		result = prime * result + (searchableFlag ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(sequence);
		result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
		result = prime * result + (uniqueKeyFlag ? 1231 : 1237);
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
		MyFieldNode other = (MyFieldNode) obj;
		if (dataTypeDefn == null) {
			if (other.dataTypeDefn != null)
				return false;
		} else if (!dataTypeDefn.equals(other.dataTypeDefn))
			return false;
		if (dataTypeDefnId == null) {
			if (other.dataTypeDefnId != null)
				return false;
		} else if (!dataTypeDefnId.equals(other.dataTypeDefnId))
			return false;
		if (dataTypeDefnParameters == null) {
			if (other.dataTypeDefnParameters != null)
				return false;
		} else if (!dataTypeDefnParameters.equals(other.dataTypeDefnParameters))
			return false;
		if (deletedFlag != other.deletedFlag)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (localizedFlag != other.localizedFlag)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nullableFlag != other.nullableFlag)
			return false;
		if (primaryKeyFlag != other.primaryKeyFlag)
			return false;
		if (searchableFlag != other.searchableFlag)
			return false;
		if (Float.floatToIntBits(sequence) != Float.floatToIntBits(other.sequence))
			return false;
		if (tenantId == null) {
			if (other.tenantId != null)
				return false;
		} else if (!tenantId.equals(other.tenantId))
			return false;
		if (uniqueKeyFlag != other.uniqueKeyFlag)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyFieldNode [id=" + id + ", name=" + name + ", label=" + label + ", description=" + description
				+ ", dataTypeDefnId=" + dataTypeDefnId + ", dataTypeDefn=" + dataTypeDefn + ", dataTypeDefnParameters="
				+ dataTypeDefnParameters + ", sequence=" + sequence + ", searchableFlag=" + searchableFlag
				+ ", deletedFlag=" + deletedFlag + ", primaryKeyFlag=" + primaryKeyFlag + ", uniqueKeyFlag="
				+ uniqueKeyFlag + ", nullableFlag=" + nullableFlag + ", tenantId=" + tenantId + ", localizedFlag="
				+ localizedFlag + "]";
	}
}
