package C07ExceptionFileParsing.memberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소역할을 하는 계층
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

    // 회원가입
    public void register(Member member) {
        memberList.add(member);
    }

    // 이메일 상세 조회
    public Optional<Member> findByEmail(String email) {
        Optional<Member> foundMember = Optional.empty();
        for (Member member : memberList) {
            if (member.getEmail().equals(email)) {
                foundMember = Optional.of(member);
            }
        }
        return foundMember;
//        return memberList.stream().filter(m->m.getId()==id).findFirst();
    }

    // 회원 상세 조회
    public Optional<Member> findById(Long id) {
        Optional<Member> foundMember = Optional.empty();
        for (Member member : memberList) {
            if (member.getId().equals(id)) {
                foundMember = Optional.of(member);
            }
        }
        return foundMember;
    }

    // 회원 목록 조회
    public List<Member> findAll() {
        return new ArrayList<>(memberList);
    }

}

