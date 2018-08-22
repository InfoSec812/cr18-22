package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_related_objects", schema = "example_database", catalog = "")
public class StixRelatedObjects {
    private int id;
    private String remoteDestObjectType;
    private String remoteDestObjectGuid;
    private String remoteSrcObjectType;
    private String remoteSrcObjectGuid;
    private String stixInformationSourceId;
    private String relationshipType;
    private String guid;
    private String createdByUserGuid;
    private String updatedByUserGuid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
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
    @Column(name = "remote_dest_object_type", nullable = true, length = 255)
    public String getRemoteDestObjectType() {
        return remoteDestObjectType;
    }

    public void setRemoteDestObjectType(String remoteDestObjectType) {
        this.remoteDestObjectType = remoteDestObjectType;
    }

    @Basic
    @Column(name = "remote_dest_object_guid", nullable = true, length = 255)
    public String getRemoteDestObjectGuid() {
        return remoteDestObjectGuid;
    }

    public void setRemoteDestObjectGuid(String remoteDestObjectGuid) {
        this.remoteDestObjectGuid = remoteDestObjectGuid;
    }

    @Basic
    @Column(name = "remote_src_object_type", nullable = true, length = 255)
    public String getRemoteSrcObjectType() {
        return remoteSrcObjectType;
    }

    public void setRemoteSrcObjectType(String remoteSrcObjectType) {
        this.remoteSrcObjectType = remoteSrcObjectType;
    }

    @Basic
    @Column(name = "remote_src_object_guid", nullable = true, length = 255)
    public String getRemoteSrcObjectGuid() {
        return remoteSrcObjectGuid;
    }

    public void setRemoteSrcObjectGuid(String remoteSrcObjectGuid) {
        this.remoteSrcObjectGuid = remoteSrcObjectGuid;
    }

    @Basic
    @Column(name = "stix_information_source_id", nullable = true, length = 255)
    public String getStixInformationSourceId() {
        return stixInformationSourceId;
    }

    public void setStixInformationSourceId(String stixInformationSourceId) {
        this.stixInformationSourceId = stixInformationSourceId;
    }

    @Basic
    @Column(name = "relationship_type", nullable = true, length = 255)
    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
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
    @Column(name = "created_by_user_guid", nullable = true, length = 255)
    public String getCreatedByUserGuid() {
        return createdByUserGuid;
    }

    public void setCreatedByUserGuid(String createdByUserGuid) {
        this.createdByUserGuid = createdByUserGuid;
    }

    @Basic
    @Column(name = "updated_by_user_guid", nullable = true, length = 255)
    public String getUpdatedByUserGuid() {
        return updatedByUserGuid;
    }

    public void setUpdatedByUserGuid(String updatedByUserGuid) {
        this.updatedByUserGuid = updatedByUserGuid;
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
        StixRelatedObjects that = (StixRelatedObjects) o;
        return id == that.id &&
                Objects.equals(remoteDestObjectType, that.remoteDestObjectType) &&
                Objects.equals(remoteDestObjectGuid, that.remoteDestObjectGuid) &&
                Objects.equals(remoteSrcObjectType, that.remoteSrcObjectType) &&
                Objects.equals(remoteSrcObjectGuid, that.remoteSrcObjectGuid) &&
                Objects.equals(stixInformationSourceId, that.stixInformationSourceId) &&
                Objects.equals(relationshipType, that.relationshipType) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdByUserGuid, that.createdByUserGuid) &&
                Objects.equals(updatedByUserGuid, that.updatedByUserGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, remoteDestObjectType, remoteDestObjectGuid, remoteSrcObjectType, remoteSrcObjectGuid, stixInformationSourceId, relationshipType, guid, createdByUserGuid, updatedByUserGuid, createdAt, updatedAt, transferFromLow);
    }
}
