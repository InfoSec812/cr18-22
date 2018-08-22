package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProxiesPrivPK implements Serializable {
    private String host;
    private String user;
    private String proxiedHost;
    private String proxiedUser;

    @Column(name = "Host", nullable = false, length = 60)
    @Id
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Column(name = "User", nullable = false, length = 32)
    @Id
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Column(name = "Proxied_host", nullable = false, length = 60)
    @Id
    public String getProxiedHost() {
        return proxiedHost;
    }

    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost;
    }

    @Column(name = "Proxied_user", nullable = false, length = 32)
    @Id
    public String getProxiedUser() {
        return proxiedUser;
    }

    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxiesPrivPK that = (ProxiesPrivPK) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(user, that.user) &&
                Objects.equals(proxiedHost, that.proxiedHost) &&
                Objects.equals(proxiedUser, that.proxiedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, user, proxiedHost, proxiedUser);
    }
}
