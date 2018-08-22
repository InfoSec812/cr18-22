package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "default_roles", schema = "mysql", catalog = "")
@IdClass(DefaultRolesPK.class)
public class DefaultRoles {
    private String host;
    private String user;
    private String defaultRoleHost;
    private String defaultRoleUser;

    @Id
    @Column(name = "HOST", nullable = false, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Id
    @Column(name = "USER", nullable = false, length = 32)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Id
    @Column(name = "DEFAULT_ROLE_HOST", nullable = false, length = 60)
    public String getDefaultRoleHost() {
        return defaultRoleHost;
    }

    public void setDefaultRoleHost(String defaultRoleHost) {
        this.defaultRoleHost = defaultRoleHost;
    }

    @Id
    @Column(name = "DEFAULT_ROLE_USER", nullable = false, length = 32)
    public String getDefaultRoleUser() {
        return defaultRoleUser;
    }

    public void setDefaultRoleUser(String defaultRoleUser) {
        this.defaultRoleUser = defaultRoleUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefaultRoles that = (DefaultRoles) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(user, that.user) &&
                Objects.equals(defaultRoleHost, that.defaultRoleHost) &&
                Objects.equals(defaultRoleUser, that.defaultRoleUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, user, defaultRoleHost, defaultRoleUser);
    }
}
