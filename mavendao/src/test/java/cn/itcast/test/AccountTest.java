package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class AccountTest {

    @Test
    public void test() throws IOException {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        AccountDao accountDao = ac.getBean("accountDao",AccountDao.class);
        List<Account> all = accountDao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

    }
    @Test
    public void test1()  {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        AccountDao accountDao = ac.getBean("accountDao",AccountDao.class);
        Account account = new Account();
        account.setId(4);
        account.setMoney(2000.0);
        accountDao.updateAccount(account);

    }
}
