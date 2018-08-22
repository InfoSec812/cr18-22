package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class InnodbIndexStatsPK implements Serializable {
    private String databaseName;
    private String tableName;
    private String indexName;
    private String statName;

    @Column(name = "database_name", nullable = false, length = 64)
    @Id
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Column(name = "table_name", nullable = false, length = 199)
    @Id
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Column(name = "index_name", nullable = false, length = 64)
    @Id
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Column(name = "stat_name", nullable = false, length = 64)
    @Id
    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbIndexStatsPK that = (InnodbIndexStatsPK) o;
        return Objects.equals(databaseName, that.databaseName) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(indexName, that.indexName) &&
                Objects.equals(statName, that.statName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableName, indexName, statName);
    }
}
