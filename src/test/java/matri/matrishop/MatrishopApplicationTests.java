package matri.matrishop;

import matri.matrishop.model.Account;
import matri.matrishop.service.AccountService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MatrishopApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	AccountService accountService;

	@Test
	@DisplayName("조회")
	void test() {
		Account name = accountService.getName(1);
		System.out.println("name = " + name.toString());
	}
}
