package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_edges", schema = "mysql", catalog = "")
@IdClass(RoleEdgesPK.class)
public class RoleEdges {
    private String fromHost;
    private String fromUser;
    private String toHost;
    private String toUser;
    private Object withAdminOption;

    @Id
    @Column(name = "FROM_HOST", nullable = false, length = 60)
    public String getFromHost() {
        return fromHost;
    }

    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    @Id
    @Column(name = "FROM_USER", nullable = false, length = 32)
    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    @Id
    @Column(name = "TO_HOST", nullable = false, length = 60)
    public String getToHost() {
        return toHost;
    }

    public void setToHost(String toHost) {
        this.toHost = toHost;
    }

    @Id
    @Column(name = "TO_USER", nullable = false, length = 32)
    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Basic
    @Column(name = "WITH_ADMIN_OPTION", nullable = false)
    public Object getWithAdminOption() {
        return withAdminOption;
    }

    public void setWithAdminOption(Object withAdminOption) {
        this.withAdminOption = withAdminOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEdges roleEdges = (RoleEdges) o;
        return Objects.equals(fromHost, roleEdges.fromHost) &&
                Objects.equals(fromUser, roleEdges.fromUser) &&
                Objects.equals(toHost, roleEdges.toHost) &&
                Objects.equals(toUser, roleEdges.toUser) &&
                Objects.equals(withAdminOption, roleEdges.withAdminOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromHost, fromUser, toHost, toUser, withAdminOption);
    }
}
