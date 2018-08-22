package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "time_zone_transition", schema = "mysql", catalog = "")
@IdClass(TimeZoneTransitionPK.class)
public class TimeZoneTransition {
    private int timeZoneId;
    private long transitionTime;
    private int transitionTypeId;

    @Id
    @Column(name = "Time_zone_id", nullable = false)
    public int getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Id
    @Column(name = "Transition_time", nullable = false)
    public long getTransitionTime() {
        return transitionTime;
    }

    public void setTransitionTime(long transitionTime) {
        this.transitionTime = transitionTime;
    }

    @Basic
    @Column(name = "Transition_type_id", nullable = false)
    public int getTransitionTypeId() {
        return transitionTypeId;
    }

    public void setTransitionTypeId(int transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeZoneTransition that = (TimeZoneTransition) o;
        return timeZoneId == that.timeZoneId &&
                transitionTime == that.transitionTime &&
                transitionTypeId == that.transitionTypeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneId, transitionTime, transitionTypeId);
    }
}
