package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_CMP", schema = "information_schema", catalog = "")
public class InnodbCmp {
    private int pageSize;
    private int compressOps;
    private int compressOpsOk;
    private int compressTime;
    private int uncompressOps;
    private int uncompressTime;

    @Basic
    @Column(name = "page_size", nullable = false)
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
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
        InnodbCmp innodbCmp = (InnodbCmp) o;
        return pageSize == innodbCmp.pageSize &&
                compressOps == innodbCmp.compressOps &&
                compressOpsOk == innodbCmp.compressOpsOk &&
                compressTime == innodbCmp.compressTime &&
                uncompressOps == innodbCmp.uncompressOps &&
                uncompressTime == innodbCmp.uncompressTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageSize, compressOps, compressOpsOk, compressTime, uncompressOps, uncompressTime);
    }
}
