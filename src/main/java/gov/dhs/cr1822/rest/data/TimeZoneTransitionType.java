package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "time_zone_transition_type", schema = "mysql", catalog = "")
@IdClass(TimeZoneTransitionTypePK.class)
public class TimeZoneTransitionType {
    private int timeZoneId;
    private int transitionTypeId;
    private int offset;
    private byte isDst;
    private String abbreviation;

    @Id
    @Column(name = "Time_zone_id", nullable = false)
    public int getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Id
    @Column(name = "Transition_type_id", nullable = false)
    public int getTransitionTypeId() {
        return transitionTypeId;
    }

    public void setTransitionTypeId(int transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }

    @Basic
    @Column(name = "Offset", nullable = false)
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Basic
    @Column(name = "Is_DST", nullable = false)
    public byte getIsDst() {
        return isDst;
    }

    public void setIsDst(byte isDst) {
        this.isDst = isDst;
    }

    @Basic
    @Column(name = "Abbreviation", nullable = false, length = 8)
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeZoneTransitionType that = (TimeZoneTransitionType) o;
        return timeZoneId == that.timeZoneId &&
                transitionTypeId == that.transitionTypeId &&
                offset == that.offset &&
                isDst == that.isDst &&
                Objects.equals(abbreviation, that.abbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneId, transitionTypeId, offset, isDst, abbreviation);
    }
}
