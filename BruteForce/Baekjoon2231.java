package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(search_2(N));

    }

    static int search_1(int N) {

        for (int i = 0; i < N; i++) {

            int num = i;
            int sum = num;
            while(num != 0) {
                sum += (num % 10);
                num /= 10;
            }

            if (sum == N)
                return i;

        }

        return N-1;
    }

    /*
    어떤 임의의 수 N이 들어올 때, 해당 수 N은 K + (K의 각 자릿수의 합)이다.
        각 자릿수의 합이 최대 일 경우는 각 자릿 수의 값이 9일 때.
        입력 받은 정수 N에 대해서 자릿수의 길이만큼 9를 빼주면 된다.
        그 미만의 수는 생성자가 될 수 없다는 것이 자명하다.
            N - ( 9 * K의 길이 )부터 탐색하여 N 까지만 탐색한다.
    */
    static int search_2(int N) {

        int N_length = String.valueOf(N).length();
        int number = N;

        for (int i = ( N - (N_length * 9)); i < N; i++) {
            number = i;
            int sum = i;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // i 값과 각 자릿수 누적값이 같을 경우 (생성자를 찾았을 경우)
            if (sum == N) {
                return i;
            }
        }

        return N;
    }

}
