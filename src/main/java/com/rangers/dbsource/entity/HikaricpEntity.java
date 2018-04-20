package com.rangers.dbsource.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hc_tb_one")
public class HikaricpEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	private String username,password;

	public HikaricpEntity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
