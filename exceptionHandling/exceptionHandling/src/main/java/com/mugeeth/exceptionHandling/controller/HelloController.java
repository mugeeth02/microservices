package com.mugeeth.exceptionHandling.controller;

import com.mugeeth.exceptionHandling.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/accounts/{accountId}")  //http://localhost:8080/api/accounts/4
    public ResponseEntity<Account> getAccounts(@PathVariable("accountId") String accountId){

        // Hard coded output

        Account account = new Account();
        account.setAccountId(accountId);
        account.setName("mugeeth");

        if(accountId.equals("1")){  //http://localhost:8080/api/accounts/1
            throw new IllegalArgumentException();
        }

        if(accountId.equals("2")){  //http://localhost:8080/api/accounts/2
            throw new IllegalStateException();
        }
        //response
        return new ResponseEntity<Account>(account, HttpStatus.OK);

    }
    @ExceptionHandler(value = {IllegalStateException.class} )
    protected ResponseEntity<Object> handleException(IllegalStateException e){
        return new ResponseEntity<Object>("Illegal State exception in Controller", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class) //First priority than global level exception
    public ResponseEntity<Object> handleException(IllegalArgumentException e){
        return new ResponseEntity<Object>("Illegal Argument exception in Controller", HttpStatus.BAD_REQUEST);
    }
}
