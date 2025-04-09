package com.atvfixacao;

import com.atvfixacao.service.AccountService;

public class Main {
    public static void main(String[] args) {
        AccountService accService = new AccountService();
        accService.transaction();
    }
    
}
