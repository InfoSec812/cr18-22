package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_sessions", schema = "example_database", catalog = "")
public class UserSessions {
    private int id;
    private String username;
    private String sessionId;
    private Timestamp sessionUpdatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "session_id", nullable = true, length = 255)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "session_updated_at", nullable = true)
    public Timestamp getSessionUpdatedAt() {
        return sessionUpdatedAt;
    }

    public void setSessionUpdatedAt(Timestamp sessionUpdatedAt) {
        this.sessionUpdatedAt = sessionUpdatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSessions that = (UserSessions) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(sessionId, that.sessionId) &&
                Objects.equals(sessionUpdatedAt, that.sessionUpdatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, sessionId, sessionUpdatedAt);
    }
}
