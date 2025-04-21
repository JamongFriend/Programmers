/**
 * 문제: 수열과 구간 쿼리 3
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181924
 * 키워드: 반복문, 2차원 배열, swap
 */

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}