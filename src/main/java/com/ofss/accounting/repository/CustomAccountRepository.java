package com.ofss.accounting.repository;

import com.ofss.accounting.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Set;

@Repository
@Transactional
public class CustomAccountRepository {
    private EntityManager em;
    private AccountRepository accountRepository;
    @Autowired
    CustomAccountRepository(EntityManager em, AccountRepository accountRepository){
        this.accountRepository = accountRepository;
        this.em = em;
    }
    void saveWithParent(Account account, String parentAccountId){
        Account parentAccount = accountRepository.findAccountByName(parentAccountId);
        account.setParentAccount(account);
        accountRepository.save(account);
    }
}
