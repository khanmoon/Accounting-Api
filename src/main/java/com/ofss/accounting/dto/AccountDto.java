package com.ofss.accounting.dto;

import com.ofss.accounting.entity.enums.Account_Type;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDto {
    private String Name;
    private AccountDto parentAccount;
    private Account_Type accountType;

}
