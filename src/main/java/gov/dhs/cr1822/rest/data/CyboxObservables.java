package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_observables", schema = "example_database", catalog = "")
public class CyboxObservables {
    private int id;
    private String compositeOperator;
    private String cyboxObjectId;
    private Byte isComposite;
    private Byte isImported;
    private Byte isNegated;
    private Integer oldParentId;
    private String remoteObjectId;
    private String remoteObjectType;
    private String stixIndicatorId;
    private String userGuid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private Byte readOnly;
    private Byte isCiscp;
    private Byte isMifr;
    private String feeds;
    private String parentId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "composite_operator", nullable = true, length = 255)
    public String getCompositeOperator() {
        return compositeOperator;
    }

    public void setCompositeOperator(String compositeOperator) {
        this.compositeOperator = compositeOperator;
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
    @Column(name = "is_composite", nullable = true)
    public Byte getIsComposite() {
        return isComposite;
    }

    public void setIsComposite(Byte isComposite) {
        this.isComposite = isComposite;
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
    @Column(name = "is_negated", nullable = true)
    public Byte getIsNegated() {
        return isNegated;
    }

    public void setIsNegated(Byte isNegated) {
        this.isNegated = isNegated;
    }

    @Basic
    @Column(name = "old_parent_id", nullable = true)
    public Integer getOldParentId() {
        return oldParentId;
    }

    public void setOldParentId(Integer oldParentId) {
        this.oldParentId = oldParentId;
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
    @Column(name = "stix_indicator_id", nullable = true, length = 255)
    public String getStixIndicatorId() {
        return stixIndicatorId;
    }

    public void setStixIndicatorId(String stixIndicatorId) {
        this.stixIndicatorId = stixIndicatorId;
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
    @Column(name = "is_ciscp", nullable = true)
    public Byte getIsCiscp() {
        return isCiscp;
    }

    public void setIsCiscp(Byte isCiscp) {
        this.isCiscp = isCiscp;
    }

    @Basic
    @Column(name = "is_mifr", nullable = true)
    public Byte getIsMifr() {
        return isMifr;
    }

    public void setIsMifr(Byte isMifr) {
        this.isMifr = isMifr;
    }

    @Basic
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 255)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyboxObservables that = (CyboxObservables) o;
        return id == that.id &&
                Objects.equals(compositeOperator, that.compositeOperator) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(isComposite, that.isComposite) &&
                Objects.equals(isImported, that.isImported) &&
                Objects.equals(isNegated, that.isNegated) &&
                Objects.equals(oldParentId, that.oldParentId) &&
                Objects.equals(remoteObjectId, that.remoteObjectId) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(stixIndicatorId, that.stixIndicatorId) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds) &&
                Objects.equals(parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, compositeOperator, cyboxObjectId, isComposite, isImported, isNegated, oldParentId, remoteObjectId, remoteObjectType, stixIndicatorId, userGuid, createdAt, updatedAt, guid, readOnly, isCiscp, isMifr, feeds, parentId);
    }
}
