package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_CMPMEM", schema = "information_schema", catalog = "")
public class InnodbCmpmem {
    private int pageSize;
    private int bufferPoolInstance;
    private int pagesUsed;
    private int pagesFree;
    private long relocationOps;
    private int relocationTime;

    @Basic
    @Column(name = "page_size", nullable = false)
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Basic
    @Column(name = "buffer_pool_instance", nullable = false)
    public int getBufferPoolInstance() {
        return bufferPoolInstance;
    }

    public void setBufferPoolInstance(int bufferPoolInstance) {
        this.bufferPoolInstance = bufferPoolInstance;
    }

    @Basic
    @Column(name = "pages_used", nullable = false)
    public int getPagesUsed() {
        return pagesUsed;
    }

    public void setPagesUsed(int pagesUsed) {
        this.pagesUsed = pagesUsed;
    }

    @Basic
    @Column(name = "pages_free", nullable = false)
    public int getPagesFree() {
        return pagesFree;
    }

    public void setPagesFree(int pagesFree) {
        this.pagesFree = pagesFree;
    }

    @Basic
    @Column(name = "relocation_ops", nullable = false)
    public long getRelocationOps() {
        return relocationOps;
    }

    public void setRelocationOps(long relocationOps) {
        this.relocationOps = relocationOps;
    }

    @Basic
    @Column(name = "relocation_time", nullable = false)
    public int getRelocationTime() {
        return relocationTime;
    }

    public void setRelocationTime(int relocationTime) {
        this.relocationTime = relocationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbCmpmem that = (InnodbCmpmem) o;
        return pageSize == that.pageSize &&
                bufferPoolInstance == that.bufferPoolInstance &&
                pagesUsed == that.pagesUsed &&
                pagesFree == that.pagesFree &&
                relocationOps == that.relocationOps &&
                relocationTime == that.relocationTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageSize, bufferPoolInstance, pagesUsed, pagesFree, relocationOps, relocationTime);
    }
}
