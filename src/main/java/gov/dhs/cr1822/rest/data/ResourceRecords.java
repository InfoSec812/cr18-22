package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "resource_records", schema = "example_database", catalog = "")
public class ResourceRecords {
    private int id;
    private String guid;
    private String cyboxHash;
    private String portionMarking;
    private String recordType;
    private String dnsRecordCache;
    private Byte isReference;
    private Byte readOnly;
    private Timestamp createdAt;
    private Timestamp updatedAt;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
    }

    @Basic
    @Column(name = "record_type", nullable = true, length = 255)
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Basic
    @Column(name = "dns_record_cache", nullable = true, length = 255)
    public String getDnsRecordCache() {
        return dnsRecordCache;
    }

    public void setDnsRecordCache(String dnsRecordCache) {
        this.dnsRecordCache = dnsRecordCache;
    }

    @Basic
    @Column(name = "is_reference", nullable = true)
    public Byte getIsReference() {
        return isReference;
    }

    public void setIsReference(Byte isReference) {
        this.isReference = isReference;
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
        ResourceRecords that = (ResourceRecords) o;
        return id == that.id &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(dnsRecordCache, that.dnsRecordCache) &&
                Objects.equals(isReference, that.isReference) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guid, cyboxHash, portionMarking, recordType, dnsRecordCache, isReference, readOnly, createdAt, updatedAt, isCiscp, isMifr, feeds);
    }
}
