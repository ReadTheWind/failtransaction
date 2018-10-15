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
}
