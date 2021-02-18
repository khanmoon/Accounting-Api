package com.ofss.accounting;

import com.ofss.accounting.entity.Account;
import com.ofss.accounting.entity.enums.Account_Type;
import com.ofss.accounting.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountingApplication implements CommandLineRunner {

//    @Autowired
//    AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(AccountingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Account account = new Account();
//        account.setAccountType(Account_Type.ASSET);
//        account.setName("Assets");
//        accountRepository.save(account);
    }
}
