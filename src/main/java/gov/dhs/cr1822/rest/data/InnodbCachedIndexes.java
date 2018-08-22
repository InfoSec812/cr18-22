package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_CACHED_INDEXES", schema = "information_schema", catalog = "")
public class InnodbCachedIndexes {
    private int spaceId;
    private long indexId;
    private long nCachedPages;

    @Basic
    @Column(name = "SPACE_ID", nullable = false)
    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    @Basic
    @Column(name = "INDEX_ID", nullable = false)
    public long getIndexId() {
        return indexId;
    }

    public void setIndexId(long indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "N_CACHED_PAGES", nullable = false)
    public long getnCachedPages() {
        return nCachedPages;
    }

    public void setnCachedPages(long nCachedPages) {
        this.nCachedPages = nCachedPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbCachedIndexes that = (InnodbCachedIndexes) o;
        return spaceId == that.spaceId &&
                indexId == that.indexId &&
                nCachedPages == that.nCachedPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaceId, indexId, nCachedPages);
    }
}
