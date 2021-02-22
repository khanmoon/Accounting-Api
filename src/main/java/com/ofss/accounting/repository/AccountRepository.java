package com.ofss.accounting.repository;

import com.ofss.accounting.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface AccountRepository extends JpaRepository<Account,Long> {
    public Account findAccountByName(String name);
}
