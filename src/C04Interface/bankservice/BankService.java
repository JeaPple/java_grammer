package C04Interface.bankservice;

public interface BankService {
    // 입금
    void deposit(Long money, BankAccount bankAccount);

    // 출금
    boolean withdraw(Long money, BankAccount bankAccount);
}
