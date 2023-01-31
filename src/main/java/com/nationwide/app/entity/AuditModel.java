package com.nationwide.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdDate", "updatedDate" }, allowGetters = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class AuditModel {

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = true, updatable = false)
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = true, updatable = false)
	@LastModifiedDate
	private Date updatedDate;
	
	@Column(name = "updated_by")
	private String updatedBy;
	

	
}
