package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Partitions {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String partitionName;
    private String subpartitionName;
    private Integer partitionOrdinalPosition;
    private Integer subpartitionOrdinalPosition;
    private String partitionMethod;
    private String subpartitionMethod;
    private String partitionExpression;
    private String subpartitionExpression;
    private String partitionDescription;
    private Long tableRows;
    private Long avgRowLength;
    private Long dataLength;
    private Long maxDataLength;
    private Long indexLength;
    private Long dataFree;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp checkTime;
    private Long checksum;
    private String partitionComment;
    private String nodegroup;
    private String tablespaceName;

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
    @Column(name = "PARTITION_NAME", nullable = true, length = 64)
    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    @Basic
    @Column(name = "SUBPARTITION_NAME", nullable = true, length = 64)
    public String getSubpartitionName() {
        return subpartitionName;
    }

    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    @Basic
    @Column(name = "PARTITION_ORDINAL_POSITION", nullable = true)
    public Integer getPartitionOrdinalPosition() {
        return partitionOrdinalPosition;
    }

    public void setPartitionOrdinalPosition(Integer partitionOrdinalPosition) {
        this.partitionOrdinalPosition = partitionOrdinalPosition;
    }

    @Basic
    @Column(name = "SUBPARTITION_ORDINAL_POSITION", nullable = true)
    public Integer getSubpartitionOrdinalPosition() {
        return subpartitionOrdinalPosition;
    }

    public void setSubpartitionOrdinalPosition(Integer subpartitionOrdinalPosition) {
        this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
    }

    @Basic
    @Column(name = "PARTITION_METHOD", nullable = true, length = 13)
    public String getPartitionMethod() {
        return partitionMethod;
    }

    public void setPartitionMethod(String partitionMethod) {
        this.partitionMethod = partitionMethod;
    }

    @Basic
    @Column(name = "SUBPARTITION_METHOD", nullable = true, length = 13)
    public String getSubpartitionMethod() {
        return subpartitionMethod;
    }

    public void setSubpartitionMethod(String subpartitionMethod) {
        this.subpartitionMethod = subpartitionMethod;
    }

    @Basic
    @Column(name = "PARTITION_EXPRESSION", nullable = true, length = 2048)
    public String getPartitionExpression() {
        return partitionExpression;
    }

    public void setPartitionExpression(String partitionExpression) {
        this.partitionExpression = partitionExpression;
    }

    @Basic
    @Column(name = "SUBPARTITION_EXPRESSION", nullable = true, length = 2048)
    public String getSubpartitionExpression() {
        return subpartitionExpression;
    }

    public void setSubpartitionExpression(String subpartitionExpression) {
        this.subpartitionExpression = subpartitionExpression;
    }

    @Basic
    @Column(name = "PARTITION_DESCRIPTION", nullable = true, length = -1)
    public String getPartitionDescription() {
        return partitionDescription;
    }

    public void setPartitionDescription(String partitionDescription) {
        this.partitionDescription = partitionDescription;
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
    @Column(name = "CHECKSUM", nullable = true)
    public Long getChecksum() {
        return checksum;
    }

    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    @Basic
    @Column(name = "PARTITION_COMMENT", nullable = false, length = -1)
    public String getPartitionComment() {
        return partitionComment;
    }

    public void setPartitionComment(String partitionComment) {
        this.partitionComment = partitionComment;
    }

    @Basic
    @Column(name = "NODEGROUP", nullable = true, length = 256)
    public String getNodegroup() {
        return nodegroup;
    }

    public void setNodegroup(String nodegroup) {
        this.nodegroup = nodegroup;
    }

    @Basic
    @Column(name = "TABLESPACE_NAME", nullable = true, length = 259)
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partitions that = (Partitions) o;
        return Objects.equals(tableCatalog, that.tableCatalog) &&
                Objects.equals(tableSchema, that.tableSchema) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(partitionName, that.partitionName) &&
                Objects.equals(subpartitionName, that.subpartitionName) &&
                Objects.equals(partitionOrdinalPosition, that.partitionOrdinalPosition) &&
                Objects.equals(subpartitionOrdinalPosition, that.subpartitionOrdinalPosition) &&
                Objects.equals(partitionMethod, that.partitionMethod) &&
                Objects.equals(subpartitionMethod, that.subpartitionMethod) &&
                Objects.equals(partitionExpression, that.partitionExpression) &&
                Objects.equals(subpartitionExpression, that.subpartitionExpression) &&
                Objects.equals(partitionDescription, that.partitionDescription) &&
                Objects.equals(tableRows, that.tableRows) &&
                Objects.equals(avgRowLength, that.avgRowLength) &&
                Objects.equals(dataLength, that.dataLength) &&
                Objects.equals(maxDataLength, that.maxDataLength) &&
                Objects.equals(indexLength, that.indexLength) &&
                Objects.equals(dataFree, that.dataFree) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(checkTime, that.checkTime) &&
                Objects.equals(checksum, that.checksum) &&
                Objects.equals(partitionComment, that.partitionComment) &&
                Objects.equals(nodegroup, that.nodegroup) &&
                Objects.equals(tablespaceName, that.tablespaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableCatalog, tableSchema, tableName, partitionName, subpartitionName, partitionOrdinalPosition, subpartitionOrdinalPosition, partitionMethod, subpartitionMethod, partitionExpression, subpartitionExpression, partitionDescription, tableRows, avgRowLength, dataLength, maxDataLength, indexLength, dataFree, createTime, updateTime, checkTime, checksum, partitionComment, nodegroup, tablespaceName);
    }
}
