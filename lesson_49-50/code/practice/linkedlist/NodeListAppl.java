package practice.linkedlist;

public class NodeListAppl {
    public static void main(String[] args) {
        NodeListImpl<Integer>list=new NodeListImpl<>();

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.forEach(s-> System.out.print(s+"  "));
        System.out.println();

        list.add(2,250);
        list.forEach(s-> System.out.print(s+"  "));
        System.out.println();

        System.out.println(list.indexOf(100));
        System.out.println(list.remove(1));
        list.forEach(s-> System.out.print(s+"  "));
        System.out.println();
    }
}
