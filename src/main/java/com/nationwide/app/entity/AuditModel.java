package com.nationwide.app.entity;

import java.util.Date;

public abstract class AuditModel {

	private Date created;
	private String createdBy;
	private Date updated;
	private String updatedBy;
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Override
	public String toString() {
		return "AuditModel [created=" + created + ", createdBy=" + createdBy + ", updated=" + updated + ", updatedBy="
				+ updatedBy + "]";
	}
	
	
}
