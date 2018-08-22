package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_TABLES", schema = "information_schema", catalog = "")
public class InnodbTables {
    private long tableId;
    private String name;
    private int flag;
    private int nCols;
    private long space;
    private String rowFormat;
    private int zipPageSize;
    private String spaceType;
    private int instantCols;

    @Basic
    @Column(name = "TABLE_ID", nullable = false)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
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
    @Column(name = "N_COLS", nullable = false)
    public int getnCols() {
        return nCols;
    }

    public void setnCols(int nCols) {
        this.nCols = nCols;
    }

    @Basic
    @Column(name = "SPACE", nullable = false)
    public long getSpace() {
        return space;
    }

    public void setSpace(long space) {
        this.space = space;
    }

    @Basic
    @Column(name = "ROW_FORMAT", nullable = true, length = 12)
    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
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
    @Column(name = "INSTANT_COLS", nullable = false)
    public int getInstantCols() {
        return instantCols;
    }

    public void setInstantCols(int instantCols) {
        this.instantCols = instantCols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbTables that = (InnodbTables) o;
        return tableId == that.tableId &&
                flag == that.flag &&
                nCols == that.nCols &&
                space == that.space &&
                zipPageSize == that.zipPageSize &&
                instantCols == that.instantCols &&
                Objects.equals(name, that.name) &&
                Objects.equals(rowFormat, that.rowFormat) &&
                Objects.equals(spaceType, that.spaceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, name, flag, nCols, space, rowFormat, zipPageSize, spaceType, instantCols);
    }
}
