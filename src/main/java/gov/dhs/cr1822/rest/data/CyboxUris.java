package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_uris", schema = "example_database", catalog = "")
public class CyboxUris {
    private int id;
    private Timestamp createdAt;
    private String cyboxHash;
    private String cyboxObjectId;
    private String oldLabel;
    private Timestamp updatedAt;
    private String uriType;
    private String guid;
    private String portionMarking;
    private Byte readOnly;
    private String uriNormalized;
    private String uriRaw;
    private String uriNormalizedSha256;
    private String uriCondition;
    private Byte isCiscp;
    private String uriShort;
    private Byte isMifr;
    private String feeds;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "cybox_hash", nullable = true, length = 255)
    public String getCyboxHash() {
        return cyboxHash;
    }

    public void setCyboxHash(String cyboxHash) {
        this.cyboxHash = cyboxHash;
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
    @Column(name = "old_label", nullable = true, length = 255)
    public String getOldLabel() {
        return oldLabel;
    }

    public void setOldLabel(String oldLabel) {
        this.oldLabel = oldLabel;
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
    @Column(name = "uri_type", nullable = true, length = 255)
    public String getUriType() {
        return uriType;
    }

    public void setUriType(String uriType) {
        this.uriType = uriType;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
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
    @Column(name = "uri_normalized", nullable = true, length = -1)
    public String getUriNormalized() {
        return uriNormalized;
    }

    public void setUriNormalized(String uriNormalized) {
        this.uriNormalized = uriNormalized;
    }

    @Basic
    @Column(name = "uri_raw", nullable = true, length = -1)
    public String getUriRaw() {
        return uriRaw;
    }

    public void setUriRaw(String uriRaw) {
        this.uriRaw = uriRaw;
    }

    @Basic
    @Column(name = "uri_normalized_sha256", nullable = true, length = 255)
    public String getUriNormalizedSha256() {
        return uriNormalizedSha256;
    }

    public void setUriNormalizedSha256(String uriNormalizedSha256) {
        this.uriNormalizedSha256 = uriNormalizedSha256;
    }

    @Basic
    @Column(name = "uri_condition", nullable = true, length = 255)
    public String getUriCondition() {
        return uriCondition;
    }

    public void setUriCondition(String uriCondition) {
        this.uriCondition = uriCondition;
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
    @Column(name = "uri_short", nullable = true, length = 255)
    public String getUriShort() {
        return uriShort;
    }

    public void setUriShort(String uriShort) {
        this.uriShort = uriShort;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyboxUris cyboxUris = (CyboxUris) o;
        return id == cyboxUris.id &&
                Objects.equals(createdAt, cyboxUris.createdAt) &&
                Objects.equals(cyboxHash, cyboxUris.cyboxHash) &&
                Objects.equals(cyboxObjectId, cyboxUris.cyboxObjectId) &&
                Objects.equals(oldLabel, cyboxUris.oldLabel) &&
                Objects.equals(updatedAt, cyboxUris.updatedAt) &&
                Objects.equals(uriType, cyboxUris.uriType) &&
                Objects.equals(guid, cyboxUris.guid) &&
                Objects.equals(portionMarking, cyboxUris.portionMarking) &&
                Objects.equals(readOnly, cyboxUris.readOnly) &&
                Objects.equals(uriNormalized, cyboxUris.uriNormalized) &&
                Objects.equals(uriRaw, cyboxUris.uriRaw) &&
                Objects.equals(uriNormalizedSha256, cyboxUris.uriNormalizedSha256) &&
                Objects.equals(uriCondition, cyboxUris.uriCondition) &&
                Objects.equals(isCiscp, cyboxUris.isCiscp) &&
                Objects.equals(uriShort, cyboxUris.uriShort) &&
                Objects.equals(isMifr, cyboxUris.isMifr) &&
                Objects.equals(feeds, cyboxUris.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, cyboxHash, cyboxObjectId, oldLabel, updatedAt, uriType, guid, portionMarking, readOnly, uriNormalized, uriRaw, uriNormalizedSha256, uriCondition, isCiscp, uriShort, isMifr, feeds);
    }
}
