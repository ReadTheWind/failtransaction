package com.transaction.failtransaction.resp;

import com.transaction.failtransaction.entity.Mail;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author liuhuan
 * email dao
 */
public interface EmailDao extends JpaRepository<Mail,Integer> {

	@SQLInsert(sql = "insert into mail(email_head,email_content,email_end,remark) values ({mail.emailHead},{mail.email_content},{mail.email_end})")
	public Mail createMail(Mail mail);

}
