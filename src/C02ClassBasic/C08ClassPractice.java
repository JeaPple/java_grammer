package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체 선언 및 List에 2개 정도 add
        List<Account> accountList = new ArrayList<>();
        Account account1 = new Account("kim", "1111-111-11", 1000000L);
        Account account2 = new Account("lee", "2222-221-11", 100000000L);

        accountList.add(account1);
        accountList.add(account2);
        System.out.println(accountList);


    }
}

// Account 클래스
// 필드 값: 계좌주명(name-String), 계좌번호(accountNumber-String), 잔고(balance-Long)
class Account{
    private String name;
    private String accountNumber;
    private Long balance;


    public Account(String name, String accountNumber, Long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
