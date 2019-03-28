import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem_019 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 1_901; year <= 2_000; year++) {
            for (int month = 1; month <= 12; month++) {
                LocalDate date = LocalDate.of(year, month, 1);
                if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}