package matri.matrishop.service;


import matri.matrishop.mapper.AccountMapper;
import matri.matrishop.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    AccountMapper accountMapper;

    public AccountService(AccountMapper accountMapper){
        this.accountMapper = accountMapper;
    }

    public Account getName(int id) {
        return accountMapper.getName(id);
    }
}
