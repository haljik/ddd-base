package example.domain.type.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 時刻を時分単位で表す
 */
public class HourTime {
    LocalTime value;

    HourTime (LocalTime hourPoint) {
        this.value = hourPoint;
    }

    public HourTime(String hourTimeText) {
        this(LocalTime.parse(hourTimeText));
    }

    public HourTime (int hour, int minute) {
        value = LocalTime.of(hour, minute);
    }

    @Override
    public String toString() {
        return value.format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}