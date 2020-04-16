import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String answer = "";
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko","ana","mislav"};
        Map<Integer,String> map = new HashMap<Integer,String>();
        Map<Integer,String> map2 = new HashMap<Integer,String>();
        for(int i = 0; i<participant.length; i++) 
        	map.put(i, participant[i]);
        for(int j = 0; j<completion.length;j++)
        	map2.put(j, completion[j]);
        System.out.println(map);
        for(int i = 0; i<participant.length;i++) {
        	int k=0;
        	for(int j = 0; j<completion.length; j++) {
        		if(map.get(k)==map.get(j)) {
        			map.remove(k);
        			System.out.println(map);
        		}
        	}
        }
        System.out.println(map);
   
        Set<Integer> keys = map.keySet();
        List<Integer> list = new ArrayList<>(keys);
        answer = map.get(list.get(0));

        
        System.out.println("Á¤´ä:"+answer);
	}
}