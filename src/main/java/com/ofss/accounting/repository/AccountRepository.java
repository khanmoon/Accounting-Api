package com.ofss.accounting.repository;

import com.ofss.accounting.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface AccountRepository extends JpaRepository<Account,Long> {
}
