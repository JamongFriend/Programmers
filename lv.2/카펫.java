/**
 * 문제: 짝지어 제거하기
 * 난이도: Lv.2
 * 분류: 완전탐색
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * 문제 설명:
 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만,
 * 전체 카펫의 크기는 기억하지 못했습니다.
 * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때
 * 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 */

class Solution {
    public int[] solution(int brown, int yellow) {
        int all = brown + yellow;
        for (int h = 3; h <= all; h++) {
            if (all % h == 0) {
                int w = all / h;
                if (w >= h) {
                    if ((w - 2) * (h - 2) == yellow) {
                        return new int[]{w, h};
                    }
                }
            }
        }
        return new int[2];
    }
}
