package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_links", schema = "example_database", catalog = "")
public class CyboxLinks {
    private int id;
    private Timestamp createdAt;
    private String cyboxHash;
    private String cyboxObjectId;
    private String label;
    private String uriObjectId;
    private Timestamp updatedAt;
    private String guid;
    private String portionMarking;
    private Byte readOnly;
    private String labelC;
    private String labelCondition;
    private Byte isCiscp;
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
    @Column(name = "label", nullable = true, length = 255)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "uri_object_id", nullable = true, length = 255)
    public String getUriObjectId() {
        return uriObjectId;
    }

    public void setUriObjectId(String uriObjectId) {
        this.uriObjectId = uriObjectId;
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
    @Column(name = "label_c", nullable = true, length = 255)
    public String getLabelC() {
        return labelC;
    }

    public void setLabelC(String labelC) {
        this.labelC = labelC;
    }

    @Basic
    @Column(name = "label_condition", nullable = true, length = 255)
    public String getLabelCondition() {
        return labelCondition;
    }

    public void setLabelCondition(String labelCondition) {
        this.labelCondition = labelCondition;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyboxLinks that = (CyboxLinks) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(label, that.label) &&
                Objects.equals(uriObjectId, that.uriObjectId) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(labelC, that.labelC) &&
                Objects.equals(labelCondition, that.labelCondition) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, cyboxHash, cyboxObjectId, label, uriObjectId, updatedAt, guid, portionMarking, readOnly, labelC, labelCondition, isCiscp, isMifr, feeds);
    }
}
