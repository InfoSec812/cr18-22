package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Tablespaces {
    private String tablespaceName;
    private String engine;
    private String tablespaceType;
    private String logfileGroupName;
    private Long extentSize;
    private Long autoextendSize;
    private Long maximumSize;
    private Long nodegroupId;
    private String tablespaceComment;

    @Basic
    @Column(name = "TABLESPACE_NAME", nullable = false, length = 64)
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
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
    @Column(name = "TABLESPACE_TYPE", nullable = true, length = 64)
    public String getTablespaceType() {
        return tablespaceType;
    }

    public void setTablespaceType(String tablespaceType) {
        this.tablespaceType = tablespaceType;
    }

    @Basic
    @Column(name = "LOGFILE_GROUP_NAME", nullable = true, length = 64)
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
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
    @Column(name = "AUTOEXTEND_SIZE", nullable = true)
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
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
    @Column(name = "NODEGROUP_ID", nullable = true)
    public Long getNodegroupId() {
        return nodegroupId;
    }

    public void setNodegroupId(Long nodegroupId) {
        this.nodegroupId = nodegroupId;
    }

    @Basic
    @Column(name = "TABLESPACE_COMMENT", nullable = true, length = 2048)
    public String getTablespaceComment() {
        return tablespaceComment;
    }

    public void setTablespaceComment(String tablespaceComment) {
        this.tablespaceComment = tablespaceComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tablespaces that = (Tablespaces) o;
        return Objects.equals(tablespaceName, that.tablespaceName) &&
                Objects.equals(engine, that.engine) &&
                Objects.equals(tablespaceType, that.tablespaceType) &&
                Objects.equals(logfileGroupName, that.logfileGroupName) &&
                Objects.equals(extentSize, that.extentSize) &&
                Objects.equals(autoextendSize, that.autoextendSize) &&
                Objects.equals(maximumSize, that.maximumSize) &&
                Objects.equals(nodegroupId, that.nodegroupId) &&
                Objects.equals(tablespaceComment, that.tablespaceComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tablespaceName, engine, tablespaceType, logfileGroupName, extentSize, autoextendSize, maximumSize, nodegroupId, tablespaceComment);
    }
}
