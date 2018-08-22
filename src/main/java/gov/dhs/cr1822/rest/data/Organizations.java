package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Organizations {
    private int id;
    private Integer r5Id;
    private String guid;
    private String longName;
    private String shortName;
    private String contactInfo;
    private String category;
    private Integer releasabilityMask;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String organizationToken;
    private Integer oldAcsSetsOrgId;
    private String acsSetsOrgId;
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
    @Column(name = "r5_id", nullable = true)
    public Integer getR5Id() {
        return r5Id;
    }

    public void setR5Id(Integer r5Id) {
        this.r5Id = r5Id;
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
    @Column(name = "long_name", nullable = true, length = 255)
    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = 255)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "contact_info", nullable = true, length = -1)
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
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
    @Column(name = "releasability_mask", nullable = true)
    public Integer getReleasabilityMask() {
        return releasabilityMask;
    }

    public void setReleasabilityMask(Integer releasabilityMask) {
        this.releasabilityMask = releasabilityMask;
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
    @Column(name = "organization_token", nullable = true, length = 255)
    public String getOrganizationToken() {
        return organizationToken;
    }

    public void setOrganizationToken(String organizationToken) {
        this.organizationToken = organizationToken;
    }

    @Basic
    @Column(name = "old_acs_sets_org_id", nullable = true)
    public Integer getOldAcsSetsOrgId() {
        return oldAcsSetsOrgId;
    }

    public void setOldAcsSetsOrgId(Integer oldAcsSetsOrgId) {
        this.oldAcsSetsOrgId = oldAcsSetsOrgId;
    }

    @Basic
    @Column(name = "acs_sets_org_id", nullable = true, length = 255)
    public String getAcsSetsOrgId() {
        return acsSetsOrgId;
    }

    public void setAcsSetsOrgId(String acsSetsOrgId) {
        this.acsSetsOrgId = acsSetsOrgId;
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
        Organizations that = (Organizations) o;
        return id == that.id &&
                Objects.equals(r5Id, that.r5Id) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(longName, that.longName) &&
                Objects.equals(shortName, that.shortName) &&
                Objects.equals(contactInfo, that.contactInfo) &&
                Objects.equals(category, that.category) &&
                Objects.equals(releasabilityMask, that.releasabilityMask) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(organizationToken, that.organizationToken) &&
                Objects.equals(oldAcsSetsOrgId, that.oldAcsSetsOrgId) &&
                Objects.equals(acsSetsOrgId, that.acsSetsOrgId) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, r5Id, guid, longName, shortName, contactInfo, category, releasabilityMask, createdAt, updatedAt, organizationToken, oldAcsSetsOrgId, acsSetsOrgId, transferFromLow);
    }
}
