package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "time_zone_leap_second", schema = "mysql", catalog = "")
public class TimeZoneLeapSecond {
    private long transitionTime;
    private int correction;

    @Id
    @Column(name = "Transition_time", nullable = false)
    public long getTransitionTime() {
        return transitionTime;
    }

    public void setTransitionTime(long transitionTime) {
        this.transitionTime = transitionTime;
    }

    @Basic
    @Column(name = "Correction", nullable = false)
    public int getCorrection() {
        return correction;
    }

    public void setCorrection(int correction) {
        this.correction = correction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeZoneLeapSecond that = (TimeZoneLeapSecond) o;
        return transitionTime == that.transitionTime &&
                correction == that.correction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitionTime, correction);
    }
}
