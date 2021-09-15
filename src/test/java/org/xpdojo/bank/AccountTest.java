package org.xpdojo.bank;

import org.junit.Test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    //@Disabled
    //public void depositAnAmountToIncreaseTheBalance() {
    //  assertThat("your first test").isBlank();
    //arrange
    //Account account=new Account();
    //account.deposit(100);
    //assertThat(account.balance,is(100));
    public void startingBalanceIsZero

    {
        Account account = new Account();
        assertThat(account.balance, is(0));

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