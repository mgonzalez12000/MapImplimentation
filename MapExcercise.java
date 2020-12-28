package mapExcercise;

import java.util.HashMap;
import java.util.Map;


public class MapExcercise {
	//With a Map<String, Integer>
	Map <String, Integer> map = new HashMap <String, Integer>();
	
	/* Write one method call addStringToMap that takes a String 
	   parameter and adds an entry to the Map with the String 
	   as the key and the length of the String as the value. */
	public void addStringToMap (String input) {
		map.put(input, input.length());
	}
	
	// Write a method called printOutMap() that prints out all the entries from the Map.
	public void printOutMap(){
		
		for (String key : map.keySet())
		{
		   System.out.println(key + ": " + map.get(key));
		}
	}
	
	/* Main should call addStringToMap() repeatedly to add at least ten Strings, including 
	   at least one pair of duplicate Strings (like "John" and "John") and at least one other 
	   pair that are not duplicates but have the same length (like "Bob" and "Sue".) The 
	   Strings may be hard-coded; you do not need to take user input.  Main should then call 
	   the printOutMap method. */
	public static void main(String[] args) {
		MapExcercise map = new MapExcercise();
		//Duplicates
		map.addStringToMap("John");
		map.addStringToMap("John");
		//Non duplicates
		map.addStringToMap("Bob");
		map.addStringToMap("Sue");
		//6 more to make 10 total strings
		map.addStringToMap("Intel");
		map.addStringToMap("Apple");
		map.addStringToMap("Google");
		map.addStringToMap("Dell");
		map.addStringToMap("Playstation");
		map.addStringToMap("Microsoft");
		//Print output
		map.printOutMap();
		
		
	}

}
