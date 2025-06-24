package C04Interface.bankservice;

public class BankServiceOriginal {
    // 입금
    public void deposit(Long money, BankAccount bankAccount) {
        // 현재 얼마있는지 조회
        Long balance = bankAccount.getBalance();

        // 그 금액과 money와 합산하여 updateBalance
        balance += money;
        bankAccount.updateBalance(balance);
    }

    // 출금
    public boolean withdraw(Long money, BankAccount bankAccount) {
        // 현재 얼마있는지 조회 && 출금금액과 비교
        Long balance = bankAccount.getBalance();

        // 그 금액과 money와 차감하여 updateBalance
        if (money > balance) {
            return false;
        } else {
            bankAccount.updateBalance(balance -= money);
            return true;
        }
    }

}
