import java.util.Stack;

class Solution {
    public int solution(String arrangement) {
    	int answer = 0;
    	int size = 0;
    	Stack<Character> s = new Stack<Character>();
    	for(int i = 0; i<arrangement.length();i++) {
        	if(arrangement.charAt(i) == '(') {
        		s.push(arrangement.charAt(i));
        	} else if(arrangement.charAt(i) == ')') {
        		if(arrangement.charAt(i-1) == '(') {
        			s.pop();
        			if(s.size()==0) continue;
        			answer += s.size();
        		} else {
        			s.pop();
        			answer++;
        		}
        	}
    	}
    	return answer;
    } 
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println(new Solution().solution("(()())"));
	}
}