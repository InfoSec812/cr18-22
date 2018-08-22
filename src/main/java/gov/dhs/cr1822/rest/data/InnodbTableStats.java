package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "innodb_table_stats", schema = "mysql", catalog = "")
@IdClass(InnodbTableStatsPK.class)
public class InnodbTableStats {
    private String databaseName;
    private String tableName;
    private Timestamp lastUpdate;
    private long nRows;
    private long clusteredIndexSize;
    private long sumOfOtherIndexSizes;

    @Id
    @Column(name = "database_name", nullable = false, length = 64)
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Id
    @Column(name = "table_name", nullable = false, length = 199)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "last_update", nullable = false)
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "n_rows", nullable = false)
    public long getnRows() {
        return nRows;
    }

    public void setnRows(long nRows) {
        this.nRows = nRows;
    }

    @Basic
    @Column(name = "clustered_index_size", nullable = false)
    public long getClusteredIndexSize() {
        return clusteredIndexSize;
    }

    public void setClusteredIndexSize(long clusteredIndexSize) {
        this.clusteredIndexSize = clusteredIndexSize;
    }

    @Basic
    @Column(name = "sum_of_other_index_sizes", nullable = false)
    public long getSumOfOtherIndexSizes() {
        return sumOfOtherIndexSizes;
    }

    public void setSumOfOtherIndexSizes(long sumOfOtherIndexSizes) {
        this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbTableStats that = (InnodbTableStats) o;
        return nRows == that.nRows &&
                clusteredIndexSize == that.clusteredIndexSize &&
                sumOfOtherIndexSizes == that.sumOfOtherIndexSizes &&
                Objects.equals(databaseName, that.databaseName) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableName, lastUpdate, nRows, clusteredIndexSize, sumOfOtherIndexSizes);
    }
}
