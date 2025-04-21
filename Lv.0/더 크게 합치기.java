/**
 * 문제: 더 크게 합치기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181939
 * 키워드: Math.max()
 */

class Solution {
    public int sum(int a, int b) {
        int temp = b;
        while (temp > 0) {
            a *= 10;
            temp /= 10;
        }
        return a + b;
    }

    public int solution(int a, int b) {
        int c = sum(a, b);
        int d = sum(b, a);
        return Math.max(c, d);
    }
}