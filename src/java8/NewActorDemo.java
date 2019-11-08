package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewActorDemo {


    public static void main(String[] args) {
        Map<String,Object> items = new HashMap<>();
        items.put("A",10);
        items.put("B",20);
        items.put("C",30);

        for (Map.Entry<String,Object>  tt: items.entrySet()){
            System.out.println(tt.getKey());
        }

       items.forEach((String,Object) ->{
           System.out.println(Object);
       });



        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
