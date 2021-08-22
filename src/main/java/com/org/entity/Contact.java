package com.org.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")
@Data
public class Contact {

	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_PH")
	private Long phoneNo;

	@Column(name = "CONTACT_EMAIL")
	private String email;

	@Column(name = "ACTIVE_SW")
	private Character activeSW;

	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;

	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;

}
