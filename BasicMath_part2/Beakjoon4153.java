package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;
            else {

                int a_2 = a * a;
                int b_2 = b * b;
                int c_2 = c * c;

                if (a_2 + b_2 == c_2 || a_2 + c_2 == b_2 || b_2 + c_2 == a_2)
                    sb.append("right").append('\n');
                else
                    sb.append("wrong").append('\n');

            }
        }

        System.out.println(sb);

    }
}