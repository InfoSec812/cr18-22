package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Func {
    private String name;
    private byte ret;
    private String dl;
    private Object type;

    @Id
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ret", nullable = false)
    public byte getRet() {
        return ret;
    }

    public void setRet(byte ret) {
        this.ret = ret;
    }

    @Basic
    @Column(name = "dl", nullable = false, length = 128)
    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Func func = (Func) o;
        return ret == func.ret &&
                Objects.equals(name, func.name) &&
                Objects.equals(dl, func.dl) &&
                Objects.equals(type, func.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ret, dl, type);
    }
}
