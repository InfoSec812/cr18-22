package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RoleEdgesPK implements Serializable {
    private String fromHost;
    private String fromUser;
    private String toHost;
    private String toUser;

    @Column(name = "FROM_HOST", nullable = false, length = 60)
    @Id
    public String getFromHost() {
        return fromHost;
    }

    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    @Column(name = "FROM_USER", nullable = false, length = 32)
    @Id
    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    @Column(name = "TO_HOST", nullable = false, length = 60)
    @Id
    public String getToHost() {
        return toHost;
    }

    public void setToHost(String toHost) {
        this.toHost = toHost;
    }

    @Column(name = "TO_USER", nullable = false, length = 32)
    @Id
    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEdgesPK that = (RoleEdgesPK) o;
        return Objects.equals(fromHost, that.fromHost) &&
                Objects.equals(fromUser, that.fromUser) &&
                Objects.equals(toHost, that.toHost) &&
                Objects.equals(toUser, that.toUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromHost, fromUser, toHost, toUser);
    }
}
