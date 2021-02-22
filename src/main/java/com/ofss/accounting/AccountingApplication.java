package com.ofss.accounting;

import com.ofss.accounting.entity.Account;
import com.ofss.accounting.entity.enums.Account_Type;
import com.ofss.accounting.repository.AccountRepository;
import com.ofss.accounting.repository.CustomAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class AccountingApplication implements CommandLineRunner {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomAccountRepository customAccountRepository;

    public static void main(String[] args) {
        SpringApplication.run(AccountingApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        Account account = new Account();
//        account.setAccountType(Account_Type.ASSET);
//        account.setName("Assets");
//
//        Account account1 = new Account();
//        account1.setName("Cash in Wallet");
//        account1.setAccountType(Account_Type.ASSET);
//        account.addChildAccount(account1);
//        account1.setParentAccount(account);
//        accountRepository.save(account1);
//        accountRepository.save(account);
//        List<Object[]> result = customAccountRepository.fetchAllAccounts();
//        result.forEach(item->{
//            Account acc = (Account) item[0];
//            Account acc2 = (Account) item[1];
//            System.out.println(""+acc.getName()+acc2.getName());
//        });
//        accounts.forEach(item-> System.out.println(item.getName()));
    }
}
