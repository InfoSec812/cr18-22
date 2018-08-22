package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class R5Destinations {
    private int id;
    private String r5Table;
    private Integer r5Id;
    private String r6Table;
    private Integer r6Id;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "r5table", nullable = true, length = 255)
    public String getR5Table() {
        return r5Table;
    }

    public void setR5Table(String r5Table) {
        this.r5Table = r5Table;
    }

    @Basic
    @Column(name = "r5id", nullable = true)
    public Integer getR5Id() {
        return r5Id;
    }

    public void setR5Id(Integer r5Id) {
        this.r5Id = r5Id;
    }

    @Basic
    @Column(name = "r6table", nullable = true, length = 255)
    public String getR6Table() {
        return r6Table;
    }

    public void setR6Table(String r6Table) {
        this.r6Table = r6Table;
    }

    @Basic
    @Column(name = "r6id", nullable = true)
    public Integer getR6Id() {
        return r6Id;
    }

    public void setR6Id(Integer r6Id) {
        this.r6Id = r6Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        R5Destinations that = (R5Destinations) o;
        return id == that.id &&
                Objects.equals(r5Table, that.r5Table) &&
                Objects.equals(r5Id, that.r5Id) &&
                Objects.equals(r6Table, that.r6Table) &&
                Objects.equals(r6Id, that.r6Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, r5Table, r5Id, r6Table, r6Id);
    }
}
