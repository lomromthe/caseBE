package com.example.case_module_4.controller;

import com.example.case_module_4.model.Account;
import com.example.case_module_4.model.Product;
import com.example.case_module_4.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping
    List<Account> getAll(){
        return accountService.getAll();
    }
@DeleteMapping("/{id}")
    public Account delete(@RequestBody int id){
        return accountService.delete(id);
}
}
