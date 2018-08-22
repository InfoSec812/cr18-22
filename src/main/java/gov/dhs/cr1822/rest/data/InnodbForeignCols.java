package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_FOREIGN_COLS", schema = "information_schema", catalog = "")
public class InnodbForeignCols {
    private String id;
    private String forColName;
    private String refColName;
    private int pos;

    @Basic
    @Column(name = "ID", nullable = true, length = 129)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FOR_COL_NAME", nullable = false, length = 64)
    public String getForColName() {
        return forColName;
    }

    public void setForColName(String forColName) {
        this.forColName = forColName;
    }

    @Basic
    @Column(name = "REF_COL_NAME", nullable = false, length = 64)
    public String getRefColName() {
        return refColName;
    }

    public void setRefColName(String refColName) {
        this.refColName = refColName;
    }

    @Basic
    @Column(name = "POS", nullable = false)
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbForeignCols that = (InnodbForeignCols) o;
        return pos == that.pos &&
                Objects.equals(id, that.id) &&
                Objects.equals(forColName, that.forColName) &&
                Objects.equals(refColName, that.refColName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, forColName, refColName, pos);
    }
}
