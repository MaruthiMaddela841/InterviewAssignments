package in.ineuron.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		
		String str="aabcddd";
		Map<String,Integer> map=new HashMap<String,Integer>();
		char[] arr=str.toCharArray();
		for(char c:arr) {
			if(map.containsKey(String.valueOf(c))) {
				map.put(String.valueOf(c),map.get(String.valueOf(c))+1);
			}
			else {
				map.put(String.valueOf(c), 1);
			}
		}
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"::"+e.getValue());
		}
		//map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
		//map.entrySet().stream().forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("Key with max value: " + maxKey + ", Max value: " + maxValue);
        
        String maxKeyStream = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Key with max value (Streams): " + maxKeyStream);

        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
                .stream()
                .collect(Collectors.maxBy(Map.Entry.comparingByValue()));

        maxEntry.ifPresent(entry -> System.out.println("Key with max value (Collectors): " + entry.getKey()));
        
        Optional<Map.Entry<String, Integer>> optionalMaxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        if (optionalMaxEntry.isPresent()) {
            System.out.println("Key with max value (Optional): " + optionalMaxEntry.get().getKey());
        } else {
            System.out.println("HashMap is empty!");
        }
        
        String maxKeyParallel = map.entrySet()
                .parallelStream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Key with max value (Parallel Streams): " + maxKeyParallel);


//        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEachOrdered(entry -> sortedByValue.put(entry.getKey(), entry.getValue()));
//
//        String maxKeyTree = ((TreeMap<String, Integer>) sortedByValue).lastKey();
//        System.out.println("Key with max value (TreeMap): " + maxKeyTree);

	}

}
