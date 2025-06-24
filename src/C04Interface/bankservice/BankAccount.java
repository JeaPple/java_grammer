package C04Interface.bankservice;

public class BankAccount {
    private String accountNumber;
    private Long balance = 0L;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    // 최종 금액을 통해 update : 아래 메서드를 입/출금 모두에 활용
    public void updateBalance(Long balance) {
        this.balance = balance;
    }
}
