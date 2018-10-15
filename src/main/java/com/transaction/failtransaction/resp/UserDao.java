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
}
