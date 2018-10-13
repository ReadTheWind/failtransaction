package com.transaction.failtransaction;

import com.transaction.failtransaction.entity.Mail;
import com.transaction.failtransaction.entity.User;
import com.transaction.failtransaction.service.IEmailService;
import com.transaction.failtransaction.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FailtransactionApplicationTests {

	@Autowired
	IUserService userService;

	private User user;
	private Mail mail;

	@Before
	public  void before(){
		user= new User();
		user.setName("小明");
		user.setAge(28);
		user.setSex("男");
		user.setAddress("深圳南山");
		user.setEmail("1111@163.com");
		user.setMobile("110");
		user.setRemark("我是小明，我要找小美做我女朋友");

		mail=new Mail();
		mail.setEmailHead("约会邀请");
		mail.setEmailContent("美丽的小美，我想要请你看个电影");
		mail.setEmailEnd("希望你能到！!!");
	}

	@Test
	public void testUserAdd() throws Exception {
		userService.addUser(user);
	}

	@Autowired
	IEmailService emailService;

	@Test
	public void testEmailAdd() {
//		emailService.addEmail(mail);
		try {
			userService.sendEmail(mail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void testAddUserAndEmail() throws Exception {
		userService.addUserAndSendEmail(user,mail);

	}

}
