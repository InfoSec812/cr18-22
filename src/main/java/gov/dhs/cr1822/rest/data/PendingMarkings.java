package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pending_markings", schema = "example_database", catalog = "")
public class PendingMarkings {
    private int id;
    private String remoteObjectType;
    private String remoteObjectGuid;
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
    @Column(name = "remote_object_type", nullable = true, length = 255)
    public String getRemoteObjectType() {
        return remoteObjectType;
    }

    public void setRemoteObjectType(String remoteObjectType) {
        this.remoteObjectType = remoteObjectType;
    }

    @Basic
    @Column(name = "remote_object_guid", nullable = true, length = 255)
    public String getRemoteObjectGuid() {
        return remoteObjectGuid;
    }

    public void setRemoteObjectGuid(String remoteObjectGuid) {
        this.remoteObjectGuid = remoteObjectGuid;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
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
        PendingMarkings that = (PendingMarkings) o;
        return id == that.id &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(remoteObjectGuid, that.remoteObjectGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, remoteObjectType, remoteObjectGuid, createdAt, updatedAt);
    }
}
