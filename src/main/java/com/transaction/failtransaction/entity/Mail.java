package com.transaction.failtransaction.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author liuhuan
 * 邮件信息实体类
 */
@Entity
@Data
@Table(name = "mail")
public class Mail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	@Column(name = "email_head")
	private String emailHead;
	@Column(name = "email_content")
	private  String emailContent;
	@Column(name = "email_end")
	private  String emailEnd;
	@Column(name = "remark")
	private String remark;
}
