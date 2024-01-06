package practice.consultation;

import com.sun.tools.javac.Main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.time.LocalTime;

public class Pomodoro {

    private static final int INITIAL_WORK_LENGTH= 5*1000;//sec
    private static final int SHORT_BREAK=1*1000;//sec
    private static final int LONG_BREAK=2*1000;//sec
    public static void main(String[] args) {
        int workCounter=0; //if  (workCounter % 4) LongBreak
        LocalTime localTime=LocalTime.now().plusMinutes(1);
        startWork(workCounter,localTime);
    }

    private static void startWork(int workCounter, LocalTime localTime) {
        LocalTime timeNow=LocalTime.now();

        while (timeNow.isBefore(localTime)) {
            workCounter++;
            System.out.println("Start work, please");
            sleep(INITIAL_WORK_LENGTH);
            if(workCounter % 4 != 0){
                System.out.println("Make a short break, please");
                sleep(SHORT_BREAK);
            } else {
                System.out.println("Make a long break, please");
                sleep(LONG_BREAK);
            }

            timeNow=LocalTime.now();
        }

    }
    private static void sleep(int timeToSleep){
        try {
            Thread.sleep(timeToSleep);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    private static void alert(String fileName) {
        try (AudioInputStream player = AudioSystem.getAudioInputStream(Main.class.getResource("/sound/" + fileName))) {
            Clip clip = AudioSystem.getClip();
            clip.open(player);
            clip.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
