package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TimeZoneTransitionTypePK implements Serializable {
    private int timeZoneId;
    private int transitionTypeId;

    @Column(name = "Time_zone_id", nullable = false)
    @Id
    public int getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Column(name = "Transition_type_id", nullable = false)
    @Id
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
        TimeZoneTransitionTypePK that = (TimeZoneTransitionTypePK) o;
        return timeZoneId == that.timeZoneId &&
                transitionTypeId == that.transitionTypeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneId, transitionTypeId);
    }
}
