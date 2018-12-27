package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountTest {
    @Test
    public void test(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext_sevice.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

    }
}
