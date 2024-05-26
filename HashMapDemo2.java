
import java.util.*;
class HashMapDemo1{
		
	public static void main(String args[]){
		
	Map<String,String> nameTeam = new HashMap<>();
        nameTeam.put("Sachin","India");
        nameTeam.put("Anderson","England");
        nameTeam.put("Sachin","MI");
        nameTeam.put(null,"West Indies");
        nameTeam.put(null,"Bangladesh");    //Not Allowed
        nameTeam.put("AB De V",null);

        System.out.println("All Keys:"+nameTeam.keySet());

        for(String keys : nameTeam.keySet()) {
            System.out.println("Key:"+keys+"\t Value:"+nameTeam.get(keys));
        }

        for(Map.Entry<String,String> entry : nameTeam.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        System.out.println("is Map contain Key Sachin? :"+nameTeam.containsKey("sachin"));
        System.out.println("is Map contain Value England? :"+nameTeam.containsValue("england"));
    
	}

}


