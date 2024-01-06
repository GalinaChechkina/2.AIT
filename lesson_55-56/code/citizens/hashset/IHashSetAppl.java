package citizens.hashset;

import citizens.model.Person;

public class IHashSetAppl {
    public static void main(String[] args) {
        ISet<String>mySet=new IHashSet<>();
        System.out.println("Size(): "+mySet.size());
        mySet.add("Berlin");
        mySet.add("Leipzig");
        mySet.add("Bonn");
        mySet.add("Frankfurt");
        mySet.forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("Size(): "+mySet.size());
        System.out.println("Contains(): "+mySet.contains("Bonn"));//второй раз не добавляется
        System.out.println("Add(): "+mySet.add("Leipzig"));
        System.out.println("Size(): "+mySet.size());
        System.out.println("Add(): "+mySet.add("Moscow"));
        mySet.forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("------------------");
        System.out.println("Remove(): "+mySet.remove("Bonn"));
        System.out.println("Remove(): "+mySet.remove("Bonn"));
        mySet.forEach(s-> System.out.print(s+" "));
        System.out.println();

        System.out.println("--------Filling with integers in ascending order------------");
        ISet<Integer>set=new IHashSet<>();
        System.out.println(set.size());
        for (int i = 0; i < 20; i++) {
            set.add(i+1);
        }
        set.forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("Contains(): "+set.contains(5));
        System.out.println("Remove(): "+set.remove(7));
        System.out.println("Size(): "+set.size());
        System.out.println("Remove(): "+set.remove(7));

        System.out.println("Add(): "+set.add(100));
        System.out.println("Size(): "+set.size());
        System.out.println("Add(): "+set.add(100));
        System.out.println("Size(): "+set.size());

        System.out.println("---------Filling with integers in descending order-----------");
        ISet<Integer>set1=new IHashSet<>();
        System.out.println("Size(): "+set1.size());
        for (int i = 0; i < 20; i++) {
            set1.add(20-i);
        }
        set1.forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println(set1.contains(1));
        System.out.println(set1.contains(111));
        System.out.println(set1.remove(3));
        System.out.println(set1.remove(3));
        System.out.println("Size(): "+set1.size());

        System.out.println("---------Random filling with integers-----------");
        ISet<Integer>set2=new IHashSet<>();
        set2.add(1434456567);
        set2.add(546);
        set2.add(0);
        set2.add(-8767);
        set2.add(-1);
        set2.add(756546);
        set2.add(12);
        set2.add(-656858446);
        set2.forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("Size(): "+set2.size());
        System.out.println("----------------------------");

        ISet<Person>people=new IHashSet<>();

    }
}
