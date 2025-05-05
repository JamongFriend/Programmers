/**
 * 문제: 가장 큰 수
 * 난이도: Lv.2
 * 분류: 정렬
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * 문제 설명:
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고,
 * 이중 가장 큰 수는 6210입니다.
 *
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
 * 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * 풀이 전략:
 * 숫자 배열을 문자열 배열로 변환
 * sort()를 통해 문자를 붙였을때 비교해서 앞자리가 큰 수를 앞에 오도록 정렬
 * StringBuilder를 이용하여 문자열을 결합
 *
 */

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for(int i = 0; i<numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));

        if(str[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for(String s : str) {
            sb.append(s);
        }
        return sb.toString();

    }
}