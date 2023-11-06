package practice.jsonWrapper;

public class JsonWrapper2Appl {
    public static void main(String[] args) {
        JsonWrapper2<String> wrapper2=new JsonWrapper2<>("10");
        System.out.println(wrapper2);

        System.out.println(wrapper2.getValue()+" Hallo!");   //10-строка

        JsonWrapper2<Integer>wrapper21=new JsonWrapper2<>(10);
        System.out.println(wrapper21.getValue()*10);         //10-число (не забывать про get.Value)
    }
}
