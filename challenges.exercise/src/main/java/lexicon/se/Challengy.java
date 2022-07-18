package lexicon.se;

import java.util.*;

public class Challengy {

    public static void ex1() {
        /*1. Create an empty set and populate it with the all the days of the week. Next create a second
set and populate it with ONLY the weekend days (SATURDAY and SUNDAY). Lastly, compare
the two sets and retain in the first set only those days that are the same in both set*/

        HashSet<String> set = new HashSet<>();
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        set.add("Sunday");
        System.out.println("the first set includes :" + set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Saturday");
        set1.add("Sunday");

        System.out.println("the second class includes: " + set1);
        set.retainAll(set1);
        System.out.println("The first set after comparing includes : ");
        for (String days : set) {
            System.out.println(days);


        }
    }

    public static void ex2() {
        /* 2. Create a new hashMap of types <String,String> and populate it with elements containing an
email (String) and a name (String). Next, create a new Set and populate it with the keys from
the hashMap you created.*/

        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("email1","Affaren");
        hm.put("email2","Mappat");
        hm.put("email3","fff");
        HashSet<String>newSet=new HashSet<>(hm.values());
        HashSet<String>newSet1=new HashSet<>(hm.keySet());
        for (String names:newSet1) {
            System.out.println("newSet = " + names);
            //System.out.println(newSet1);

        }






    }
}
