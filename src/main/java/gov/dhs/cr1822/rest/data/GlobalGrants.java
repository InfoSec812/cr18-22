package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "global_grants", schema = "mysql", catalog = "")
@IdClass(GlobalGrantsPK.class)
public class GlobalGrants {
    private String user;
    private String host;
    private String priv;
    private Object withGrantOption;

    @Id
    @Column(name = "USER", nullable = false, length = 32)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Id
    @Column(name = "HOST", nullable = false, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Id
    @Column(name = "PRIV", nullable = false, length = 32)
    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    @Basic
    @Column(name = "WITH_GRANT_OPTION", nullable = false)
    public Object getWithGrantOption() {
        return withGrantOption;
    }

    public void setWithGrantOption(Object withGrantOption) {
        this.withGrantOption = withGrantOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalGrants that = (GlobalGrants) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(host, that.host) &&
                Objects.equals(priv, that.priv) &&
                Objects.equals(withGrantOption, that.withGrantOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, host, priv, withGrantOption);
    }
}
