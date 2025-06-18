package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C02MethodPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (isPrime(input)) {
            System.out.println("입력하신 숫자는 소수입니다.");
        } else {
            System.out.println("입력하신 숫자는 소수가 아닙니다.");
        }
    }

    // 소수 판별 메서드
    public static boolean isPrime(int input) {
        boolean check = true;

        // 약수 갯수 계산
        for (int i = 2; i*i <= input; i++) {
            if (input % i == 0) {
                check = false;
//                메서드에서 return을 만나면 메서드가 강제 종료
                return check;
            }
        }

        return check;
    }

}
