package lexicon.se;

import java.util.*;

public class ExerciseCollection {

    public static void ex1() {
        //1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");
        System.out.println(weekDays);

    }

    //2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
    //and print out each element separately.
    public static void ex2() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");
        //Collections.sort(weekDays);   //Just To Test How Does It Work?

        for (String day : weekDays) {
            System.out.println(day);
        }
        Iterator iter = weekDays.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        //weekDays.contains("Saturday");
        System.out.println(weekDays.contains("Saturday"));
    }

    //3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
    //insert the weekday THURSDAY into the right position in the list.
    public static void ex3() {
        LinkedList<String> weekDays = new LinkedList<>();
        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");

        weekDays.remove(3);
        weekDays.addLast("Thursday");

        System.out.println(weekDays);

    }

    //4. Create a new list and populate it with the days of the week. Then create a new list out of the
    //first three elements of the first list using a subList.
    public static void ex4() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");

        List<String> sublist = weekDays.subList(3, 7);
        System.out.println("sub list of weekdays = " + sublist);


    }

    public static void ex5() {
        //5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
        //pay attention to the order of the elements.
        HashSet<String> weekdays = new HashSet<>();
        weekdays.add("MOnday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        Iterator iter = weekdays.iterator();
        while (iter.hasNext()) {//no order set followed by method
            System.out.println(iter.next());
        }

    }

    public static void ex6() {
        //6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
        //an arrayList.
        HashSet<String> weekdays = new HashSet<>();
        weekdays.add("MOnday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("the HashSet weekdays contains :" + weekdays);
        //Convert to  Array
        String[] array = weekdays.toArray(new String[7]);//#1
        System.out.println("array = " + weekdays);
        String[] array2 = new String[weekdays.size()];//#2 Having a fixed size array , extract the weekday size and assign to array2
        weekdays.toArray(array2);//method to change the list to array
        //Displaying the Array;

        for (String str : array2) {
            System.out.println(str);
        }
        //Convert to ArrayList
        ArrayList<String> arrayList = new ArrayList<String>(weekdays);
        System.out.println("arrayList = " + arrayList);

    }

    public static void ex7() {
        //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an
        //arrayList. Lastly, manually sort the list in alphabetical order and print it out.

        HashSet<String> randomNames = new HashSet<String>();
        randomNames.add("Erik");
        randomNames.add("Eva");
        randomNames.add("Martin");
        randomNames.add("Johnnas");
        randomNames.add("Johakim");
        randomNames.add("Sara");
        List<String> newRandomName = new ArrayList<String>(randomNames);
        System.out.println("unsorted names as follow  :");
        for (String names : newRandomName) {
            System.out.println(names);//print out unsorted list!
        }
        System.out.println("sourted names after using Collection.sort");
        Collections.sort(newRandomName);

        for (String sortedNames : newRandomName) {
            System.out.println(sortedNames);
        }
    }

    public static void ex8() {
        //8. Create a new hashSet and populate it with random names. Lasty, sort the names in
        // alphabetical order using only a Set or a child of Set.
        HashSet<String> randomNames = new HashSet<String>();
        randomNames.add("Erik");
        randomNames.add("Eva");
        randomNames.add("Martin");
        randomNames.add("Johnnas");
        randomNames.add("Johakim");
        randomNames.add("Sara");
        System.out.println("what we have before sorting :");
        for (String names : randomNames) {
            System.out.println(names);
        }
        //Sorting with treeset
        TreeSet<String> sortedNames = new TreeSet<String>(randomNames);
        System.out.println("Sorting with Set and TreeSet :");
        for (String names : sortedNames) {
            System.out.println(names);
        }
        
    }
    public static void ex9() {
        //9. Create a new hashMap of type <Integer,String> and populate it with elements containing an
        //id(Integer) and a car brand(String). Lastly, print out the entire hashMap.


    }

}











