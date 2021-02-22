package com.ofss.accounting.repository;

import com.ofss.accounting.entity.Account;
import com.ofss.accounting.entity.enums.Account_Type;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;
    @Test
    @DirtiesContext
    @Transactional
    public void selfTest(){
//        List<Account> accountList =  accountRepository.findAll();
//        accountList.forEach(item->{
//            log.info(item.getName());
//        });
        Account account = new Account("Income", Account_Type.LIABILITY);
        Account account1 = new Account("Salary",Account_Type.LIABILITY);
        accountRepository.save(account1);
        account.addChildAccount(account1);
        accountRepository.save(account);
        Optional<Account> account2 = accountRepository.findById(account.getId());
        log.info(account2.get().getName());
        Set<Account> childs = account2.get().getChildAccounts();
        childs.forEach(item->{
            log.info(item.getName());
        });
    }
    @Test
    @DirtiesContext
    public void findByNameTest(){
        Account account = new Account("Income", Account_Type.LIABILITY);
        accountRepository.save(account);
        Account account1 = accountRepository.findAccountByName("Income");
        assertEquals("Income",account1.getName());
    }

    @Test
    @Transactional
    public void insertAccount(){
        Account account = accountRepository.findAccountByName("Income");
        Account account1 = new Account("Salary",Account_Type.LIABILITY);
        accountRepository.save(account1);
        account.addChildAccount(account1);
    }
}