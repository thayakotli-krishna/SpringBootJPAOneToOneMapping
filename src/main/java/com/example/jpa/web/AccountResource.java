package com.example.jpa.web;

import com.example.jpa.entities.Account;
import com.example.jpa.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountResource {

    private final AccountService accountService;

    public AccountResource(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return new ResponseEntity<Account>(accountService.save(account), HttpStatus.CREATED);
    }

    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable("accountId") Long id) {
        return accountService.findOne(id);
    }
}
