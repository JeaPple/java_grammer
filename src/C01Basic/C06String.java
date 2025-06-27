package C01Basic;

import java.util.Arrays;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        원시자료형은 스택메모리에 저장되므로, 비교 시 값 자체를 비교
//        원시자료형 : 스택 기반 저장

//        참조자료형 : 클래스 (->객체)기반, 힙 메모리 기반 저장

//        wrapperClass : 기본형 타입을 Wrapping한 클래스
        int i1 = 10;
//        Integer ig1 = new Integer(10);

//        오토박싱 : 원시자료형 -> Wrapper클래스 자동 형변환
        Integer ig1 = 10;
//        오토언박싱 : Wrapper클래스 -> 원시자료형으로 자동 형변환
        int i2 = ig1;

//        Wrapper클래스의 기능
        int i3 = 10;
        String st3 = Integer.toString(i3);
        String st4 = String.valueOf(i3); // -> 숫자를 문자열로 변환기능
        int i4 = Integer.parseInt(st3); // -> 숫자열로 변환기능

//        String st1 = new String("abc");
//        String st2 = "abc";
//
//
////         참조자료형의 비교는 ==을 지양
//        System.out.println(st1.equals(st2));
//
////        length : 문자열의 길이 출력
//        String st5 = "hello1 World java2";
//        System.out.println(st1.length());
////        chatAt(n) : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//
////        위 문자열의 소문자알파벳의 개수 구하기 : for, length, charAt활용
//        int count = 0;
//        for (int i = 0; i < st5.length(); i++) {
//            if (st5.charAt(i) >= 'a' && st5.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println(count);

//      -- a의 개수가 몇개인지 출력
        String st6 = "abcdasdgaajdbaaaa"; // 8개
        int count1 = 0;
        for (int i = 0; i < st6.length(); i++) {
            if (st6.charAt(i) == 'a') {
                count1++;
            }
        }
        System.out.println(count1);

//      toCharArray : String문자열을 char배열로 리턴
        String st7 = "abcdasdgaajdbaaaa"; // 8개
        int count2 = 0;

        for (char c : st7.toCharArray()) {
            if(c == 'a') count2++; // 실행문이 1줄 밖에 없을 때는 중괄호 생략 가능
        }

//        indexOf : 특정 문자열의 위치(index) 반환. 가장 먼저 나오는 문자열의 위치 반환.
        String st66 = "hello java java";
        System.out.println(st66.indexOf("java")); // 6

//        contains : 특정 문자열이 포함되어 있는 지 여부(boolean)를 return
        System.out.println(st66.contains("hello")); //true
        System.out.println(st66.contains("world")); //true

//        문자열 더하기 : +=
        String st74 = "hello";
        st74 += '1'; // String char을 더하면 String 으로 더해짐.


//      프로그래머스 - 나머지 구하기 (플랫폼 사용 방법)
//      프로그래머스 - 특정 문자 제거하기

//          굉장히 많이 쓰임
//        - substring(a, b) : a이상 b미만의 index의 문자를 잘라 문자열 반환
        String st83 = "hello world";
        System.out.println(st83.substring(0, 5)); // hello
        // 마지막 index까지 추출하고 싶으면 length()사용하자
//        System.out.println(st83.substring(6, st1.length())); // world

////        프로그래머스 - 특정 문자 제거하기 (substring으로 풀어보기)
////        프로그래머스 - 가운데 글자 가져오기
//        String answer = "";
//        String s = "abacd";
//        char[] charArray = s.toCharArray();
//        int i = 0;
//        if (charArray.length % 2 == 0) {
//            i = s.length() / 2;
//            answer += charArray[i - 1];
//            answer += charArray[i];
//        } else {
//            i = s.length() / 2;
//            answer += charArray[i];
//        }
//        System.out.println(answer);

//        trim, strip : 문자열 양쪽 끝의 공백 제거
        String st105 = " hello world ";
        String trim1 = st105.trim();
        String strip1 = st105.strip();
        System.out.println(trim1);
        System.out.println(strip1);

//        toUpperCase : 모든 문자열을 대문자로 변환, toLowerCase : 모든 문자열을 소문자로 변환
        String s1 = "Hello";
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s3);

