package CO1Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
        byte a = 127;
        byte b = -128;
        //        오버플로우 : 자료형이 표현할 수 있는 범위를 넘어선 경우
        a++;
//        언더플로우
        b--;
        System.out.println(a);
        System.out.println(b);

//        long은 명시적으로 L을 붙여 long타입임을 명시하기도 함
        Long l1 = 20L;
//        실수: float, double -> 실수연산은 오차를 발생시킴.
        float f1 = 1.123f;
        double d1 = 1.123;

//        부동소수점 오차 테스트
        double d2 = 0.1;
        System.out.println(d2);

        double total = 0;
        for (int i = 0; i < 1000; i++) {
            total = total + 0.1;
        }
        System.out.println(total);
        // 기대값 : 100
        // 실제값 : 99.9999999999986

//        소수점 연산 오추 해결방법 : 정수로 변환 후 연산하여 추후 나눗셈으로 해결.
        double total2 = 0;
        for (int i = 0; i < 1000; i++) {
            total2 = total2 + 0.1*10;
        }
        System.out.println(total2 / 10);

//        소수점 오차 해결 방법 : Bigdecimal 클래스 사용
        double o1 = 1.03;
        double o2 = 0.42;
        System.out.println(o1 - o2);
        // 값을 입력받을 때 부터 소수점으로 받게 되면 이미 오차가 발생하므로 문자로 입력.
        BigDecimal b1 = new BigDecimal("1.03");
        BigDecimal b2 = new BigDecimal("0.42");
        double d3 = b1.subtract(b2).doubleValue();
        System.out.println(d3);

//        문자형 : char
        char c1 = '가';
        String st1 = "가나";

//        null도 하나의 타입
//        참조형자료에 값을 할당하지 않으면 null이 할당
        String st2 = "";
        String st3 = null;
        System.out.println(st2);
        System.out.println(st3);
        //System.out.println(st3.isEmpty()); // null을 대상으로 string의 메서드 사용 불가

//        묵시적 타입 변환
        char c2 = 'a';
        int i1 = c1;
        System.out.println(i1);

//        알파벳 소문자 제거 문제
        String st4 = "01abcd123한글123";
        String answer = "";
        for (int i = 0; i < st4.length(); i++) {
            char ch = st4.charAt(i);
            if (ch < 'a' || ch > 'z') {
                answer += ch;
            }
        }
        System.out.println(answer);

//        정수/정수의 경우 소수점 절사 문제 발생
//        두수가 모두 정수이면 결과값이 정수일 것이다 라고 java가 판단
        int q = 1;
        int w = 4;
        System.out.println(q/w);










    }
}
