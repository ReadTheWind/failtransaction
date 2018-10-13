package com.transaction.failtransaction.service.impl;

import com.transaction.failtransaction.entity.Mail;
import com.transaction.failtransaction.entity.User;
import com.transaction.failtransaction.resp.EmailDao;
import com.transaction.failtransaction.resp.UserDao;
import com.transaction.failtransaction.service.IUserService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  liuhuan
 * userService impl
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserDao userDao;

	@Autowired
	EmailDao emailDao;



	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addUser(User user){
		userDao.save(user);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void sendEmail(Mail mail){
		emailDao.save(mail);
		throw  new RuntimeException("sss");
	}

//	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addUserAndSendEmail(User user, Mail mail){
		userDao.save(user);
		try {
			IUserService iUserService = (IUserService) AopContext.currentProxy();
			iUserService.sendEmail(mail);
//			sendEmail(mail);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
