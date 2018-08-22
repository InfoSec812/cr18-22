package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_TABLESTATS", schema = "information_schema", catalog = "")
public class InnodbTablestats {
    private long tableId;
    private String name;
    private String statsInitialized;
    private long numRows;
    private long clustIndexSize;
    private long otherIndexSize;
    private long modifiedCounter;
    private long autoinc;
    private int refCount;

    @Basic
    @Column(name = "TABLE_ID", nullable = false)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 193)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "STATS_INITIALIZED", nullable = false, length = 193)
    public String getStatsInitialized() {
        return statsInitialized;
    }

    public void setStatsInitialized(String statsInitialized) {
        this.statsInitialized = statsInitialized;
    }

    @Basic
    @Column(name = "NUM_ROWS", nullable = false)
    public long getNumRows() {
        return numRows;
    }

    public void setNumRows(long numRows) {
        this.numRows = numRows;
    }

    @Basic
    @Column(name = "CLUST_INDEX_SIZE", nullable = false)
    public long getClustIndexSize() {
        return clustIndexSize;
    }

    public void setClustIndexSize(long clustIndexSize) {
        this.clustIndexSize = clustIndexSize;
    }

    @Basic
    @Column(name = "OTHER_INDEX_SIZE", nullable = false)
    public long getOtherIndexSize() {
        return otherIndexSize;
    }

    public void setOtherIndexSize(long otherIndexSize) {
        this.otherIndexSize = otherIndexSize;
    }

    @Basic
    @Column(name = "MODIFIED_COUNTER", nullable = false)
    public long getModifiedCounter() {
        return modifiedCounter;
    }

    public void setModifiedCounter(long modifiedCounter) {
        this.modifiedCounter = modifiedCounter;
    }

    @Basic
    @Column(name = "AUTOINC", nullable = false)
    public long getAutoinc() {
        return autoinc;
    }

    public void setAutoinc(long autoinc) {
        this.autoinc = autoinc;
    }

    @Basic
    @Column(name = "REF_COUNT", nullable = false)
    public int getRefCount() {
        return refCount;
    }

    public void setRefCount(int refCount) {
        this.refCount = refCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbTablestats that = (InnodbTablestats) o;
        return tableId == that.tableId &&
                numRows == that.numRows &&
                clustIndexSize == that.clustIndexSize &&
                otherIndexSize == that.otherIndexSize &&
                modifiedCounter == that.modifiedCounter &&
                autoinc == that.autoinc &&
                refCount == that.refCount &&
                Objects.equals(name, that.name) &&
                Objects.equals(statsInitialized, that.statsInitialized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, name, statsInitialized, numRows, clustIndexSize, otherIndexSize, modifiedCounter, autoinc, refCount);
    }
}
