package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_addresses", schema = "example_database", catalog = "")
public class CyboxAddresses {
    private int id;
    private String addressValueRaw;
    private String addressValueNormalized;
    private String category;
    private String cyboxHash;
    private String cyboxObjectId;
    private Integer ipValueCalculatedStart;
    private Integer ipValueCalculatedEnd;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String isoCountryCode;
    private String comThreatScore;
    private String govThreatScore;
    private String agenciesSensorsSeenOn;
    private String firstDateSeenRaw;
    private Timestamp firstDateSeen;
    private String lastDateSeenRaw;
    private Timestamp lastDateSeen;
    private String combinedScore;
    private String categoryList;
    private String portionMarking;
    private Integer gfiIdOld;
    private Byte readOnly;
    private Byte isSource;
    private Byte isDestination;
    private Byte isSpoofed;
    private String addressCondition;
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
    @Column(name = "address_value_raw", nullable = true, length = 255)
    public String getAddressValueRaw() {
        return addressValueRaw;
    }

    public void setAddressValueRaw(String addressValueRaw) {
        this.addressValueRaw = addressValueRaw;
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
    @Column(name = "category", nullable = true, length = 255)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
    @Column(name = "ip_value_calculated_start", nullable = true, precision = 0)
    public Integer getIpValueCalculatedStart() {
        return ipValueCalculatedStart;
    }

    public void setIpValueCalculatedStart(Integer ipValueCalculatedStart) {
        this.ipValueCalculatedStart = ipValueCalculatedStart;
    }

    @Basic
    @Column(name = "ip_value_calculated_end", nullable = true, precision = 0)
    public Integer getIpValueCalculatedEnd() {
        return ipValueCalculatedEnd;
    }

    public void setIpValueCalculatedEnd(Integer ipValueCalculatedEnd) {
        this.ipValueCalculatedEnd = ipValueCalculatedEnd;
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
    @Column(name = "iso_country_code", nullable = true, length = 255)
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    @Basic
    @Column(name = "com_threat_score", nullable = true, length = 255)
    public String getComThreatScore() {
        return comThreatScore;
    }

    public void setComThreatScore(String comThreatScore) {
        this.comThreatScore = comThreatScore;
    }

    @Basic
    @Column(name = "gov_threat_score", nullable = true, length = 255)
    public String getGovThreatScore() {
        return govThreatScore;
    }

    public void setGovThreatScore(String govThreatScore) {
        this.govThreatScore = govThreatScore;
    }

    @Basic
    @Column(name = "agencies_sensors_seen_on", nullable = true, length = 1000)
    public String getAgenciesSensorsSeenOn() {
        return agenciesSensorsSeenOn;
    }

    public void setAgenciesSensorsSeenOn(String agenciesSensorsSeenOn) {
        this.agenciesSensorsSeenOn = agenciesSensorsSeenOn;
    }

    @Basic
    @Column(name = "first_date_seen_raw", nullable = true, length = 255)
    public String getFirstDateSeenRaw() {
        return firstDateSeenRaw;
    }

    public void setFirstDateSeenRaw(String firstDateSeenRaw) {
        this.firstDateSeenRaw = firstDateSeenRaw;
    }

    @Basic
    @Column(name = "first_date_seen", nullable = true)
    public Timestamp getFirstDateSeen() {
        return firstDateSeen;
    }

    public void setFirstDateSeen(Timestamp firstDateSeen) {
        this.firstDateSeen = firstDateSeen;
    }

    @Basic
    @Column(name = "last_date_seen_raw", nullable = true, length = 255)
    public String getLastDateSeenRaw() {
        return lastDateSeenRaw;
    }

    public void setLastDateSeenRaw(String lastDateSeenRaw) {
        this.lastDateSeenRaw = lastDateSeenRaw;
    }

    @Basic
    @Column(name = "last_date_seen", nullable = true)
    public Timestamp getLastDateSeen() {
        return lastDateSeen;
    }

    public void setLastDateSeen(Timestamp lastDateSeen) {
        this.lastDateSeen = lastDateSeen;
    }

    @Basic
    @Column(name = "combined_score", nullable = true, length = 255)
    public String getCombinedScore() {
        return combinedScore;
    }

    public void setCombinedScore(String combinedScore) {
        this.combinedScore = combinedScore;
    }

    @Basic
    @Column(name = "category_list", nullable = true, length = 500)
    public String getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(String categoryList) {
        this.categoryList = categoryList;
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
    @Column(name = "is_source", nullable = true)
    public Byte getIsSource() {
        return isSource;
    }

    public void setIsSource(Byte isSource) {
        this.isSource = isSource;
    }

    @Basic
    @Column(name = "is_destination", nullable = true)
    public Byte getIsDestination() {
        return isDestination;
    }

    public void setIsDestination(Byte isDestination) {
        this.isDestination = isDestination;
    }

    @Basic
    @Column(name = "is_spoofed", nullable = true)
    public Byte getIsSpoofed() {
        return isSpoofed;
    }

    public void setIsSpoofed(Byte isSpoofed) {
        this.isSpoofed = isSpoofed;
    }

    @Basic
    @Column(name = "address_condition", nullable = true, length = 255)
    public String getAddressCondition() {
        return addressCondition;
    }

    public void setAddressCondition(String addressCondition) {
        this.addressCondition = addressCondition;
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
        CyboxAddresses that = (CyboxAddresses) o;
        return id == that.id &&
                Objects.equals(addressValueRaw, that.addressValueRaw) &&
                Objects.equals(addressValueNormalized, that.addressValueNormalized) &&
                Objects.equals(category, that.category) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(ipValueCalculatedStart, that.ipValueCalculatedStart) &&
                Objects.equals(ipValueCalculatedEnd, that.ipValueCalculatedEnd) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(isoCountryCode, that.isoCountryCode) &&
                Objects.equals(comThreatScore, that.comThreatScore) &&
                Objects.equals(govThreatScore, that.govThreatScore) &&
                Objects.equals(agenciesSensorsSeenOn, that.agenciesSensorsSeenOn) &&
                Objects.equals(firstDateSeenRaw, that.firstDateSeenRaw) &&
                Objects.equals(firstDateSeen, that.firstDateSeen) &&
                Objects.equals(lastDateSeenRaw, that.lastDateSeenRaw) &&
                Objects.equals(lastDateSeen, that.lastDateSeen) &&
                Objects.equals(combinedScore, that.combinedScore) &&
                Objects.equals(categoryList, that.categoryList) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(gfiIdOld, that.gfiIdOld) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(isSource, that.isSource) &&
                Objects.equals(isDestination, that.isDestination) &&
                Objects.equals(isSpoofed, that.isSpoofed) &&
                Objects.equals(addressCondition, that.addressCondition) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressValueRaw, addressValueNormalized, category, cyboxHash, cyboxObjectId, ipValueCalculatedStart, ipValueCalculatedEnd, createdAt, updatedAt, guid, isoCountryCode, comThreatScore, govThreatScore, agenciesSensorsSeenOn, firstDateSeenRaw, firstDateSeen, lastDateSeenRaw, lastDateSeen, combinedScore, categoryList, portionMarking, gfiIdOld, readOnly, isSource, isDestination, isSpoofed, addressCondition, isCiscp, isMifr, feeds);
    }
}
