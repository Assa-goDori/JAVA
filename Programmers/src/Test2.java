import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String answer = "";
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden","kiki"};
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(int i = 0; i<participant.length; i++) {
        	map.put(i,participant[i]);
        }
        for(int j = 0; j<completion.length;j++) {
        	if(map.size()==1) break;
        	for(int k = 0; k<participant.length;k++) {
        		if(completion[j].equals(map.get(k))) {
        			map.remove(k);
        			break;
        		}
        	}
        }
        int m = 0;
        while(true) {
        	if(map.get(m)!=null) {
        		answer = map.get(m);
        		break;
        	}
        	m++;
        }
        
        System.out.println("Á¤´ä:"+answer);
	}
}