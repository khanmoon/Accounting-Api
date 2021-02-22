package com.ofss.accounting.entity;

import com.fasterxml.jackson.annotation.*;
import com.ofss.accounting.entity.enums.Account_Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
    @JsonProperty
    private Long id;

    @Column(unique = true,nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Account_Type accountType;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    @JoinColumn(name = "PARENT_ACCOUNT_ID")
    @EqualsAndHashCode.Exclude
    private Account parentAccount;

    @OneToMany(mappedBy = "parentAccount")
    @EqualsAndHashCode.Exclude
    private Set<Account> childAccounts = new HashSet<>();

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private Set<Posting> postings = new HashSet<>();

    public void addChildAccount(Account childAccount){
        this.childAccounts.add(childAccount);
    }
}
