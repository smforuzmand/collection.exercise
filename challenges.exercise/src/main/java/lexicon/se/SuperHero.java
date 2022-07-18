package lexicon.se;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SuperHero implements Comparable<SuperHero> {
    int id;
    String name;
    int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SuperHero() {
    }

    SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(SuperHero sh) {

        if (age == sh.age)
            return 0;
        else if (age > sh.age)
            return 1;
        else
            return -1;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void ex3() {

        List<SuperHero> al = new ArrayList<>();
        SuperHero superMan =new SuperHero();
        al.add(new SuperHero(1, "Bibo", 23));
        al.add(new SuperHero(2, "Enzo", 44));
        al.add(new SuperHero(3, "Baron", 5));
        //Collections.sort(al);

        for (SuperHero sh : al) {
            System.out.println(sh.age + sh.name+ sh.id);
        }


    }
}

