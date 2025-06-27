package C07ExceptionFileParsing.memberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자의 입출력을 받아 처리하는 계층
public class MemberController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService(new MemberRepository());
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1번 : 회원가입, 2번 : 회원상세조회, 3번 : 회원목록조회");
            String input = sc.nextLine();
            if (input.equals("1")) {
//                이름, 이메일, 패스워드 입력받아서 service에 전달
                System.out.print("이름을 입력하세요 : ");
                String name = sc.nextLine();
                System.out.print("이메일을 입력하세요 : ");
                String email = sc.nextLine();
                System.out.print("패스워드를 입력하세요 : ");
                String password = sc.nextLine();

//                예외발생시 적절한 문구를 사용자에게 출력.
                try {
                    memberService.register(name, email, password);
                    System.out.println("회원가입 되었습니다.");
                } catch (NumberFormatException e1) {
                    System.out.println(e1.getMessage());
                } catch (IllegalArgumentException e2) {
                    System.out.println(e2.getMessage());
                }
            } else if (input.equals("2")) {
                System.out.print("id값을 입력하세요 : ");
                Long id = sc.nextLong();
//                회원정보 출력
                try {
                    Member member = memberService.findById(id);
                    System.out.println(member.toString());
                } catch (NoSuchElementException e) {
                    System.out.print(e.getMessage());
                }

            } else if (input.equals("3")) {
//                회원목록정보 출력
                List<Member> memberList = memberService.findAll();
//                memberList.stream().forEach(System.out::println);
                for (Member member : memberList) {
                    System.out.println(member);
                }
            }
        }
    }
}
