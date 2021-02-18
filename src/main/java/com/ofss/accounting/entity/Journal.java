package com.ofss.accounting.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
public class Journal {

    public Journal(String name,String comment){
        this.name = name;
        this.comment = comment;
    }
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "journalEntry")
    private Set<Posting> postings = new HashSet<>();

    private String name;

    private String comment;
}
