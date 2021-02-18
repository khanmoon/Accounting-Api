package com.ofss.accounting.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ofss.accounting.entity.enums.Account_Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Account {
    public Account(String name, Account_Type accountType){
        this.name = name;
        this.accountType = accountType;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Account_Type accountType;

    @ManyToOne
    private Account parentAccount;

    @OneToMany(mappedBy = "parentAccount")
    @JsonIgnore
    private Set<Account> accounts = new HashSet<>();

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private Set<Posting> postings = new HashSet<>();
}
