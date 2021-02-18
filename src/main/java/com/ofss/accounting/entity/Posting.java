package com.ofss.accounting.entity;

import com.ofss.accounting.entity.enums.Transaction_Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Posting {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Journal journalEntry;

    private Double Amount;

    @Enumerated(EnumType.STRING)
    private Transaction_Type transactionType;

    @ManyToOne
    private Account account;

}
