package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class R5Tracking {
    private int id;
    private String table;
    private Integer oldId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "table", nullable = true, length = 255)
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Basic
    @Column(name = "old_id", nullable = true)
    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        R5Tracking that = (R5Tracking) o;
        return id == that.id &&
                Objects.equals(table, that.table) &&
                Objects.equals(oldId, that.oldId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, table, oldId);
    }
}
