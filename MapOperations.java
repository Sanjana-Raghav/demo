package assignments;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOperations {

	static HashMap<Integer, String> map = new HashMap<Integer, String>();
	static HashMap<Integer, String> newmap = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
	
		addingDataToMap();
		gettingDataFromMap();
		checkingMapIsEmptyOrNot();
		removingDataFromMap();
		checkingSizeOfMap();
		setViewOfData();
		checkingKey();
		checkingValue();
		replaceValueByKey();
		addingDataToAnotherMap();
		printKeySet();
		mergeTwoMapsWithDuplicateKey();
		shallowCopyOfMap();
	}
	
	public static void addingDataToMap() {
		
		System.out.println("--Collections of data--");
		map.put(1,"Sonam");
		map.put(2,"Rajat");
		map.put(3,"Vimal");
		map.put(4,"Saurav");
		map.put(5,"Jyoti");
		map.put(6,"Devolina");
		map.put(7,"Shubhika");
		System.out.println(map);
		
	}
	
	public static void gettingDataFromMap() {
		
		System.out.println("----------------");
		System.out.println("Value at key 2 is: "+map.get(2));
	}
	
	public static void checkingMapIsEmptyOrNot() {
		System.out.println("----------------");
		System.out.println("HashMap is empty? :"+map.isEmpty());
	}
	
	public static void removingDataFromMap() {
		map.remove(7);
		System.out.println("----------------");
		System.out.println("After removing value from collection "+map);
	}
	
	public static void checkingSizeOfMap() {
		System.out.println("-------------");
		System.out.println("Size of the HashMap: "+map.size());
	}
	
	public static void setViewOfData() {
		System.out.println("----------------");
		for(Map.Entry<Integer,String> value : map.entrySet()){
		    System.out.println("Key - "+value.getKey() + ", Value - " + value.getValue());
		}
	}
	
	public static void checkingKey() {
		System.out.println("----------------");
		if(map.containsKey(5)) {
			System.out.println("Key Found!!!!");
		}
		else {
			System.out.println("key not found!!!!");
		}
		
	}
	
	public static void checkingValue() {
		System.out.println("----------------");
		if(map.containsValue("Sanjana")){
			System.out.println("Value Found!!!!");
		}
		else {
			System.out.println("Value not found!!!!!");
		}
		
	}
	
	public static void replaceValueByKey() {
		System.out.println("----------------");
		map.replace(2,"Bharti");
		System.out.println("After replacing value at key 2 the list is :");
		for(Map.Entry<Integer,String> value : map.entrySet()){
		    System.out.println("Key - "+value.getKey() + ", Value - " + value.getValue());
		}
	}
	
	public static void addingDataToAnotherMap() {
		System.out.println("-----------------");
		HashMap<Integer, String> newmap = new HashMap<Integer, String>();
		newmap.put(3,"Mamta");
		newmap.put(9,"Sonam");
		newmap.putAll(map);
		System.out.println(newmap);
	
	}
	
	public static void printKeySet() {
		
		System.out.println("------------------");
		Set<Integer> key =map.keySet();
		System.out.println("The Set is " +key);
	}
	
	public static void mergeTwoMapsWithDuplicateKey() {
		System.out.println("------------------");
		newmap.put(3,"Mamta");
		newmap.put(4,"Anil");
		newmap.forEach(
			    (key, value) -> map.merge( key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2)
			);
		System.out.println(map);
	}
	
	public static void shallowCopyOfMap() {
		System.out.println("------------------");
		map.clone();
		System.out.println(map);
		
	}
}

	
