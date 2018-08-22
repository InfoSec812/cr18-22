package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Tables {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private Object tableType;
    private String engine;
    private Integer version;
    private Object rowFormat;
    private Long tableRows;
    private Long avgRowLength;
    private Long dataLength;
    private Long maxDataLength;
    private Long indexLength;
    private Long dataFree;
    private Long autoIncrement;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp checkTime;
    private String tableCollation;
    private Long checksum;
    private String createOptions;
    private String tableComment;

    @Basic
    @Column(name = "TABLE_CATALOG", nullable = false, length = 64)
    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Basic
    @Column(name = "TABLE_SCHEMA", nullable = false, length = 64)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME", nullable = false, length = 64)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "TABLE_TYPE", nullable = false)
    public Object getTableType() {
        return tableType;
    }

    public void setTableType(Object tableType) {
        this.tableType = tableType;
    }

    @Basic
    @Column(name = "ENGINE", nullable = true, length = 64)
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "VERSION", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "ROW_FORMAT", nullable = true)
    public Object getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(Object rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Basic
    @Column(name = "TABLE_ROWS", nullable = true)
    public Long getTableRows() {
        return tableRows;
    }

    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    @Basic
    @Column(name = "AVG_ROW_LENGTH", nullable = true)
    public Long getAvgRowLength() {
        return avgRowLength;
    }

    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Basic
    @Column(name = "DATA_LENGTH", nullable = true)
    public Long getDataLength() {
        return dataLength;
    }

    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    @Basic
    @Column(name = "MAX_DATA_LENGTH", nullable = true)
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Basic
    @Column(name = "INDEX_LENGTH", nullable = true)
    public Long getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    @Basic
    @Column(name = "DATA_FREE", nullable = true)
    public Long getDataFree() {
        return dataFree;
    }

    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    @Basic
    @Column(name = "AUTO_INCREMENT", nullable = true)
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "CHECK_TIME", nullable = true)
    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "TABLE_COLLATION", nullable = true, length = 64)
    public String getTableCollation() {
        return tableCollation;
    }

    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
    }

    @Basic
    @Column(name = "CHECKSUM", nullable = true)
    public Long getChecksum() {
        return checksum;
    }

    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    @Basic
    @Column(name = "CREATE_OPTIONS", nullable = true, length = 256)
    public String getCreateOptions() {
        return createOptions;
    }

    public void setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
    }

    @Basic
    @Column(name = "TABLE_COMMENT", nullable = true, length = 256)
    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tables tables = (Tables) o;
        return Objects.equals(tableCatalog, tables.tableCatalog) &&
                Objects.equals(tableSchema, tables.tableSchema) &&
                Objects.equals(tableName, tables.tableName) &&
                Objects.equals(tableType, tables.tableType) &&
                Objects.equals(engine, tables.engine) &&
                Objects.equals(version, tables.version) &&
                Objects.equals(rowFormat, tables.rowFormat) &&
                Objects.equals(tableRows, tables.tableRows) &&
                Objects.equals(avgRowLength, tables.avgRowLength) &&
                Objects.equals(dataLength, tables.dataLength) &&
                Objects.equals(maxDataLength, tables.maxDataLength) &&
                Objects.equals(indexLength, tables.indexLength) &&
                Objects.equals(dataFree, tables.dataFree) &&
                Objects.equals(autoIncrement, tables.autoIncrement) &&
                Objects.equals(createTime, tables.createTime) &&
                Objects.equals(updateTime, tables.updateTime) &&
                Objects.equals(checkTime, tables.checkTime) &&
                Objects.equals(tableCollation, tables.tableCollation) &&
                Objects.equals(checksum, tables.checksum) &&
                Objects.equals(createOptions, tables.createOptions) &&
                Objects.equals(tableComment, tables.tableComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableCatalog, tableSchema, tableName, tableType, engine, version, rowFormat, tableRows, avgRowLength, dataLength, maxDataLength, indexLength, dataFree, autoIncrement, createTime, updateTime, checkTime, tableCollation, checksum, createOptions, tableComment);
    }
}
