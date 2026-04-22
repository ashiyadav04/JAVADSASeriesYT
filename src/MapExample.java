import java .util.*;
public class MapExample {
    void main(){
        HashMap<Integer,String> h=new HashMap<>();
        LinkedHashMap<Integer,String> l=new LinkedHashMap<>();
        h.put(1,"Ashi yadav");
        h.put(2,"Dhruv Anand");
        h.put(3,"AJAY YADAV");
        h.put(4,"Ujjwal Chauhan");
        h.put(1,"Dhruv");
        System.out.println("HashMap values are:");
        h.forEach((key,value)->System.out.println(key+" "+value));
        l.put(1,"Ashi yadav");
        l.put(2,"Dhruv Anand");
        l.put(3,"AJAY YADAV");
        l.put(4,"Ujjwal Chauhan");
        l.put(1,"Dhruv");
        System.out.println("Linked hashmap enteries:");
        Iterator<Map.Entry<Integer,String>> it=l.entrySet().iterator();
      //  System.out.println(it.next().getKey()+" ->"+it.next().getValue());
        while(it.hasNext())
        {
            Map.Entry<Integer,String> e=it.next();
           // System.out.println(it.next().getKey()+" ->"+it.next().getValue());
            System.out.println(e.getKey()+" ->"+e.getValue());
        }
        Hashtable<Integer,String> t=new Hashtable<>();
        t.put(1,"Ashi yadav");
        t.put(2,"Dhruv Anand");
        t.put(3,"AJAY YADAV");
        t.put(4,"Ujjwal Chauhan");
        t.put(1,"Dhruv");
        System.out.println("Hash table enteries are:");
        for(Map.Entry<Integer,String>entry:t.entrySet()){
            System.out.println(entry.getKey()+" ->"+entry.getValue());
            TreeMap<Integer,String> m=new TreeMap<>();
            m.put(1,"ASHI YADAV");
            m.put(2,"Ujjwal yadav ");
            m.put(3,"ASHI loves UJJWAL");
            m.put(4,"UJJWAL loves ASHI");
            m.put(5,"I'm UJJWAL's wife");
            System.out.println("Tree map enteries are:");
            for(Map.Entry<Integer,String>e: m.entrySet()) {
                System.out.println(e.getKey() + " ->" + e.getValue());
            }
        }

    }

}
