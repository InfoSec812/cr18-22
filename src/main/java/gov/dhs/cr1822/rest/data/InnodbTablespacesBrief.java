package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "INNODB_TABLESPACES_BRIEF", schema = "information_schema", catalog = "")
public class InnodbTablespacesBrief {
    private byte[] space;
    private String name;
    private String path;
    private byte[] flag;
    private String spaceType;

    @Basic
    @Column(name = "SPACE", nullable = true)
    public byte[] getSpace() {
        return space;
    }

    public void setSpace(byte[] space) {
        this.space = space;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 259)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PATH", nullable = false, length = 512)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "FLAG", nullable = true)
    public byte[] getFlag() {
        return flag;
    }

    public void setFlag(byte[] flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "SPACE_TYPE", nullable = false, length = 7)
    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbTablespacesBrief that = (InnodbTablespacesBrief) o;
        return Arrays.equals(space, that.space) &&
                Objects.equals(name, that.name) &&
                Objects.equals(path, that.path) &&
                Arrays.equals(flag, that.flag) &&
                Objects.equals(spaceType, that.spaceType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, path, spaceType);
        result = 31 * result + Arrays.hashCode(space);
        result = 31 * result + Arrays.hashCode(flag);
        return result;
    }
}
