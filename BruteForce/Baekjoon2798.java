package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(search_2(arr, N, M));
    }

    // O(N^3)
    static int search_1(int[] arr, int N, int M) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < N - 2; i++) {

            // 두 번째 카드는 첫 번째 카드의 다음부터 N - 1 까지만 순회
            for (int j = i + 1; j < N - 1; j++) {

                // 세 번째 카드는 두 번째 카드 다음부터 N까지 순회
                for (int k = j + 1; k < N; k++) {

                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // M과 세 카드의 합이 같다면 temp return 및 종료
                    if (M == temp) {
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 M보다 작을 경우 result 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }

    /*
    탐색할 필요가 없는 경우
        카드 한 장이 이미 M보다 클 경우
        두 카드의 합이 M보다 클 경우
     */
    static int search_2(int[] arr, int N, int M) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < N - 2; i++) {

            // 첫 카드가 M보다 작을 경우에만 다음 카드 탐색
            if( arr[i] < M ) {
                // 두 번째 카드는 첫 번째 카드의 다음부터 N - 1 까지만 순회
                for (int j = i + 1; j < N - 1; j++) {

                    // 첫 번째, 두 번째 카드의 합이 M보다 작을 때에만 다음 카드 탐색
                    if ( arr[i] + arr[j] < M) {

                        // 세 번째 카드는 두 번째 카드 다음부터 N까지 순회
                        for (int k = j + 1; k < N; k++) {

                            // 3개 카드의 합 변수 temp
                            int temp = arr[i] + arr[j] + arr[k];

                            // M과 세 카드의 합이 같다면 temp return 및 종료
                            if (M == temp) {
                                return temp;
                            }

                            // 세 카드의 합이 이전 합보다 크면서 M보다 작을 경우 result 갱신
                            if (result < temp && temp < M) {
                                result = temp;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}
