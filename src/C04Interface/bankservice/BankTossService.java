package C04Interface.bankservice;

public class BankTossService implements BankService{
    @Override
    public void deposit(Long money, BankAccount bankAccount) {
        System.out.println("!!토스 입금 이용!!");
        // 현재 얼마있는지 조회
        Long balance = bankAccount.getBalance();

        // 그 금액과 money와 합산하여 updateBalance
        balance += money;
        bankAccount.updateBalance(balance);
    }

    @Override
    public boolean withdraw(Long money, BankAccount bankAccount) {
        System.out.println("!!토스 출금 이용!!");
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
