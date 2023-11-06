package practice;

public class Year {
    public static void main(String[] args) {
        int god= 2001;
        if (god%4==0 & god%100!=0){
            System.out.println(god+" is a leap year!");
        } else {
            if (god%4==0 & god%100==0 & god%400==0){
                System.out.println(god+" is a leap year!");
            } else {
                System.out.println(god+" is not a leap year.");
            }
            }
        }
    }

