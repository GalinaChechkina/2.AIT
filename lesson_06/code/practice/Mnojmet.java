package practice;

import java.util.Scanner;

public class Mnojmet {
    public static void main(String[] args) {

        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int number1= scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int number2= scanner.nextInt();

        int min = (number1<number2) ? number1: number2;
        System.out.println("Minimum " +min);

        int timeForGame=60;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input note: ");
        int note= scanner.nextInt();

        switch (note){
            case 1:
                System.out.println("OMG!!!");
                break;
            case 2:
                System.out.println("Плохо- никаких игр!");
                timeForGame= 0;
                System.out.println("Time for game "+timeForGame);
                break;
            case 3:
                System.out.println("Так себе результатик- минус 30 минут от игр");
                timeForGame= timeForGame-30;
                System.out.println("Time for game "+timeForGame);
                break;
            case 4:
                System.out.println("Хорошо- можешь поиграть 1 час");
                System.out.println("Time for game "+timeForGame);
                break;
            case 5:
                System.out.println("Блеск- плюс полчаса игрового времени!");
                timeForGame= timeForGame+30;
                System.out.println("Time for game "+timeForGame);
                break;
            default:
                System.out.println("Не шути так!");
                break;

        }*/

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input color: ");
        String color= scanner.next();

        switch (color){
            case ("red"):
                System.out.println("Stop!");
                break;
            case ("yellow"):
                System.out.println("Be ready!");
                break;
            case ("green"):
                System.out.println("Go!");
                break;
            default:
                System.out.println("It's time to see a doctor:)");
        }

    }
}
