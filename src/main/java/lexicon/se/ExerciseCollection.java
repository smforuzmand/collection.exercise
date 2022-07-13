package lexicon.se;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        for (String day : weekDays) {
            System.out.println(day);
        }
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
    public static void ex4(){
        ArrayList<String> weekDays=new ArrayList<>();
        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");

        List<String>sublist=weekDays.subList(3,7);
        System.out.println("sub list of weekdays = " + sublist);

public static void ex5(){

        }







    }



}




