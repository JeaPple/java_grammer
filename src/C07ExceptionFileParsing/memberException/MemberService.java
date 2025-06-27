package C07ExceptionFileParsing.memberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심로직을 구현하는 계층
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void register(String name, String email, String password) throws IllegalArgumentException, NumberFormatException {
        Member member = new Member(name, email, password);

//        DB에 이메일이 중복일 경우 예외 발생
        Optional<Member> findMember = memberRepository.findByEmail(email);
        if (findMember.isPresent()) {
            throw new IllegalArgumentException("이메일이 중복됩니다.");
        }

//        비밀번호가 너무 짧은 경우 예외 발생
        if (password.length() < 2) {
            throw new NumberFormatException("비밀번호가 짧습니다. 다시 회원가입해주세요");
        }

//        객체를 조립후 repository를 통해 register
        memberRepository.register(member);
    }

    //    회원상세조회
    public Member findById(Long id) throws NoSuchElementException {
//        Optional객체에 값이 없을 경우 예외 발생. 있으면 Member를 꺼내서 return.
        return memberRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementException("등록된 회원이 없습니다."));
    }

    // 회원목록조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

}
