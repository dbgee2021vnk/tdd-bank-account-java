package org.xpdojo.bank;

//import org.junit.;
import static org.hamcrest.Matchers.is;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


//import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.assertj.core.api.Assertions.assertThat;
//import org.junit.jupiter.api.Assertions.*;


public class AccountTest {

    @Test

    public void startingBalanceIsZero()

    {
        Account account = new Account();
        assertThat(account.balance,is(0));

    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        //   assertThat("your first test").isBlank();
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, is(100));
    }

    @Test
    public void depositMultipleAmounts() {
        //   assertThat("your first test").isBlank();
        Account account = new Account();
        account.deposit(100);
        account.deposit(300);
        assertThat(account.balance, is(400));
    }

}