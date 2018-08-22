package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "password_history", schema = "mysql", catalog = "")
@IdClass(PasswordHistoryPK.class)
public class PasswordHistory {
    private String host;
    private String user;
    private Timestamp passwordTimestamp;
    private String password;

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
    @Column(name = "Password_timestamp", nullable = false)
    public Timestamp getPasswordTimestamp() {
        return passwordTimestamp;
    }

    public void setPasswordTimestamp(Timestamp passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    @Basic
    @Column(name = "Password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordHistory that = (PasswordHistory) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(user, that.user) &&
                Objects.equals(passwordTimestamp, that.passwordTimestamp) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, user, passwordTimestamp, password);
    }
}
