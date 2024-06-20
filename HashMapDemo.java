

import java.util.*;

 class HashMapDemo{

    public static void main(String[] args) {

        HashMap<String , String> hashMap = new HashMap<>();

       		 // insertion Operation

       		 hashMap.put("india","new Delhi");
        	 hashMap.put("pakistan","islamabad");
      		 hashMap.put("Shrilanka","colombo");
               	 hashMap.put(null,"kathmandu");

       		 System.out.println(hashMap);
      		 System.out.println("All key"+hashMap.keySet());

       		 //searching

       		 System.out.println(hashMap.get("india"));

        	//iteration

     	  	for (String str : hashMap.keySet())
      		 {
           		System.out.println(str);
      		 }

       		hashMap.put("india","mumbai");

        	System.out.println(hashMap.containsKey("china"));
       		System.out.println(hashMap.containsValue("islamabad"));
      		System.out.println(hashMap.keySet());

       		System.out.println(hashMap);

    }

}
