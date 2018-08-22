package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DefaultRolesPK implements Serializable {
    private String host;
    private String user;
    private String defaultRoleHost;
    private String defaultRoleUser;

    @Column(name = "HOST", nullable = false, length = 60)
    @Id
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Column(name = "USER", nullable = false, length = 32)
    @Id
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Column(name = "DEFAULT_ROLE_HOST", nullable = false, length = 60)
    @Id
    public String getDefaultRoleHost() {
        return defaultRoleHost;
    }

    public void setDefaultRoleHost(String defaultRoleHost) {
        this.defaultRoleHost = defaultRoleHost;
    }

    @Column(name = "DEFAULT_ROLE_USER", nullable = false, length = 32)
    @Id
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
        DefaultRolesPK that = (DefaultRolesPK) o;
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
