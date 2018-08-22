package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_socket_addresses", schema = "example_database", catalog = "")
public class CyboxSocketAddresses {
    private int id;
    private String cyboxHash;
    private String cyboxObjectId;
    private String addressesNormalizedCache;
    private String hostnamesNormalizedCache;
    private String portsNormalizedCache;
    private String nameCondition;
    private String applyCondition;
    private String guid;
    private String portionMarking;
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
    @Column(name = "addresses_normalized_cache", nullable = true, length = 255)
    public String getAddressesNormalizedCache() {
        return addressesNormalizedCache;
    }

    public void setAddressesNormalizedCache(String addressesNormalizedCache) {
        this.addressesNormalizedCache = addressesNormalizedCache;
    }

    @Basic
    @Column(name = "hostnames_normalized_cache", nullable = true, length = 255)
    public String getHostnamesNormalizedCache() {
        return hostnamesNormalizedCache;
    }

    public void setHostnamesNormalizedCache(String hostnamesNormalizedCache) {
        this.hostnamesNormalizedCache = hostnamesNormalizedCache;
    }

    @Basic
    @Column(name = "ports_normalized_cache", nullable = true, length = 255)
    public String getPortsNormalizedCache() {
        return portsNormalizedCache;
    }

    public void setPortsNormalizedCache(String portsNormalizedCache) {
        this.portsNormalizedCache = portsNormalizedCache;
    }

    @Basic
    @Column(name = "name_condition", nullable = true, length = 255)
    public String getNameCondition() {
        return nameCondition;
    }

    public void setNameCondition(String nameCondition) {
        this.nameCondition = nameCondition;
    }

    @Basic
    @Column(name = "apply_condition", nullable = true, length = 255)
    public String getApplyCondition() {
        return applyCondition;
    }

    public void setApplyCondition(String applyCondition) {
        this.applyCondition = applyCondition;
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
        CyboxSocketAddresses that = (CyboxSocketAddresses) o;
        return id == that.id &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(addressesNormalizedCache, that.addressesNormalizedCache) &&
                Objects.equals(hostnamesNormalizedCache, that.hostnamesNormalizedCache) &&
                Objects.equals(portsNormalizedCache, that.portsNormalizedCache) &&
                Objects.equals(nameCondition, that.nameCondition) &&
                Objects.equals(applyCondition, that.applyCondition) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(portionMarking, that.portionMarking) &&
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
        return Objects.hash(id, cyboxHash, cyboxObjectId, addressesNormalizedCache, hostnamesNormalizedCache, portsNormalizedCache, nameCondition, applyCondition, guid, portionMarking, isReference, readOnly, createdAt, updatedAt, isCiscp, isMifr, feeds);
    }
}
