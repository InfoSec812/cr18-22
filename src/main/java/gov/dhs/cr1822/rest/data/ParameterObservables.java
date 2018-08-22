package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "parameter_observables", schema = "example_database", catalog = "")
public class ParameterObservables {
    private int id;
    private String cyboxObjectId;
    private Byte isImported;
    private String remoteObjectId;
    private String remoteObjectType;
    private String stixCourseOfActionId;
    private String userGuid;
    private String guid;
    private Byte readOnly;
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
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "is_imported", nullable = true)
    public Byte getIsImported() {
        return isImported;
    }

    public void setIsImported(Byte isImported) {
        this.isImported = isImported;
    }

    @Basic
    @Column(name = "remote_object_id", nullable = true, length = 255)
    public String getRemoteObjectId() {
        return remoteObjectId;
    }

    public void setRemoteObjectId(String remoteObjectId) {
        this.remoteObjectId = remoteObjectId;
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
    @Column(name = "stix_course_of_action_id", nullable = true, length = 255)
    public String getStixCourseOfActionId() {
        return stixCourseOfActionId;
    }

    public void setStixCourseOfActionId(String stixCourseOfActionId) {
        this.stixCourseOfActionId = stixCourseOfActionId;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "read_only", nullable = true)
    public Byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Byte readOnly) {
        this.readOnly = readOnly;
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
        ParameterObservables that = (ParameterObservables) o;
        return id == that.id &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(isImported, that.isImported) &&
                Objects.equals(remoteObjectId, that.remoteObjectId) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(stixCourseOfActionId, that.stixCourseOfActionId) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxObjectId, isImported, remoteObjectId, remoteObjectType, stixCourseOfActionId, userGuid, guid, readOnly, createdAt, updatedAt);
    }
}
