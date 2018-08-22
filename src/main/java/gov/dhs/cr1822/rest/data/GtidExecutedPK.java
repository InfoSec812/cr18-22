package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GtidExecutedPK implements Serializable {
    private String sourceUuid;
    private long intervalStart;

    @Column(name = "source_uuid", nullable = false, length = 36)
    @Id
    public String getSourceUuid() {
        return sourceUuid;
    }

    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    @Column(name = "interval_start", nullable = false)
    @Id
    public long getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(long intervalStart) {
        this.intervalStart = intervalStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GtidExecutedPK that = (GtidExecutedPK) o;
        return intervalStart == that.intervalStart &&
                Objects.equals(sourceUuid, that.sourceUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceUuid, intervalStart);
    }
}
