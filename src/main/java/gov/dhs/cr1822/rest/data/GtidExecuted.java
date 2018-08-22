package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gtid_executed", schema = "mysql", catalog = "")
@IdClass(GtidExecutedPK.class)
public class GtidExecuted {
    private String sourceUuid;
    private long intervalStart;
    private long intervalEnd;

    @Id
    @Column(name = "source_uuid", nullable = false, length = 36)
    public String getSourceUuid() {
        return sourceUuid;
    }

    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    @Id
    @Column(name = "interval_start", nullable = false)
    public long getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(long intervalStart) {
        this.intervalStart = intervalStart;
    }

    @Basic
    @Column(name = "interval_end", nullable = false)
    public long getIntervalEnd() {
        return intervalEnd;
    }

    public void setIntervalEnd(long intervalEnd) {
        this.intervalEnd = intervalEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GtidExecuted that = (GtidExecuted) o;
        return intervalStart == that.intervalStart &&
                intervalEnd == that.intervalEnd &&
                Objects.equals(sourceUuid, that.sourceUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceUuid, intervalStart, intervalEnd);
    }
}
