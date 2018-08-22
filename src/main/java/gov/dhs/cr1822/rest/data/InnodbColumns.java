package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_COLUMNS", schema = "information_schema", catalog = "")
public class InnodbColumns {
    private long tableId;
    private String name;
    private long pos;
    private int mtype;
    private int prtype;
    private int len;
    private int hasDefault;
    private String defaultValue;

    @Basic
    @Column(name = "TABLE_ID", nullable = false)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
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
    @Column(name = "POS", nullable = false)
    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    @Basic
    @Column(name = "MTYPE", nullable = false)
    public int getMtype() {
        return mtype;
    }

    public void setMtype(int mtype) {
        this.mtype = mtype;
    }

    @Basic
    @Column(name = "PRTYPE", nullable = false)
    public int getPrtype() {
        return prtype;
    }

    public void setPrtype(int prtype) {
        this.prtype = prtype;
    }

    @Basic
    @Column(name = "LEN", nullable = false)
    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Basic
    @Column(name = "HAS_DEFAULT", nullable = false)
    public int getHasDefault() {
        return hasDefault;
    }

    public void setHasDefault(int hasDefault) {
        this.hasDefault = hasDefault;
    }

    @Basic
    @Column(name = "DEFAULT_VALUE", nullable = true, length = -1)
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbColumns that = (InnodbColumns) o;
        return tableId == that.tableId &&
                pos == that.pos &&
                mtype == that.mtype &&
                prtype == that.prtype &&
                len == that.len &&
                hasDefault == that.hasDefault &&
                Objects.equals(name, that.name) &&
                Objects.equals(defaultValue, that.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, name, pos, mtype, prtype, len, hasDefault, defaultValue);
    }
}
