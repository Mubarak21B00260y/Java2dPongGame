import java.util.concurrent.TimeUnit;

public class Time {
    public  static  double StartTime= System.nanoTime();

    public  static  double  getTime(){

         double timePassedBy= System.nanoTime()-StartTime;
         double TimeInNano= (timePassedBy)* 1E-9;
           return TimeInNano;
    }
}
