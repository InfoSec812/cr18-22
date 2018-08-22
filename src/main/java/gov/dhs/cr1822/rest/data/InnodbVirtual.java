package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_VIRTUAL", schema = "information_schema", catalog = "")
public class InnodbVirtual {
    private long tableId;
    private int pos;
    private int basePos;

    @Basic
    @Column(name = "TABLE_ID", nullable = false)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "POS", nullable = false)
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Basic
    @Column(name = "BASE_POS", nullable = false)
    public int getBasePos() {
        return basePos;
    }

    public void setBasePos(int basePos) {
        this.basePos = basePos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbVirtual that = (InnodbVirtual) o;
        return tableId == that.tableId &&
                pos == that.pos &&
                basePos == that.basePos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, pos, basePos);
    }
}
