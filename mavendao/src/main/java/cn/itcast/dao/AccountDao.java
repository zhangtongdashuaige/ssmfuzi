package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface AccountDao {

    List<Account> findAll();


    void updateAccount(Account account);

    List<Account> findByName(String name);
}
