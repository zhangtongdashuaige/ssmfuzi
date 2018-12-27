package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String a(Model model){
        List<Account> all = accountService.findAll();
        model.addAttribute("items" ,all);
        return "itemDetail";
    }
    @RequestMapping("/update")
    public String b(Account account){
        Account accounta = accountService.findByName(account.getName());
        if (accounta==null){
            return "eroor";
        }
        accounta.setMoney(account.getMoney());
        accountService.updateAccount(accounta);
        return "forward:findAll";
    }

}
