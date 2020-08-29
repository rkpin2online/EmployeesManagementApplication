package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_tab")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id_col")
	private Integer id;

	@Column(name = "emp_fname_col")
	private String firstName;

	@Column(name = "emp_lname_col")
	private String lastName;

	@Column(name = "emp_mail_col")
	private String emailId;
}
