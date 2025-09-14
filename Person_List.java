package Code;

import java.util.*;

public class Person_List {

    ArrayList<Person> List = new ArrayList<>();

    public void add(Person p) {
        p.input();
        List.add(p);
        System.out.println("Add complete.");
    }

    public void out() {
        if (List.size() == 0) {
            System.out.println("List not have anything.");
        } else {
            for (int i = 0; i < List.size(); i++) {
                List.get(i).output();
            }
        }
    }
}