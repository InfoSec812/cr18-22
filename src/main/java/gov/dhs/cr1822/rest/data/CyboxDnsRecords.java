package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_dns_records", schema = "example_database", catalog = "")
public class CyboxDnsRecords {
    private int id;
    private String addressClass;
    private String addressValueNormalized;
    private String addressValueRaw;
    private String cyboxHash;
    private String cyboxObjectId;
    private String description;
    private String domainNormalized;
    private String domainRaw;
    private String entryType;
    private Timestamp queriedDate;
    private String guid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String legacyRecordName;
    private String legacyRecordType;
    private Integer legacyTtl;
    private String legacyFlags;
    private Integer legacyDataLength;
    private String legacyRecordData;
    private String portionMarking;
    private Integer gfiIdOld;
    private Byte readOnly;
    private String addressValueNormalizedC;
    private String addressClassC;
    private String domainNormalizedC;
    private String entryTypeC;
    private String queriedDateC;
    private String addressCyboxObjectId;
    private String domainCyboxObjectId;
    private String recordName;
    private String recordType;
    private String ttl;
    private String flags;
    private String dataLength;
    private String recordNameC;
    private String recordTypeC;
    private String ttlC;
    private String flagsC;
    private String dataLengthC;
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
    @Column(name = "address_class", nullable = true, length = 255)
    public String getAddressClass() {
        return addressClass;
    }

    public void setAddressClass(String addressClass) {
        this.addressClass = addressClass;
    }

    @Basic
    @Column(name = "address_value_normalized", nullable = true, length = 255)
    public String getAddressValueNormalized() {
        return addressValueNormalized;
    }

    public void setAddressValueNormalized(String addressValueNormalized) {
        this.addressValueNormalized = addressValueNormalized;
    }

    @Basic
    @Column(name = "address_value_raw", nullable = true, length = 255)
    public String getAddressValueRaw() {
        return addressValueRaw;
    }

    public void setAddressValueRaw(String addressValueRaw) {
        this.addressValueRaw = addressValueRaw;
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
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "domain_normalized", nullable = true, length = 255)
    public String getDomainNormalized() {
        return domainNormalized;
    }

    public void setDomainNormalized(String domainNormalized) {
        this.domainNormalized = domainNormalized;
    }

    @Basic
    @Column(name = "domain_raw", nullable = true, length = 255)
    public String getDomainRaw() {
        return domainRaw;
    }

    public void setDomainRaw(String domainRaw) {
        this.domainRaw = domainRaw;
    }

    @Basic
    @Column(name = "entry_type", nullable = true, length = 255)
    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    @Basic
    @Column(name = "queried_date", nullable = true)
    public Timestamp getQueriedDate() {
        return queriedDate;
    }

