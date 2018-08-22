package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Passwords {
    private int id;
    private String passwordHash;
    private String passwordSalt;
    private Byte requiresChange;
    private String userGuid;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password_hash", nullable = true, length = 255)
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Basic
    @Column(name = "password_salt", nullable = true, length = 255)
    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    @Basic
    @Column(name = "requires_change", nullable = true)
    public Byte getRequiresChange() {
        return requiresChange;
    }

    public void setRequiresChange(Byte requiresChange) {
        this.requiresChange = requiresChange;
    }

    @Basic
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passwords passwords = (Passwords) o;
        return id == passwords.id &&
                Objects.equals(passwordHash, passwords.passwordHash) &&
                Objects.equals(passwordSalt, passwords.passwordSalt) &&
                Objects.equals(requiresChange, passwords.requiresChange) &&
                Objects.equals(userGuid, passwords.userGuid) &&
                Objects.equals(createdAt, passwords.createdAt) &&
                Objects.equals(updatedAt, passwords.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passwordHash, passwordSalt, requiresChange, userGuid, createdAt, updatedAt);
    }
}
