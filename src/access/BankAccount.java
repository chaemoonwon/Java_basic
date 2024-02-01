package access;

import java.awt.print.Pageable;

public class BankAccount {

    //접근제어자와 캡슐화를 통해 데이터를 안전하게 보호하고, 해당 기능을 사용하는 복잡도를 낮출 수 있음.
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드: deposit = 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }

    // public 메서드: withdraw = 출금
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {   //잔고
        return balance;
    }


}
