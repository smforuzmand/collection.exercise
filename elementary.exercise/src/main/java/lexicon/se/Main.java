package lexicon.se;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //ExerciseCollection.ex1();
        //ExerciseCollection.ex2();
        //ExerciseCollection.ex3();
        //ExerciseCollection.ex4();
        //ExerciseCollection.ex5();
        //ExerciseCollection.ex6();
        //ExerciseCollection.ex7();
        //ExerciseCollection.ex8();
        //ExerciseCollection.ex9();
        //ExerciseCollection.ex10();
        ///////////////////////////////////////////////////////////////////////Exercise 12;

        Car car = new Car(1,"Audi","Q5");
        Car car1 = new Car(2,"Toyota","Prado");
        Car car2 = new Car(3,"Citroen","C3");
        HashMap<String , Car> CarMap = new HashMap<>();
        CarMap.put(car.getBrand(),car);// dedicating the key and value based on object info to map
        CarMap.put(car1.getBrand(),car1);
        CarMap.put(car2.getBrand(),car2);

        System.out.println(car.getBrand()+" "+ car.getModel()+" "+car.getId());
        System.out.println(CarMap);
        System.out.println(car1.getBrand());

        //Display only the car brands
        for (String key : CarMap.keySet()){
            System.out.println("brand is " + key );
        }
        ArrayList<String> names = new ArrayList<>();
        names.add("dsads");
        names.add("lgkfd");
        names.add("fghh");

        ListIterator<String> itr=names.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        HashSet<String> name= new HashSet<String>();

    }


}

