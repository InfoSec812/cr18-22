package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "proxies_priv", schema = "mysql", catalog = "")
@IdClass(ProxiesPrivPK.class)
public class ProxiesPriv {
    private String host;
    private String user;
    private String proxiedHost;
    private String proxiedUser;
    private byte withGrant;
    private String grantor;
    private Timestamp timestamp;

    @Id
    @Column(name = "Host", nullable = false, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Id
    @Column(name = "User", nullable = false, length = 32)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Id
    @Column(name = "Proxied_host", nullable = false, length = 60)
    public String getProxiedHost() {
        return proxiedHost;
    }

    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost;
    }

    @Id
    @Column(name = "Proxied_user", nullable = false, length = 32)
    public String getProxiedUser() {
        return proxiedUser;
    }

    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser;
    }

    @Basic
    @Column(name = "With_grant", nullable = false)
    public byte getWithGrant() {
        return withGrant;
    }

    public void setWithGrant(byte withGrant) {
        this.withGrant = withGrant;
    }

    @Basic
    @Column(name = "Grantor", nullable = false, length = 93)
    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    @Basic
    @Column(name = "Timestamp", nullable = false)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxiesPriv that = (ProxiesPriv) o;
        return withGrant == that.withGrant &&
                Objects.equals(host, that.host) &&
                Objects.equals(user, that.user) &&
                Objects.equals(proxiedHost, that.proxiedHost) &&
                Objects.equals(proxiedUser, that.proxiedUser) &&
                Objects.equals(grantor, that.grantor) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, user, proxiedHost, proxiedUser, withGrant, grantor, timestamp);
    }
}
