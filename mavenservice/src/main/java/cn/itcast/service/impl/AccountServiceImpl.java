package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return all;
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public Account findByName(String name) {
        List<Account> accounts = accountDao.findByName(name);
        if (accounts==null||accounts.size()==0){
            return null;
        }
        if (accounts.size()>1){
            throw new RuntimeException("数据重复");
        }
        return accounts.get(0);
    }
}
