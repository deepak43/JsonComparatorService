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
}
