package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_CMP_PER_INDEX", schema = "information_schema", catalog = "")
public class InnodbCmpPerIndex {
    private String databaseName;
    private String tableName;
    private String indexName;
    private int compressOps;
    private int compressOpsOk;
    private int compressTime;
    private int uncompressOps;
    private int uncompressTime;

    @Basic
    @Column(name = "database_name", nullable = false, length = 192)
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Basic
    @Column(name = "table_name", nullable = false, length = 192)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "index_name", nullable = false, length = 192)
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "compress_ops", nullable = false)
    public int getCompressOps() {
        return compressOps;
    }

    public void setCompressOps(int compressOps) {
        this.compressOps = compressOps;
    }

    @Basic
    @Column(name = "compress_ops_ok", nullable = false)
    public int getCompressOpsOk() {
        return compressOpsOk;
    }

    public void setCompressOpsOk(int compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    @Basic
    @Column(name = "compress_time", nullable = false)
    public int getCompressTime() {
        return compressTime;
    }

    public void setCompressTime(int compressTime) {
        this.compressTime = compressTime;
    }

    @Basic
    @Column(name = "uncompress_ops", nullable = false)
    public int getUncompressOps() {
        return uncompressOps;
    }

    public void setUncompressOps(int uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    @Basic
    @Column(name = "uncompress_time", nullable = false)
    public int getUncompressTime() {
        return uncompressTime;
    }

    public void setUncompressTime(int uncompressTime) {
        this.uncompressTime = uncompressTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbCmpPerIndex that = (InnodbCmpPerIndex) o;
        return compressOps == that.compressOps &&
                compressOpsOk == that.compressOpsOk &&
                compressTime == that.compressTime &&
                uncompressOps == that.uncompressOps &&
                uncompressTime == that.uncompressTime &&
                Objects.equals(databaseName, that.databaseName) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(indexName, that.indexName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableName, indexName, compressOps, compressOpsOk, compressTime, uncompressOps, uncompressTime);
    }
}
