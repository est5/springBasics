package com.example.springdata.repository;

import com.example.springdata.model.Account;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Long> {
    //find = select account = from byname = where
    @Query("SELECT * FROM account WHERE name = :name")
    List<Account> findAccountByName(String name);

    @Modifying // used when query changes data
    @Query("UPDATE account SET amount = :amount WHERE id = :id")
    void changeAmount(long id , BigDecimal amount);

}
