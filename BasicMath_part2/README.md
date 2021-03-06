# 백준 단계별 풀이 - 기초 수학 2

---

## 문제 리스트
- 1978 : 소수 찾기
- 2581 : 소수
- 11653 : 소인수분해
- 1929 : 소수 구하기
- 4948 베르트랑 공준
- 9020 : 골드바흐의 추측
- 1085 : 직사각형에서 탈출
- 3009 : 네 번째 점
- 4153 : 직각삼각형
- 3053 : 택시 기하학
- 1002 : 터렛

---

## 주요 알고리즘
1. 에라토스테네스의 체

    > 소수를 구하는 가장 대표적인 알고리즘

    ``` Java
   boolean[] prime = new boolean[N + 1] // 0 ~ N
   public static void getPrime() {
        // false == 소수
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            // 이미 체크된 배열이면 다음 반복문으로
            if(prime[i]) continue;
   
            // i의 배수들을 걸러주기 위한 반복문
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
   ```

    - 소수 (Prime Number) 
      - 정의 : 1보다 큰 자연수 중 1과 그 수 자기 자신만을 약수로 갖는 자연수
        - 합성수 : 1보다 크고 자기 자신의 수보다 작은 자연수를 약수로 갖는 수
        - 소인수분해 : 어떤 수를 소수로 이루어진 곱으로 표현하는 것
      - RSA 암호화 방식 등, 암호에서 소수를 이용하기 때문에 소수는 중요한 개념이다.
        - 대부분의 암호는 임의의 수들의 곱은 구하기 쉽지만 역으로 소인수 분해하는 것은 어렵다라는 개념에서 출발한다.
      
    - 에라토스테네스의 체
      > k = 2부터  √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
        - 소수를 구하는 알고리즘 중 가장 대표적인 알고리즘
        - 시간 복잡도 : O(Nlog(logN))
   
    - 사용한 문제 : 1978, 2581, 11653, 4948, 9020