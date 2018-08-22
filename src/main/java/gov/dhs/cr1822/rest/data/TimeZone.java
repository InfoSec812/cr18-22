package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "time_zone", schema = "mysql", catalog = "")
public class TimeZone {
    private int timeZoneId;
    private Object useLeapSeconds;

    @Id
    @Column(name = "Time_zone_id", nullable = false)
    public int getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Basic
    @Column(name = "Use_leap_seconds", nullable = false)
    public Object getUseLeapSeconds() {
        return useLeapSeconds;
    }

    public void setUseLeapSeconds(Object useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeZone timeZone = (TimeZone) o;
        return timeZoneId == timeZone.timeZoneId &&
                Objects.equals(useLeapSeconds, timeZone.useLeapSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneId, useLeapSeconds);
    }
}
