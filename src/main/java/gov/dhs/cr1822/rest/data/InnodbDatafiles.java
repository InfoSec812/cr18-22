package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "INNODB_DATAFILES", schema = "information_schema", catalog = "")
public class InnodbDatafiles {
    private byte[] space;
    private String path;

    @Basic
    @Column(name = "SPACE", nullable = true)
    public byte[] getSpace() {
        return space;
    }

    public void setSpace(byte[] space) {
        this.space = space;
    }

    @Basic
    @Column(name = "PATH", nullable = false, length = 512)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbDatafiles that = (InnodbDatafiles) o;
        return Arrays.equals(space, that.space) &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(path);
        result = 31 * result + Arrays.hashCode(space);
        return result;
    }
}
