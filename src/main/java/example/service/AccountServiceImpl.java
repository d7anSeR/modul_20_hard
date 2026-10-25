package example.service;

import example.model.Account;
import example.repository.AccountJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountJpaRepository accountRepository;

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public List<Account> findByFirstName(String firstName) {
        return accountRepository.findByFirstName(firstName);
    }
}
