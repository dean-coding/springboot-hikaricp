package com.rangers.dbsource.db2;

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
@Table
public class UserDbTowEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	private String username,password;

	public UserDbTowEntity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
