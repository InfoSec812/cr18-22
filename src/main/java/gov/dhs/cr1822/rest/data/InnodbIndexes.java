package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_INDEXES", schema = "information_schema", catalog = "")
public class InnodbIndexes {
    private long indexId;
    private String name;
    private long tableId;
    private int type;
    private int nFields;
    private int pageNo;
    private int space;
    private int mergeThreshold;

    @Basic
    @Column(name = "INDEX_ID", nullable = false)
    public long getIndexId() {
        return indexId;
    }

    public void setIndexId(long indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 193)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "TABLE_ID", nullable = false)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "TYPE", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "N_FIELDS", nullable = false)
    public int getnFields() {
        return nFields;
    }

    public void setnFields(int nFields) {
        this.nFields = nFields;
    }

    @Basic
    @Column(name = "PAGE_NO", nullable = false)
    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Basic
    @Column(name = "SPACE", nullable = false)
    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Basic
    @Column(name = "MERGE_THRESHOLD", nullable = false)
    public int getMergeThreshold() {
        return mergeThreshold;
    }

    public void setMergeThreshold(int mergeThreshold) {
        this.mergeThreshold = mergeThreshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbIndexes that = (InnodbIndexes) o;
        return indexId == that.indexId &&
                tableId == that.tableId &&
                type == that.type &&
                nFields == that.nFields &&
                pageNo == that.pageNo &&
                space == that.space &&
                mergeThreshold == that.mergeThreshold &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexId, name, tableId, type, nFields, pageNo, space, mergeThreshold);
    }
}
