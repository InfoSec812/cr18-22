package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tag_assignments", schema = "example_database", catalog = "")
public class TagAssignments {
    private int id;
    private Timestamp createdAt;
    private String remoteObjectGuid;
    private String remoteObjectType;
    private String justification;
    private Integer tagId;
    private String tagGuid;
    private String userGuid;
    private String guid;
    private String tagType;
    private Byte transferFromLow;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "remote_object_guid", nullable = false, length = 255)
    public String getRemoteObjectGuid() {
        return remoteObjectGuid;
    }

    public void setRemoteObjectGuid(String remoteObjectGuid) {
        this.remoteObjectGuid = remoteObjectGuid;
    }

    @Basic
    @Column(name = "remote_object_type", nullable = false, length = 255)
    public String getRemoteObjectType() {
        return remoteObjectType;
    }

    public void setRemoteObjectType(String remoteObjectType) {
        this.remoteObjectType = remoteObjectType;
    }

    @Basic
    @Column(name = "justification", nullable = true, length = 255)
    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    @Basic
    @Column(name = "tag_id", nullable = true)
    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "tag_guid", nullable = false, length = 255)
    public String getTagGuid() {
        return tagGuid;
    }

    public void setTagGuid(String tagGuid) {
        this.tagGuid = tagGuid;
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
    @Column(name = "tag_type", nullable = true, length = 255)
    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    @Basic
    @Column(name = "transfer_from_low", nullable = true)
    public Byte getTransferFromLow() {
        return transferFromLow;
    }

    public void setTransferFromLow(Byte transferFromLow) {
        this.transferFromLow = transferFromLow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagAssignments that = (TagAssignments) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(remoteObjectGuid, that.remoteObjectGuid) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(justification, that.justification) &&
                Objects.equals(tagId, that.tagId) &&
                Objects.equals(tagGuid, that.tagGuid) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(tagType, that.tagType) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, remoteObjectGuid, remoteObjectType, justification, tagId, tagGuid, userGuid, guid, tagType, transferFromLow);
    }
}
