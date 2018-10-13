package com.transaction.failtransaction.service.impl;

import com.transaction.failtransaction.entity.Mail;
import com.transaction.failtransaction.resp.EmailDao;
import com.transaction.failtransaction.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuhuan
 */
@Service
public class EmailServiceImpl implements IEmailService {

	@Autowired
	EmailDao emailDao;

	@Override
	public void addEmail(Mail mail) {
		emailDao.save(mail);
	}
}