    public void setQueriedDate(Timestamp queriedDate) {
        this.queriedDate = queriedDate;
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
    @Column(name = "legacy_record_name", nullable = true, length = 255)
    public String getLegacyRecordName() {
        return legacyRecordName;
    }

    public void setLegacyRecordName(String legacyRecordName) {
        this.legacyRecordName = legacyRecordName;
    }

    @Basic
    @Column(name = "legacy_record_type", nullable = true, length = 255)
    public String getLegacyRecordType() {
        return legacyRecordType;
    }

    public void setLegacyRecordType(String legacyRecordType) {
        this.legacyRecordType = legacyRecordType;
    }

    @Basic
    @Column(name = "legacy_ttl", nullable = true)
    public Integer getLegacyTtl() {
        return legacyTtl;
    }

    public void setLegacyTtl(Integer legacyTtl) {
        this.legacyTtl = legacyTtl;
    }

    @Basic
    @Column(name = "legacy_flags", nullable = true, length = 255)
    public String getLegacyFlags() {
        return legacyFlags;
    }

    public void setLegacyFlags(String legacyFlags) {
        this.legacyFlags = legacyFlags;
    }

    @Basic
    @Column(name = "legacy_data_length", nullable = true)
    public Integer getLegacyDataLength() {
        return legacyDataLength;
    }

    public void setLegacyDataLength(Integer legacyDataLength) {
        this.legacyDataLength = legacyDataLength;
    }

    @Basic
    @Column(name = "legacy_record_data", nullable = true, length = -1)
    public String getLegacyRecordData() {
        return legacyRecordData;
    }

    public void setLegacyRecordData(String legacyRecordData) {
        this.legacyRecordData = legacyRecordData;
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
    @Column(name = "gfi_id_old", nullable = true)
    public Integer getGfiIdOld() {
        return gfiIdOld;
    }

    public void setGfiIdOld(Integer gfiIdOld) {
        this.gfiIdOld = gfiIdOld;
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
    @Column(name = "address_value_normalized_c", nullable = true, length = 255)
    public String getAddressValueNormalizedC() {
        return addressValueNormalizedC;
    }

    public void setAddressValueNormalizedC(String addressValueNormalizedC) {
        this.addressValueNormalizedC = addressValueNormalizedC;
    }

    @Basic
    @Column(name = "address_class_c", nullable = true, length = 255)
    public String getAddressClassC() {
        return addressClassC;
    }

    public void setAddressClassC(String addressClassC) {
        this.addressClassC = addressClassC;
    }

    @Basic
    @Column(name = "domain_normalized_c", nullable = true, length = 255)
    public String getDomainNormalizedC() {
        return domainNormalizedC;
    }

    public void setDomainNormalizedC(String domainNormalizedC) {
        this.domainNormalizedC = domainNormalizedC;
    }

    @Basic
    @Column(name = "entry_type_c", nullable = true, length = 255)
    public String getEntryTypeC() {
        return entryTypeC;
    }

    public void setEntryTypeC(String entryTypeC) {
        this.entryTypeC = entryTypeC;
    }

    @Basic
    @Column(name = "queried_date_c", nullable = true, length = 255)
    public String getQueriedDateC() {
        return queriedDateC;
    }

    public void setQueriedDateC(String queriedDateC) {
        this.queriedDateC = queriedDateC;
    }

    @Basic
    @Column(name = "address_cybox_object_id", nullable = true, length = 255)
    public String getAddressCyboxObjectId() {
        return addressCyboxObjectId;
    }

    public void setAddressCyboxObjectId(String addressCyboxObjectId) {
        this.addressCyboxObjectId = addressCyboxObjectId;
    }

    @Basic
    @Column(name = "domain_cybox_object_id", nullable = true, length = 255)
    public String getDomainCyboxObjectId() {
        return domainCyboxObjectId;
    }

    public void setDomainCyboxObjectId(String domainCyboxObjectId) {
        this.domainCyboxObjectId = domainCyboxObjectId;
    }

    @Basic
    @Column(name = "record_name", nullable = true, length = 255)
    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
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
    @Column(name = "ttl", nullable = true, length = 255)
    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @Basic
    @Column(name = "flags", nullable = true, length = 255)
    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    @Basic
    @Column(name = "data_length", nullable = true, length = 255)
    public String getDataLength() {
        return dataLength;
    }

    public void setDataLength(String dataLength) {
        this.dataLength = dataLength;
    }

    @Basic
    @Column(name = "record_name_c", nullable = true, length = 255)
    public String getRecordNameC() {
        return recordNameC;
    }

    public void setRecordNameC(String recordNameC) {
        this.recordNameC = recordNameC;
    }

    @Basic
    @Column(name = "record_type_c", nullable = true, length = 255)
    public String getRecordTypeC() {
        return recordTypeC;
    }

    public void setRecordTypeC(String recordTypeC) {
        this.recordTypeC = recordTypeC;
    }

    @Basic
    @Column(name = "ttl_c", nullable = true, length = 255)
    public String getTtlC() {
        return ttlC;
    }

    public void setTtlC(String ttlC) {
        this.ttlC = ttlC;
    }

    @Basic
    @Column(name = "flags_c", nullable = true, length = 255)
    public String getFlagsC() {
        return flagsC;
    }

    public void setFlagsC(String flagsC) {
        this.flagsC = flagsC;
    }

    @Basic
    @Column(name = "data_length_c", nullable = true, length = 255)
    public String getDataLengthC() {
        return dataLengthC;
    }

    public void setDataLengthC(String dataLengthC) {
        this.dataLengthC = dataLengthC;
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
        CyboxDnsRecords that = (CyboxDnsRecords) o;
        return id == that.id &&
                Objects.equals(addressClass, that.addressClass) &&
                Objects.equals(addressValueNormalized, that.addressValueNormalized) &&
                Objects.equals(addressValueRaw, that.addressValueRaw) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(domainNormalized, that.domainNormalized) &&
                Objects.equals(domainRaw, that.domainRaw) &&
                Objects.equals(entryType, that.entryType) &&
                Objects.equals(queriedDate, that.queriedDate) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(legacyRecordName, that.legacyRecordName) &&
                Objects.equals(legacyRecordType, that.legacyRecordType) &&
                Objects.equals(legacyTtl, that.legacyTtl) &&
                Objects.equals(legacyFlags, that.legacyFlags) &&
                Objects.equals(legacyDataLength, that.legacyDataLength) &&
                Objects.equals(legacyRecordData, that.legacyRecordData) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(gfiIdOld, that.gfiIdOld) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(addressValueNormalizedC, that.addressValueNormalizedC) &&
                Objects.equals(addressClassC, that.addressClassC) &&
                Objects.equals(domainNormalizedC, that.domainNormalizedC) &&
                Objects.equals(entryTypeC, that.entryTypeC) &&
                Objects.equals(queriedDateC, that.queriedDateC) &&
                Objects.equals(addressCyboxObjectId, that.addressCyboxObjectId) &&
                Objects.equals(domainCyboxObjectId, that.domainCyboxObjectId) &&
                Objects.equals(recordName, that.recordName) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(ttl, that.ttl) &&
                Objects.equals(flags, that.flags) &&
                Objects.equals(dataLength, that.dataLength) &&
                Objects.equals(recordNameC, that.recordNameC) &&
                Objects.equals(recordTypeC, that.recordTypeC) &&
                Objects.equals(ttlC, that.ttlC) &&
                Objects.equals(flagsC, that.flagsC) &&
                Objects.equals(dataLengthC, that.dataLengthC) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressClass, addressValueNormalized, addressValueRaw, cyboxHash, cyboxObjectId, description, domainNormalized, domainRaw, entryType, queriedDate, guid, createdAt, updatedAt, legacyRecordName, legacyRecordType, legacyTtl, legacyFlags, legacyDataLength, legacyRecordData, portionMarking, gfiIdOld, readOnly, addressValueNormalizedC, addressClassC, domainNormalizedC, entryTypeC, queriedDateC, addressCyboxObjectId, domainCyboxObjectId, recordName, recordType, ttl, flags, dataLength, recordNameC, recordTypeC, ttlC, flagsC, dataLengthC, isCiscp, isMifr, feeds);
    }
}
