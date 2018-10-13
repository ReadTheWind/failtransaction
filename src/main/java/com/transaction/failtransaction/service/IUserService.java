package com.transaction.failtransaction.service;

import com.transaction.failtransaction.entity.Mail;
import com.transaction.failtransaction.entity.User;

/**
 * @author  liuhuan
 *user interface
 */
public interface IUserService {

	/**
	 * Add User
	 * @param user
	 */
	public  void addUser(User user) throws Exception;

	public  void  sendEmail(Mail mail) throws Exception;

	public  void  addUserAndSendEmail(User user, Mail mail) throws Exception;
}
