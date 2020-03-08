package com.lagou.edu.pojo;

/**
 * @author 应癫
 */
public class Account {

    private String cardNo;
    private String name;
    private int money;

    private Account account;

    public Account() {
    }

    public Account(String cardNo, String name, int money, Account account) {
        this.cardNo = cardNo;
        this.name = name;
        this.money = money;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCardNo() { return cardNo; }

    public void setCardNo(String cardNo) { this.cardNo = cardNo;}

    @Override
    public String toString() {
        return "Account{" +
                "cardNo='" + cardNo + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", account=" + account +
                '}';
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
