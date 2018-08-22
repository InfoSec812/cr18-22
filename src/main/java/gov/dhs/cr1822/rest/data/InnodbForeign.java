package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_FOREIGN", schema = "information_schema", catalog = "")
public class InnodbForeign {
    private String id;
    private String forName;
    private String refName;
    private long nCols;
    private int type;

    @Basic
    @Column(name = "ID", nullable = true, length = 129)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FOR_NAME", nullable = true, length = 129)
    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    @Basic
    @Column(name = "REF_NAME", nullable = true, length = 129)
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    @Basic
    @Column(name = "N_COLS", nullable = false)
    public long getnCols() {
        return nCols;
    }

    public void setnCols(long nCols) {
        this.nCols = nCols;
    }

    @Basic
    @Column(name = "TYPE", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbForeign that = (InnodbForeign) o;
        return nCols == that.nCols &&
                type == that.type &&
                Objects.equals(id, that.id) &&
                Objects.equals(forName, that.forName) &&
                Objects.equals(refName, that.refName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, forName, refName, nCols, type);
    }
}
