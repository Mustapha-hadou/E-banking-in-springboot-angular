package com.example.ebanking.entity;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "")
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;

	@Column(name = "name")
	public String name;

	@Column(name = "localisation")
	public String localisation;
	
	@OneToMany(mappedBy = "agent",cascade = CascadeType.ALL)
	List<Users> users;
}
