package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_TABLESPACES", schema = "information_schema", catalog = "")
public class InnodbTablespaces {
    private int space;
    private String name;
    private int flag;
    private String rowFormat;
    private int pageSize;
    private int zipPageSize;
    private String spaceType;
    private int fsBlockSize;
    private long fileSize;
    private long allocatedSize;
    private String serverVersion;
    private int spaceVersion;

    @Basic
    @Column(name = "SPACE", nullable = false)
    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 655)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "FLAG", nullable = false)
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "ROW_FORMAT", nullable = true, length = 22)
    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Basic
    @Column(name = "PAGE_SIZE", nullable = false)
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Basic
    @Column(name = "ZIP_PAGE_SIZE", nullable = false)
    public int getZipPageSize() {
        return zipPageSize;
    }

    public void setZipPageSize(int zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    @Basic
    @Column(name = "SPACE_TYPE", nullable = true, length = 10)
    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Basic
    @Column(name = "FS_BLOCK_SIZE", nullable = false)
    public int getFsBlockSize() {
        return fsBlockSize;
    }

    public void setFsBlockSize(int fsBlockSize) {
        this.fsBlockSize = fsBlockSize;
    }

    @Basic
    @Column(name = "FILE_SIZE", nullable = false)
    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    @Basic
    @Column(name = "ALLOCATED_SIZE", nullable = false)
    public long getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(long allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    @Basic
    @Column(name = "SERVER_VERSION", nullable = true, length = 10)
    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    @Basic
    @Column(name = "SPACE_VERSION", nullable = false)
    public int getSpaceVersion() {
        return spaceVersion;
    }

    public void setSpaceVersion(int spaceVersion) {
        this.spaceVersion = spaceVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbTablespaces that = (InnodbTablespaces) o;
        return space == that.space &&
                flag == that.flag &&
                pageSize == that.pageSize &&
                zipPageSize == that.zipPageSize &&
                fsBlockSize == that.fsBlockSize &&
                fileSize == that.fileSize &&
                allocatedSize == that.allocatedSize &&
                spaceVersion == that.spaceVersion &&
                Objects.equals(name, that.name) &&
                Objects.equals(rowFormat, that.rowFormat) &&
                Objects.equals(spaceType, that.spaceType) &&
                Objects.equals(serverVersion, that.serverVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(space, name, flag, rowFormat, pageSize, zipPageSize, spaceType, fsBlockSize, fileSize, allocatedSize, serverVersion, spaceVersion);
    }
}
