package C06etcClass;

import static C06etcClass.ClassGrade.*;

public class C03EnumMain {

    public static void main(String[] args) {
////        classGrade를 일반문자열로 세팅할 경우 -> 정해진 문자열이 아닌, 개별적으로 생성된 문자열 삽입
//        Student student1 = new Student("hong1", "1학년");
//        Student student2 = new Student("hong2", "2class");
//        Student student3 = new Student("hong3", "adsf");
//        Student student4 = new Student("hong4", "asdfsdaf");

//        static final을 통해 변수값 관리하는 방법. -> 타입이 String이므로 얼마든지 자유롭게 세팅이 가능한 문제점 존재.
        Student student1 = new Student("hong1", FIRST_GRADE);
        Student student2 = new Student("hong2", FIRST_GRADE);
        Student student3 = new Student("hong3", SECOND_GRADE);
        Student student4 = new Student("hong4", THIRD_GRADE);

        System.out.println(student1);
    }
}

class Student{
    private String name;
    private ClassGrade classGrade;

    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classGrade=" + classGrade +
                '}';
    }
}

//class ClassGrade{
//    static final String C1 = "first_class";
//    static final String C2 = "second_class";
//    static final String C3 = "third_class";
//}

enum ClassGrade{
    FIRST_GRADE,
    SECOND_GRADE,
    THIRD_GRADE;
}
