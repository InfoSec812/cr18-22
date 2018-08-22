package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Files {
    private Long fileId;
    private String fileName;
    private String fileType;
    private String tablespaceName;
    private String tableCatalog;
    private byte[] tableSchema;
    private byte[] tableName;
    private String logfileGroupName;
    private Long logfileGroupNumber;
    private String engine;
    private byte[] fulltextKeys;
    private byte[] deletedRows;
    private byte[] updateCount;
    private Long freeExtents;
    private Long totalExtents;
    private Long extentSize;
    private Long initialSize;
    private Long maximumSize;
    private Long autoextendSize;
    private byte[] creationTime;
    private byte[] lastUpdateTime;
    private byte[] lastAccessTime;
    private byte[] recoverTime;
    private byte[] transactionCounter;
    private Long version;
    private String rowFormat;
    private byte[] tableRows;
    private byte[] avgRowLength;
    private byte[] dataLength;
    private byte[] maxDataLength;
    private byte[] indexLength;
    private Long dataFree;
    private byte[] createTime;
    private byte[] updateTime;
    private byte[] checkTime;
    private byte[] checksum;
    private String status;
    private byte[] extra;

    @Basic
    @Column(name = "FILE_ID", nullable = true)
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "FILE_NAME", nullable = true, length = -1)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "FILE_TYPE", nullable = true, length = 256)
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Basic
    @Column(name = "TABLESPACE_NAME", nullable = false, length = 259)
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Basic
    @Column(name = "TABLE_CATALOG", nullable = false, length = 0)
    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Basic
    @Column(name = "TABLE_SCHEMA", nullable = true)
    public byte[] getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(byte[] tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME", nullable = true)
    public byte[] getTableName() {
        return tableName;
    }

    public void setTableName(byte[] tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "LOGFILE_GROUP_NAME", nullable = true, length = 256)
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    @Basic
    @Column(name = "LOGFILE_GROUP_NUMBER", nullable = true)
    public Long getLogfileGroupNumber() {
        return logfileGroupNumber;
    }

    public void setLogfileGroupNumber(Long logfileGroupNumber) {
        this.logfileGroupNumber = logfileGroupNumber;
    }

    @Basic
    @Column(name = "ENGINE", nullable = false, length = 64)
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "FULLTEXT_KEYS", nullable = true)
    public byte[] getFulltextKeys() {
        return fulltextKeys;
    }

    public void setFulltextKeys(byte[] fulltextKeys) {
        this.fulltextKeys = fulltextKeys;
    }

    @Basic
    @Column(name = "DELETED_ROWS", nullable = true)
    public byte[] getDeletedRows() {
        return deletedRows;
    }

    public void setDeletedRows(byte[] deletedRows) {
        this.deletedRows = deletedRows;
    }

    @Basic
    @Column(name = "UPDATE_COUNT", nullable = true)
    public byte[] getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(byte[] updateCount) {
        this.updateCount = updateCount;
    }

    @Basic
    @Column(name = "FREE_EXTENTS", nullable = true)
    public Long getFreeExtents() {
        return freeExtents;
    }

    public void setFreeExtents(Long freeExtents) {
        this.freeExtents = freeExtents;
    }

    @Basic
    @Column(name = "TOTAL_EXTENTS", nullable = true)
    public Long getTotalExtents() {
        return totalExtents;
    }

    public void setTotalExtents(Long totalExtents) {
        this.totalExtents = totalExtents;
    }

    @Basic
    @Column(name = "EXTENT_SIZE", nullable = true)
    public Long getExtentSize() {
        return extentSize;
    }

    public void setExtentSize(Long extentSize) {
        this.extentSize = extentSize;
    }

    @Basic
    @Column(name = "INITIAL_SIZE", nullable = true)
    public Long getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(Long initialSize) {
        this.initialSize = initialSize;
    }

    @Basic
    @Column(name = "MAXIMUM_SIZE", nullable = true)
    public Long getMaximumSize() {
        return maximumSize;
    }

    public void setMaximumSize(Long maximumSize) {
        this.maximumSize = maximumSize;
    }

    @Basic
    @Column(name = "AUTOEXTEND_SIZE", nullable = true)
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    @Basic
    @Column(name = "CREATION_TIME", nullable = true)
    public byte[] getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(byte[] creationTime) {
        this.creationTime = creationTime;
    }

    @Basic
    @Column(name = "LAST_UPDATE_TIME", nullable = true)
    public byte[] getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(byte[] lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Basic
    @Column(name = "LAST_ACCESS_TIME", nullable = true)
    public byte[] getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(byte[] lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Basic
    @Column(name = "RECOVER_TIME", nullable = true)
    public byte[] getRecoverTime() {
        return recoverTime;
    }

    public void setRecoverTime(byte[] recoverTime) {
        this.recoverTime = recoverTime;
    }

    @Basic
    @Column(name = "TRANSACTION_COUNTER", nullable = true)
    public byte[] getTransactionCounter() {
        return transactionCounter;
    }

    public void setTransactionCounter(byte[] transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    @Basic
    @Column(name = "VERSION", nullable = true)
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Basic
    @Column(name = "ROW_FORMAT", nullable = true, length = 256)
    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Basic
    @Column(name = "TABLE_ROWS", nullable = true)
    public byte[] getTableRows() {
        return tableRows;
    }

    public void setTableRows(byte[] tableRows) {
        this.tableRows = tableRows;
    }

    @Basic
    @Column(name = "AVG_ROW_LENGTH", nullable = true)
    public byte[] getAvgRowLength() {
        return avgRowLength;
    }

    public void setAvgRowLength(byte[] avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Basic
    @Column(name = "DATA_LENGTH", nullable = true)
    public byte[] getDataLength() {
        return dataLength;
    }

    public void setDataLength(byte[] dataLength) {
        this.dataLength = dataLength;
    }

    @Basic
    @Column(name = "MAX_DATA_LENGTH", nullable = true)
    public byte[] getMaxDataLength() {
        return maxDataLength;
    }

    public void setMaxDataLength(byte[] maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Basic
    @Column(name = "INDEX_LENGTH", nullable = true)
    public byte[] getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(byte[] indexLength) {
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
    @Column(name = "CREATE_TIME", nullable = true)
    public byte[] getCreateTime() {
        return createTime;
    }

    public void setCreateTime(byte[] createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = true)
    public byte[] getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(byte[] updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "CHECK_TIME", nullable = true)
    public byte[] getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(byte[] checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "CHECKSUM", nullable = true)
    public byte[] getChecksum() {
        return checksum;
    }

    public void setChecksum(byte[] checksum) {
        this.checksum = checksum;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 256)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "EXTRA", nullable = true)
    public byte[] getExtra() {
        return extra;
    }

    public void setExtra(byte[] extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Files files = (Files) o;
        return Objects.equals(fileId, files.fileId) &&
                Objects.equals(fileName, files.fileName) &&
                Objects.equals(fileType, files.fileType) &&
                Objects.equals(tablespaceName, files.tablespaceName) &&
                Objects.equals(tableCatalog, files.tableCatalog) &&
                Arrays.equals(tableSchema, files.tableSchema) &&
                Arrays.equals(tableName, files.tableName) &&
                Objects.equals(logfileGroupName, files.logfileGroupName) &&
                Objects.equals(logfileGroupNumber, files.logfileGroupNumber) &&
                Objects.equals(engine, files.engine) &&
                Arrays.equals(fulltextKeys, files.fulltextKeys) &&
                Arrays.equals(deletedRows, files.deletedRows) &&
                Arrays.equals(updateCount, files.updateCount) &&
                Objects.equals(freeExtents, files.freeExtents) &&
                Objects.equals(totalExtents, files.totalExtents) &&
                Objects.equals(extentSize, files.extentSize) &&
                Objects.equals(initialSize, files.initialSize) &&
                Objects.equals(maximumSize, files.maximumSize) &&
                Objects.equals(autoextendSize, files.autoextendSize) &&
                Arrays.equals(creationTime, files.creationTime) &&
                Arrays.equals(lastUpdateTime, files.lastUpdateTime) &&
                Arrays.equals(lastAccessTime, files.lastAccessTime) &&
                Arrays.equals(recoverTime, files.recoverTime) &&
                Arrays.equals(transactionCounter, files.transactionCounter) &&
                Objects.equals(version, files.version) &&
                Objects.equals(rowFormat, files.rowFormat) &&
                Arrays.equals(tableRows, files.tableRows) &&
                Arrays.equals(avgRowLength, files.avgRowLength) &&
                Arrays.equals(dataLength, files.dataLength) &&
                Arrays.equals(maxDataLength, files.maxDataLength) &&
                Arrays.equals(indexLength, files.indexLength) &&
                Objects.equals(dataFree, files.dataFree) &&
                Arrays.equals(createTime, files.createTime) &&
                Arrays.equals(updateTime, files.updateTime) &&
                Arrays.equals(checkTime, files.checkTime) &&
                Arrays.equals(checksum, files.checksum) &&
                Objects.equals(status, files.status) &&
                Arrays.equals(extra, files.extra);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fileId, fileName, fileType, tablespaceName, tableCatalog, logfileGroupName, logfileGroupNumber, engine, freeExtents, totalExtents, extentSize, initialSize, maximumSize, autoextendSize, version, rowFormat, dataFree, status);
        result = 31 * result + Arrays.hashCode(tableSchema);
        result = 31 * result + Arrays.hashCode(tableName);
        result = 31 * result + Arrays.hashCode(fulltextKeys);
        result = 31 * result + Arrays.hashCode(deletedRows);
        result = 31 * result + Arrays.hashCode(updateCount);
        result = 31 * result + Arrays.hashCode(creationTime);
        result = 31 * result + Arrays.hashCode(lastUpdateTime);
        result = 31 * result + Arrays.hashCode(lastAccessTime);
        result = 31 * result + Arrays.hashCode(recoverTime);
        result = 31 * result + Arrays.hashCode(transactionCounter);
        result = 31 * result + Arrays.hashCode(tableRows);
        result = 31 * result + Arrays.hashCode(avgRowLength);
        result = 31 * result + Arrays.hashCode(dataLength);
        result = 31 * result + Arrays.hashCode(maxDataLength);
        result = 31 * result + Arrays.hashCode(indexLength);
        result = 31 * result + Arrays.hashCode(createTime);
        result = 31 * result + Arrays.hashCode(updateTime);
        result = 31 * result + Arrays.hashCode(checkTime);
        result = 31 * result + Arrays.hashCode(checksum);
        result = 31 * result + Arrays.hashCode(extra);
        return result;
    }
}
