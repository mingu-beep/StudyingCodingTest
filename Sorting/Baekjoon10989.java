package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10989 {

    public static void main(String[] args) throws IOException {

        // 수의 범위 0 ~ 10000 사실상 0은 제외
        int[] count = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            count[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        // 0은 입력 범위에서 없으므로 1부터 시작
        for (int i = 1; i < 10001; i++) {
            // i 값이 개수가 0이 될 때 까지 출력 (빈도수를 의미)
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }

        System.out.println(sb);

    }
}
