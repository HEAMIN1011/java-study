package study.coll;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//json object {key : value}
		
		//key, Value
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김하나");
		map1.put(2, "둘");
		map1.put(3, "셋");
		
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsKey(4));
		
		System.out.println(map1.containsValue("박사"));
		System.out.println(map1.containsValue("김하나"));
		
		System.out.println(map1.get(3));
		
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("당번", "지각생");
		System.out.println(map2.get("당번"));
		
		
	}

}
