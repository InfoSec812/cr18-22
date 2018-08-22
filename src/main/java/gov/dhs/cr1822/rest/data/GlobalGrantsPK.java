package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GlobalGrantsPK implements Serializable {
    private String user;
    private String host;
    private String priv;

    @Column(name = "USER", nullable = false, length = 32)
    @Id
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Column(name = "HOST", nullable = false, length = 60)
    @Id
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Column(name = "PRIV", nullable = false, length = 32)
    @Id
    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalGrantsPK that = (GlobalGrantsPK) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(host, that.host) &&
                Objects.equals(priv, that.priv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, host, priv);
    }
}
