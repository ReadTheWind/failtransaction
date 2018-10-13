package com.transaction.failtransaction.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author  liuhuan
 * 用户实体类
 */
@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "sex")
	private String sex;
	@Column(name = "age")
	private int age;
	@Column(name = "address")
	private String address;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "remark")
	private String remark;


}
