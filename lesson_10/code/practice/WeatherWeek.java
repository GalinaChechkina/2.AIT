package practice;

public class WeatherWeek {
    public static void main(String[] args) {

        int[]arrayWeather= {29,30,28,27,24,26,29};

        System.out.println("The weather on Tuesday was  " +arrayWeather[1]);
        System.out.println("The weather on Thursday was  " +arrayWeather[3]);
        double sr=0;
            double sum = 0;
            for (int i = 0; i < arrayWeather.length; i++) {
                sum += arrayWeather[i];
            }
            sr = sum / arrayWeather.length;
        System.out.println("The average weather for the past week was  " +sr);
    }
}
