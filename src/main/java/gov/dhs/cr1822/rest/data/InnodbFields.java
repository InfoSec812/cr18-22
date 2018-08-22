package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "INNODB_FIELDS", schema = "information_schema", catalog = "")
public class InnodbFields {
    private byte[] indexId;
    private String name;
    private long pos;

    @Basic
    @Column(name = "INDEX_ID", nullable = true)
    public byte[] getIndexId() {
        return indexId;
    }

    public void setIndexId(byte[] indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 64)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbFields that = (InnodbFields) o;
        return pos == that.pos &&
                Arrays.equals(indexId, that.indexId) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, pos);
        result = 31 * result + Arrays.hashCode(indexId);
        return result;
    }
}
