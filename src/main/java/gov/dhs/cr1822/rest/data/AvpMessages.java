package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "avp_messages", schema = "example_database", catalog = "")
public class AvpMessages {
    private int id;
    private String prohibited;
    private String avpErrors;
    private String guid;
    private Byte avpValid;
    private Timestamp timestamp;
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
    @Column(name = "prohibited", nullable = true, length = -1)
    public String getProhibited() {
        return prohibited;
    }

    public void setProhibited(String prohibited) {
        this.prohibited = prohibited;
    }

    @Basic
    @Column(name = "avp_errors", nullable = true, length = -1)
    public String getAvpErrors() {
        return avpErrors;
    }

    public void setAvpErrors(String avpErrors) {
        this.avpErrors = avpErrors;
    }

    @Basic
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "avp_valid", nullable = true)
    public Byte getAvpValid() {
        return avpValid;
    }

    public void setAvpValid(Byte avpValid) {
        this.avpValid = avpValid;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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
        AvpMessages that = (AvpMessages) o;
        return id == that.id &&
                Objects.equals(prohibited, that.prohibited) &&
                Objects.equals(avpErrors, that.avpErrors) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(avpValid, that.avpValid) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prohibited, avpErrors, guid, avpValid, timestamp, createdAt, updatedAt);
    }
}
