package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "innodb_index_stats", schema = "mysql", catalog = "")
@IdClass(InnodbIndexStatsPK.class)
public class InnodbIndexStats {
    private String databaseName;
    private String tableName;
    private String indexName;
    private Timestamp lastUpdate;
    private String statName;
    private long statValue;
    private Long sampleSize;
    private String statDescription;

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

    @Id
    @Column(name = "index_name", nullable = false, length = 64)
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "last_update", nullable = false)
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Id
    @Column(name = "stat_name", nullable = false, length = 64)
    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    @Basic
    @Column(name = "stat_value", nullable = false)
    public long getStatValue() {
        return statValue;
    }

    public void setStatValue(long statValue) {
        this.statValue = statValue;
    }

    @Basic
    @Column(name = "sample_size", nullable = true)
    public Long getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Long sampleSize) {
        this.sampleSize = sampleSize;
    }

    @Basic
    @Column(name = "stat_description", nullable = false, length = 1024)
    public String getStatDescription() {
        return statDescription;
    }

    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbIndexStats that = (InnodbIndexStats) o;
        return statValue == that.statValue &&
                Objects.equals(databaseName, that.databaseName) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(indexName, that.indexName) &&
                Objects.equals(lastUpdate, that.lastUpdate) &&
                Objects.equals(statName, that.statName) &&
                Objects.equals(sampleSize, that.sampleSize) &&
                Objects.equals(statDescription, that.statDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableName, indexName, lastUpdate, statName, statValue, sampleSize, statDescription);
    }
}
