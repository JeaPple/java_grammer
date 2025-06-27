package C06etcClass;

import java.util.Arrays;

public class C01Math {
    public static void main(String[] args) {
//        Math.random() : 임의의 수 반환. 0.0 ~ 1.0 사이의 double형 반환.
        System.out.println(Math.random());
//        로또 번호 7개 뽑기. 0~99 까지의 임의 숫자
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

//        Math.abs() : 절대값 반환
        System.out.println(Math.abs(-5));

//        Math.ceil() : 올림, Math.floor() : 내림, Math.round() : 반올림
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.floor(5.3));
        System.out.println(Math.round(5.3));

//        Math.max(a,b) : 두수의 최대값, Math(a,b) : 두수의 최소값
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10

//        Math.pow(a,b) : a의 b제곱(b가 승수)
        System.out.println(Math.pow(2, 3)); // 8.0

//        Math.sqrt(a) : a의 제곱근
        System.out.println(Math.sqrt(20)); // 4.47213595499958

    }
}
