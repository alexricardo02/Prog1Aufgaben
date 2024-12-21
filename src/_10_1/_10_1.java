package _10_1;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _10_1 {

    private long hour;
    private long minute;
    private long second;

    public _10_1() {
        this.hour = LocalDateTime.now().getHour();
        this.minute = LocalDateTime.now().getMinute();
        this.second = LocalDateTime.now().getSecond();
    }

    public _10_1(long elapsedTime) {
        setTime(elapsedTime);
    }

    public _10_1(long newHour, long newMinute, long newSecond){
        this.hour = newHour;
        this.minute = newMinute;
        this.second = newSecond;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        this.hour = (int) currentHour;
        this.minute = (int) currentMinute;
        this.second = (int) currentSeconds;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        // Prueba del constructor sin argumentos
        _10_1 timeNow = new _10_1();
        System.out.println("Hora actual: " + timeNow);

        // Prueba del constructor con tiempo transcurrido en milisegundos
        long elapsedTime = 555550000; // Ejemplo
        _10_1 timeFromEpoch = new _10_1(elapsedTime);
        System.out.println("Hora calculada desde la época: " + timeFromEpoch);
    }
}
