package practice;

public class Apple {
    public static void main(String[] args) {
        int a=30;
        int counter= 0;        //счетчик
        int applesInCycle= a;  //параметр

        while (applesInCycle>0){
            System.out.println("Take one apple from basket ");
            applesInCycle--;
            counter++;
            System.out.println("Rest apples "+counter);
        }
        System.out.println("The job is done, total apples "+counter+" added in pie");
    }
}