//        replace(a,b) : a문자열을 b문자열로 대체
        String st119 = "hello world";
        String st120 = st119.replace("world", "java");
        System.out.println(st120);

//        replaceAll(a, b) : replace와 사용법 동일. 정규표현식을 쓸 수 있는 점이 차이점.
//        정규표현식은 시험에서는 사용 x, 실전에서 쓰자!
        String st1 = "01abCdsf123한글123";
//        소문자 알파벳 제거
        String answer1 = st1.replaceAll("[가-힣]", "");
        String answer2 = st1.replaceAll("[a-z]", "");
        String answer3 = st1.replaceAll("[A-Za-z]", "");
        System.out.println(st1);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

//        -- 실전 예시
//        전화번호 검증
        String number = "010-1234- 1232";
        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
        if (!check) {
            System.out.println("다시 입력하세요.");
        }

//        이메일 검증
        String email = "asa1234@naver.com";
        boolean checkEmail = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
        System.out.println(checkEmail);

//        split : 특정문자를 기준으로 잘라서 문자배열로 만드는 것.
        String a = "a:b:c:d";
        String[] arr = a.split(":");
        System.out.println(Arrays.toString(arr));

        String b = "a b c  d";
        String[] arr2 = b.split(" ");
        String[] arr3 = b.split("\\s+"); // \s:공백, \n:줄바꿈
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

//        null과 공백의 차이
        String null1 = null; // null은 String이 아님
        String split1 = ""; // 공백은 문자열
        String sss = " ";
        System.out.println(null1 == split1); // false
//        System.out.println(null1.isEmpty()); // Nullpointer exception 발생
        System.out.println(split1.isEmpty()); // true
        System.out.println(sss.isEmpty()); // false
        String aaaa = "hello  word as  sd";
        for (int i = 0; i < aaaa.length(); i++) {
            if (aaaa.substring(i, i + 1).isBlank()) {
                System.out.println(i + "번째는 blank");
            }
        }

//        문자열 합치기
//        이 두개는 추천 안 함 -> Stringbuffer에서 다른 메서드가 있음
        String[] arr11 = {"java", "python", "javascript"};
        String answer11 = "";
        for (String ar : arr11) {
            answer11 += ar;
            answer11 += " "; // \n을 사용하면 줄바꿈 추가
        }
        System.out.println(answer11);
        String answer22 = String.join("+", arr11);
        System.out.println(answer22);

////        StringBuffer : 문자열 조립 객체 - 성능 좋음
//        StringBuffer sb = new StringBuffer();
////        append는 맨 뒤에 문자열을 더하는 메서드.
//        sb.append("pyhthon");
//        sb.append("java");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);
//        StringBuffer sb2 = new StringBuffer();
//        String[] arr197 = {"java", "python", "javascript"};
//        for (int i = 0; i < arr197.length; i++) {
//            sb2.append(arr197[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0, "C++");
//        sb2.deleteCharAt(sb2.length() - 1); // -> 이런 식으로 마지막 띄어쓰기 없애기
//        System.out.println(sb2);

//        StringBuilder : 문자열 조립 객체(가장빠름)
        String string = "hello";
//        StringBuilder는 동시성 이슈 O == Thread-Safe하지않음, 성능은 뛰어남.
        StringBuilder sb1 = new StringBuilder();
//        StringBuffer는 동시성 이슈 X == Thread-Safe함, 성능은 떨어짐.
//        실 로직 구현
        StringBuffer sb2 = new StringBuffer();

//        -- 문자열 뒤집기
        String string1 = "hello";
        StringBuilder result = new StringBuilder();
        for (int i = string1.length(); i > 0 ; i--) {
            result.append(string1.charAt(i-1));
        }
        System.out.println(result);

//        문자열 비교
        String str1 = "hello";
        String str2 = "dello";
        String str3 = "hello";
        System.out.println(str1.compareTo(str2)); // 양수(아스키 코드를 뺀 값)
        System.out.println(str2.compareTo(str1)); // 음수(아스키 코드를 뺀 값)
        System.out.println(str1.compareTo(str3)); // 0


//        프로그래머스 : 문자열밀기

    }
}
