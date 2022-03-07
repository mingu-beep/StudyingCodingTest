package RecursionFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));

    }

    public static int factorial(int N) {
        if(N != 0)
            return N * factorial(N - 1);
        else return 1;
    }
}
