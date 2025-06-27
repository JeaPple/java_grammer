package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class C02File {
    public static void main(String[] args) throws IOException {
////        --콘솔창에 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

//        --파일에서 읽기
//        방법1. IO 패키지
        BufferedReader br2 =
                new BufferedReader(new FileReader("src/C07ExceptionFileParsing/text.txt"));
        String line = br2.readLine();
        while (line != null) {
            System.out.println(line);
            line = br2.readLine();
        }


////        방법2. NIO 패키지 (성능이 더 좋음)
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/text.txt");
////        readString : 문자열전체를 통채로 read

//        파일쓰기
        Path filePath = Paths.get("src/C07ExceptionFileParsing/text.txt");
        Files.write(filePath, "홍길동1\n".getBytes(), StandardOpenOption.WRITE); // WRITE : 덮어쓰기
        Files.write(filePath, "홍길동2\n".getBytes(), StandardOpenOption.APPEND); // APPEND : 덮어쓰기



    }
}
