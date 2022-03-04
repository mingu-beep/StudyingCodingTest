package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4948 {
    // n < 123456 이므로 2n < 246912
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getPrime();

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if(!prime[i]) count++;
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    public static void getPrime() {
        // 소수인 경우 : false, 소수가 아니면 : true

        prime[0] = prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
