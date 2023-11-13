package practice.ilist;

public class IListAppl {
    public static void main(String[] args) {

        /*IList<Integer> list = new IListImpl<>();
        System.out.println(list.size());            // (1)
        System.out.println(list.isEmpty());         //(2)
        list.add(10);                               // (4)
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("--------------------");
        //System.out.println(list.remove(10));

        System.out.println(list.contains(30));      // (5)
        System.out.println(list.contains(31));
        System.out.println(list.indexOf(30));// (11)

        //list.clean();                               // (3)

        System.out.println(list.remove(1));   // (8)
        //System.out.println(list.remove(13));
        System.out.println(list.indexOf(30));
        //System.out.println(list.remove(10));     // (6)- в случае с классом Integer полиморфизм не срабатывает
        System.out.println(list.remove(50));     // дефолтный метод из интерфейса не виден (наверно надо переименовать один из методов для корректной работы)

        list.add(1,50);               // (7)
        System.out.println(list.indexOf(50));
        System.out.println(list.get(3));           // (9)
        System.out.println(list.set(2,66));        // (10)
        System.out.println(list.get(2));
        System.out.println(list.lastIndexOf(40));// (12)
        System.out.println(list.size());*/

        int i;
        String str;
        String str1;

        IList<String> listOfCities = new IListImpl<>();
        listOfCities.add("Berlin");
        listOfCities.add("Lyon");
        listOfCities.add("New York");
        listOfCities.add(null);
        listOfCities.add("Madrid");
        listOfCities.add("Frankfurt am Main");
        printList(listOfCities);

        System.out.println("Total elements: "+ listOfCities.size());
        System.out.println("The list is empty (true/false): "+ listOfCities.isEmpty());

        str="Moscow";
        System.out.println("Index of a non-existed element "+str+" is "+ listOfCities.indexOf(str)); // (11)
        System.out.println("Index of element null is "+ listOfCities.indexOf(null));

        str="Madrid";
        System.out.println("Last index of object "+str+" is "+ listOfCities.lastIndexOf(str)); // (12)

        i=4;
        str="Rome";
        listOfCities.add(i,str);
        System.out.println("Index of the added object "+str+" is "+ listOfCities.indexOf(str));
        printList(listOfCities);

        i=0;
        System.out.println("Object with index "+i+" is "+listOfCities.get(i));

        i=1;
        str="Lyon";
        str1="Paris";
        System.out.println("Changed "+str+" to "+str1+ ": "+ listOfCities.set(i,str1));
        System.out.println("Examination: "+listOfCities.get(i));

        str="New York";
        System.out.println("Removed object "+str+" from the list (true/false): "+ listOfCities.remove(str));
        System.out.println("Is "+str+" on the list? (true/false): "+ listOfCities.contains(str));
        printList(listOfCities);

        i=5;
        System.out.println("Remote object with index "+i+" is " + listOfCities.remove(i));
        printList(listOfCities);
        listOfCities.forEach(s -> System.out.print(s+" | "));//аналог метода печати с помощью лямбда-выражения
        System.out.println();
        listOfCities.forEach(System.out::println); // и уще один метод
        for (int j = 0; j < listOfCities.size(); j++) { //еще способ печати
            System.out.print(listOfCities.get(j)+" * ");
        }
        System.out.println();
        listOfCities.clean();
        System.out.println("Total elements: "+ listOfCities.size());


    }
    public static void printList(IList list){
        System.out.println("-----------------------");
        System.out.println("Show the List:");
        for (Object l:list){
            System.out.print(l +"  ");
        }
        System.out.println();
        System.out.println("-----------------------");
    }
}