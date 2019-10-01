package com.example.jpa.service;

import com.example.jpa.entities.Account;

public interface AccountService {

    Account findOne(Long id);

    Account save(Account account);
}
