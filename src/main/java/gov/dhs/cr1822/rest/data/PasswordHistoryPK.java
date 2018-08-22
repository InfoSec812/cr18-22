package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class PasswordHistoryPK implements Serializable {
    private String host;
    private String user;
    private Timestamp passwordTimestamp;

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

    @Column(name = "Password_timestamp", nullable = false)
    @Id
    public Timestamp getPasswordTimestamp() {
        return passwordTimestamp;
    }

    public void setPasswordTimestamp(Timestamp passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordHistoryPK that = (PasswordHistoryPK) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(user, that.user) &&
                Objects.equals(passwordTimestamp, that.passwordTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, user, passwordTimestamp);
    }
}
