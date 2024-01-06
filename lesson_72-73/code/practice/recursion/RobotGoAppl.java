package practice.recursion;

public class RobotGoAppl {
    public static void main(String[] args) {
        int steps=10;
        int count=0;
        moveForward(steps,count);
    }

    private static void moveForward(int steps,int count) {
        if(steps>0) {
            count++;
            System.out.println("Step "+count+"; "+(steps-1)+" steps left");
            moveForward(steps - 1,count);
        } else{
            System.out.println("Дошел!");
        }
    }
}
