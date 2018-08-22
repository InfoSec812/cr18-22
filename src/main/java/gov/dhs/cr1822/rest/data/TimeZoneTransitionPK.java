package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TimeZoneTransitionPK implements Serializable {
    private int timeZoneId;
    private long transitionTime;

    @Column(name = "Time_zone_id", nullable = false)
    @Id
    public int getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Column(name = "Transition_time", nullable = false)
    @Id
    public long getTransitionTime() {
        return transitionTime;
    }

    public void setTransitionTime(long transitionTime) {
        this.transitionTime = transitionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeZoneTransitionPK that = (TimeZoneTransitionPK) o;
        return timeZoneId == that.timeZoneId &&
                transitionTime == that.transitionTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneId, transitionTime);
    }
}
