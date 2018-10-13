package com.transaction.failtransaction.resp;

import com.transaction.failtransaction.entity.Mail;
import com.transaction.failtransaction.entity.User;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 * @author  liuhuan
 * user dao
 */
public interface UserDao extends JpaRepository<User,Integer> {

	@SQLInsert(sql = "insert into user(name,sex,age,address,birthday,email,mobile,remark) values " +
			"({user.name},{user.sex},{user.age},{user.address},{user.birthday},{user.email},{user.mobile},{user.remark})")
	public Mail createUser(User  user);
}
