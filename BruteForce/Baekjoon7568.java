package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Baekjoon7568 {

    /*
    방법 :
        사람 수 별로 키와 몸무게를 관리할 2차원 배열을 선언한 후 모든 값을 입력 받는다.
        그 후 다시 2차원 배열을 순회하면서 나보다 덩치가 큰 (키와 몸무게가 모두 나보다 큰) 사람이 나올 때 마다
        순위 값을 더한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] person = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                        rank++;
                    }
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb);


    }

}
