package com.xymiao.tutorial.design.pattern;

import java.math.BigDecimal;

public class BankAccount {
    // 成员变量
    private Long accountNumber;  // 私有， 并且不提供set方法
    private BigDecimal balance;

    // 构造方法
    public BankAccount(Long accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void showBalance() {
        System.out.println(accountNumber + " 账户余额：" + balance);
    }
    /**
     * 存款
     */
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("存款成功，余额为：" + balance);
    }

    /**
     * 取款
     */
    public void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) == -1) {
            System.out.println("余额不足，取款失败");
            throw new RuntimeException("余额不足");
        }
        balance = balance.subtract(amount);
        System.out.println("取款成功，余额为：" + balance);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1L, new BigDecimal(1000));
        BankAccount ba2 = new BankAccount(2L, new BigDecimal(2000));
        ba1.showBalance();
        ba2.showBalance();

        ba2.withdraw(new BigDecimal(2001));
        ba1.deposit(new BigDecimal(100));

        ba1.showBalance();
        ba2.showBalance();
    }
}
