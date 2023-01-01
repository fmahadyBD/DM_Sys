import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hmap {
    void hash() throws Exception{
        HashMap <String, Integer> em=new HashMap<>();
        em.put("Mahady",1);
        em.put("Fahim",2);
        em.put("Hasan",3);
        em.put("Sad",4);
        em.put("Dark",5);
        em.put("Light",6);

        System.out.println(em);

        System.out.println(em.get("Mahady"));
        System.out.println(em.containsKey("Hasan"));
        em.putIfAbsent("Fahim", 6);
        System.out.println(em);
        for(Map.Entry<String,Integer> e:em.entrySet()){

            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println("Set:");

        Set<String>keys=em.keySet();

        for(String key:keys){
            System.out.println(keys+ " "+em.get(keys));
        }

        App obj=new App();
        App.main(new String[]{});


    }
}
