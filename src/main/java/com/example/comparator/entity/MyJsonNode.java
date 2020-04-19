package com.example.comparator.entity;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class MyJsonNode {
	@Id
	@GeneratedValue
	@JsonIgnore
	private int id;
	
	private String apiConnectionDefnId;
	private String apiPath;
	private String name;
	private String label;
	private String description;
	private float version;
	private boolean activeFlag; 
	private String type;
	private String tenantId;
	private String apiConnectionDefn;
	private String baseMasterDataDefnId;
	private String objectDefn;
	
	@Embedded 
	private MyDocHeadersList apiHeaders;

	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
	@Embedded 
	private Map<String, MyFieldNode> fields;
	
	public MyJsonNode()
	{
	}

	@JsonIgnore
	public int getId() {
		return id;
	}

	@JsonProperty
	public void setId(int id) {
		this.id = id;
	}

	public String getApiConnectionDefnId() {
		return apiConnectionDefnId;
	}
	
	public void setApiConnectionDefnId(String apiConnectionDefnId) {
		this.apiConnectionDefnId = apiConnectionDefnId;
	}

	public String getApiPath() {
		return apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
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

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public MyDocHeadersList getApiHeaders() { 
		return apiHeaders; 
	}
	
	public void setApiHeaders(MyDocHeadersList apiHeaders) { 
		this.apiHeaders = apiHeaders; 
	}

	public String getApiConnectionDefn() {
		return apiConnectionDefn;
	}

	public void setApiConnectionDefn(String apiConnectionDefn) {
		this.apiConnectionDefn = apiConnectionDefn;
	}

	public String getBaseMasterDataDefnId() {
		return baseMasterDataDefnId;
	}

	public void setBaseMasterDataDefnId(String baseMasterDataDefnId) {
		this.baseMasterDataDefnId = baseMasterDataDefnId;
	}

	public String getObjectDefn() {
		return objectDefn;
	}

	public void setObjectDefn(String objectDefn) {
		this.objectDefn = objectDefn;
	}
	
	public Map<String, MyFieldNode> getFields() { 
		return fields;
	}
	  
	public void setFields(Map<String, MyFieldNode> fields) { 
		this.fields = fields; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activeFlag ? 1231 : 1237);
		result = prime * result + ((apiConnectionDefn == null) ? 0 : apiConnectionDefn.hashCode());
		result = prime * result + ((apiConnectionDefnId == null) ? 0 : apiConnectionDefnId.hashCode());
		result = prime * result + ((apiHeaders == null) ? 0 : apiHeaders.hashCode());
		result = prime * result + ((apiPath == null) ? 0 : apiPath.hashCode());
		result = prime * result + ((baseMasterDataDefnId == null) ? 0 : baseMasterDataDefnId.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((fields == null) ? 0 : fields.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((objectDefn == null) ? 0 : objectDefn.hashCode());
		result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + Float.floatToIntBits(version);
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
		MyJsonNode other = (MyJsonNode) obj;
		if (activeFlag != other.activeFlag)
			return false;
		if (apiConnectionDefn == null) {
			if (other.apiConnectionDefn != null)
				return false;
		} else if (!apiConnectionDefn.equals(other.apiConnectionDefn))
			return false;
		if (apiConnectionDefnId == null) {
			if (other.apiConnectionDefnId != null)
				return false;
		} else if (!apiConnectionDefnId.equals(other.apiConnectionDefnId))
			return false;
		if (apiPath == null) {
			if (other.apiPath != null)
				return false;
		} else if (!apiPath.equals(other.apiPath))
			return false;
		if (baseMasterDataDefnId == null) {
			if (other.baseMasterDataDefnId != null)
				return false;
		} else if (!baseMasterDataDefnId.equals(other.baseMasterDataDefnId))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (fields == null) {
			if (other.fields != null)
				return false;
		} else if (!(fields.size()==other.fields.size()))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (objectDefn == null) {
			if (other.objectDefn != null)
				return false;
		} else if (!objectDefn.equals(other.objectDefn))
			return false;
		if (tenantId == null) {
			if (other.tenantId != null)
				return false;
		} else if (!tenantId.equals(other.tenantId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Float.floatToIntBits(version) != Float.floatToIntBits(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyJsonNode [id=" + id + ", apiConnectionDefnId=" + apiConnectionDefnId + ", apiPath=" + apiPath
				+ ", name=" + name + ", label=" + label + ", description=" + description + ", version=" + version
				+ ", activeFlag=" + activeFlag + ", type=" + type + ", tenantId=" + tenantId + ", apiConnectionDefn="
				+ apiConnectionDefn + ", baseMasterDataDefnId=" + baseMasterDataDefnId + ", objectDefn=" + objectDefn
				+ ", apiHeaders=" + apiHeaders + ", fields=" + fields + "]";
	}

}
