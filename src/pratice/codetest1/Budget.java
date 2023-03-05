package pratice.codetest1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		int temp= 0;
		Arrays.sort(d);
		for(int i =0; i< d.length; i ++) {
			temp +=d[i];
			if(temp > budget) {
				answer =i;
				break;
			}
		if(temp <= budget) {
			answer = d.length;
		}
		}
		System.out.println(answer);
	}	

}
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        return answer;
    }
}