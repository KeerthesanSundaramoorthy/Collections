package com.HashMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class HashMapWorking {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hash=new LinkedHashMap<>();
		hash.put(1,"Kee");
		hash.put(5,"San");
		hash.put(3,"Logesh");
		hash.put(2,"Santhosh");
		hash.put(6,"Kiot");
		System.out.println(hash);
		Set<Map.Entry<Integer,String>> map = hash.entrySet();
//		System.out.println("printing in for each loop");
//		for(Map.Entry<Integer,String> a:map) {
//			System.out.println(a.getKey()+" = "+a.getValue());
//		}
		System.out.println("printing keys");
		Set<Integer> key=hash.keySet();	//stores all the key in a set	//set is used because keys don't allow duplicates so it is stored in set .
		System.out.println(key);	//print all the keys
		
		System.out.println("printing values");
		Collection<String> value = hash.values(); 		// collection is used because values may have duplicate
		System.out.println(value);	//print all the values
		
		
		hash.put(1,"kd");	//allow duplicate in values and it is overriden
		System.out.println(hash);
		
		hash.remove(1,"kd");	//removes if key is given //not work if value only given
		System.out.println(hash);
		
//		hash.clear();
//		System.out.println(hash);
		LinkedHashMap<Integer,String> hash1=new LinkedHashMap<>();
		hash1.put(1,"has");
		hash1.put(5,"is");
		hash1.put(3,"was");
		hash1.put(2,"go");
		hash1.put(6,"lock");
		hash.putAll(hash1);
		System.out.println(hash);
//		Iterator <Map.Entry<Integer,String>> it=hash.entrySet().iterator();
//		for(Map.Entry<Integer,String> m: it) {
//			System.out.println(m);
//		}
	}

}
