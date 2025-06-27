import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());

        StringBuilder check = new StringBuilder();
        while (true) {
            check.append(br.readLine());
            if (check.toString().equals("0")) {
                break;
            } else if (check.toString().contentEquals(check.reverse())) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }

            check.setLength(0);
        }


        System.out.println(sb);
    }
}
