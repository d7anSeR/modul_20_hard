package example.service;

import example.model.Account;

import java.util.List;

public interface AccountService {

    void createAccount(Account account);

    List<Account> findByFirstName(String firstName);
}
