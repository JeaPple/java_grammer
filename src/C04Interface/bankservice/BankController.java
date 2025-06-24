package C04Interface.bankservice;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber);
        BankService bankService;
        while (true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();

            if (serviceNumber.equals("1")) {
                // 입금방식 분기처리
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                int i = sc.nextInt();
                if (i == 1) {
                    bankService = new BankKakaoService();
                } else bankService = new BankTossService();
                sc.nextLine();

                System.out.println("입금하실 금액을 입력해주세요.");
                Long money = Long.parseLong(sc.nextLine());

                bankService.deposit(money, bankAccount);
                System.out.println("입금이 완료되었습니다. 현재 잔액 : " + bankAccount.getBalance() + "원 입니다.");
            } else {
                // 입금방식 분기처리
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                int i = sc.nextInt();
                if (i == 1) {
                    bankService = new BankKakaoService();
                } else bankService = new BankTossService();
                sc.nextLine();

                System.out.println("출금하실 금액을 입력해주세요.");
                Long money = Long.parseLong(sc.nextLine());

                if (bankService.withdraw(money, bankAccount)) {
                    System.out.println("출금이 정상처리되었습니다. 현재 잔액 : " + bankAccount.getBalance() + "원 입니다.");
                } else {
                    System.out.println("잔액부족입니다.");
                }
            }
        }

    }
}
