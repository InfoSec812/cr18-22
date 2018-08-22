package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Ttps {
    private int id;
    private String stixId;
    private String portionMarking;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String createdByUserGuid;
    private String updatedByUserGuid;
    private String createdByOrganizationGuid;
    private String updatedByOrganizationGuid;
    private Integer oldAcsSetId;
    private Timestamp stixTimestamp;
    private Byte readOnly;
    private Byte isCiscp;
    private Byte isMifr;
    private String feeds;
    private String acsSetId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stix_id", nullable = true, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
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
    @Column(name = "created_by_organization_guid", nullable = true, length = 255)
    public String getCreatedByOrganizationGuid() {
        return createdByOrganizationGuid;
    }

    public void setCreatedByOrganizationGuid(String createdByOrganizationGuid) {
        this.createdByOrganizationGuid = createdByOrganizationGuid;
    }

    @Basic
    @Column(name = "updated_by_organization_guid", nullable = true, length = 255)
    public String getUpdatedByOrganizationGuid() {
        return updatedByOrganizationGuid;
    }

    public void setUpdatedByOrganizationGuid(String updatedByOrganizationGuid) {
        this.updatedByOrganizationGuid = updatedByOrganizationGuid;
    }

    @Basic
    @Column(name = "old_acs_set_id", nullable = true)
    public Integer getOldAcsSetId() {
        return oldAcsSetId;
    }

    public void setOldAcsSetId(Integer oldAcsSetId) {
        this.oldAcsSetId = oldAcsSetId;
    }

    @Basic
    @Column(name = "stix_timestamp", nullable = true)
    public Timestamp getStixTimestamp() {
        return stixTimestamp;
    }

    public void setStixTimestamp(Timestamp stixTimestamp) {
        this.stixTimestamp = stixTimestamp;
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
    @Column(name = "acs_set_id", nullable = true, length = 255)
    public String getAcsSetId() {
        return acsSetId;
    }

    public void setAcsSetId(String acsSetId) {
        this.acsSetId = acsSetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ttps ttps = (Ttps) o;
        return id == ttps.id &&
                Objects.equals(stixId, ttps.stixId) &&
                Objects.equals(portionMarking, ttps.portionMarking) &&
                Objects.equals(createdAt, ttps.createdAt) &&
                Objects.equals(updatedAt, ttps.updatedAt) &&
                Objects.equals(guid, ttps.guid) &&
                Objects.equals(createdByUserGuid, ttps.createdByUserGuid) &&
                Objects.equals(updatedByUserGuid, ttps.updatedByUserGuid) &&
                Objects.equals(createdByOrganizationGuid, ttps.createdByOrganizationGuid) &&
                Objects.equals(updatedByOrganizationGuid, ttps.updatedByOrganizationGuid) &&
                Objects.equals(oldAcsSetId, ttps.oldAcsSetId) &&
                Objects.equals(stixTimestamp, ttps.stixTimestamp) &&
                Objects.equals(readOnly, ttps.readOnly) &&
                Objects.equals(isCiscp, ttps.isCiscp) &&
                Objects.equals(isMifr, ttps.isMifr) &&
                Objects.equals(feeds, ttps.feeds) &&
                Objects.equals(acsSetId, ttps.acsSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixId, portionMarking, createdAt, updatedAt, guid, createdByUserGuid, updatedByUserGuid, createdByOrganizationGuid, updatedByOrganizationGuid, oldAcsSetId, stixTimestamp, readOnly, isCiscp, isMifr, feeds, acsSetId);
    }
}
