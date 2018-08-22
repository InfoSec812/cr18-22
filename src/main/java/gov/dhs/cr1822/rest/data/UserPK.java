package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UserPK implements Serializable {
    private String host;
    private String user;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPK userPK = (UserPK) o;
        return Objects.equals(host, userPK.host) &&
                Objects.equals(user, userPK.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, user);
    }
}
