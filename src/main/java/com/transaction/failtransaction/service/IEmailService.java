package com.transaction.failtransaction.service;


import com.transaction.failtransaction.entity.Mail;

/**
 * @author liuhuan
 * email service
 */
public interface IEmailService {

	/**
	 * add email
	 * @param mail
	 */
	public void addEmail(Mail mail);
}
