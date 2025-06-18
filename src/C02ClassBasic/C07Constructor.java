package C02ClassBasic;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성 : 연도, 월, 일 세팅
        Calendar calendar = new Calendar("2025", "6", "18");

//        캘린더 객체 출력 : "오늘은 xxx연도 xx월 xx일 입니다."
//        toString()메서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행
        System.out.println(calendar.printDate());
        System.out.println(calendar);

    }


}

//Calendar 클래스 생성 : year, month, day 모두 String
class Calendar{
    private String year;
    private String month;
    private String day;

    // 생성자를 통해 객체변수 값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 별도 생성자를 추가할 경우, 초기(기본)생성자는 무시가 되므로, 필요시 별도로 추가
    public Calendar() {
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String printDate() {
        return "오늘은 " + year + "연도 " + month + "월 " + day + "일 입니다.";
    }
}
