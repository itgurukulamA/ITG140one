package mapkdk;
import java.util.*;  
public class kdk{  
public static void main(String[] args) {  
    Map kdk=new HashMap();  
       //non generic model 
    kdk.put(1,"kdk");  
    kdk.put(5,"kdk2");  
    kdk.put(2,"samantha");  
    kdk.put(6,"rakul");  
    Set set=kdk.entrySet();//Converting to Set so that we can traverse  by iterator
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}  
