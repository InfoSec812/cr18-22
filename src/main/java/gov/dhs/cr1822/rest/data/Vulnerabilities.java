package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Vulnerabilities {
    private int id;
    private String title;
    private String titleC;
    private String description;
    private String descriptionC;
    private String cveId;
    private String cveIdC;
    private String osvdbId;
    private String osvdbIdC;
    private String portionMarking;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String createdByUserGuid;
    private String updatedByUserGuid;
    private String createdByOrganizationGuid;
    private String updatedByOrganizationGuid;
    private Timestamp stixTimestamp;
    private Byte readOnly;
    private String descriptionNormalized;
    private Byte isMifr;
    private Byte isCiscp;
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
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "title_c", nullable = true, length = 255)
    public String getTitleC() {
        return titleC;
    }

    public void setTitleC(String titleC) {
        this.titleC = titleC;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "description_c", nullable = true, length = 255)
    public String getDescriptionC() {
        return descriptionC;
    }

    public void setDescriptionC(String descriptionC) {
        this.descriptionC = descriptionC;
    }

    @Basic
    @Column(name = "cve_id", nullable = true, length = 255)
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    @Basic
    @Column(name = "cve_id_c", nullable = true, length = 255)
    public String getCveIdC() {
        return cveIdC;
    }

    public void setCveIdC(String cveIdC) {
        this.cveIdC = cveIdC;
    }

    @Basic
    @Column(name = "osvdb_id", nullable = true, length = 255)
    public String getOsvdbId() {
        return osvdbId;
    }

    public void setOsvdbId(String osvdbId) {
        this.osvdbId = osvdbId;
    }

    @Basic
    @Column(name = "osvdb_id_c", nullable = true, length = 255)
    public String getOsvdbIdC() {
        return osvdbIdC;
    }

    public void setOsvdbIdC(String osvdbIdC) {
        this.osvdbIdC = osvdbIdC;
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
    @Column(name = "description_normalized", nullable = true, length = 255)
    public String getDescriptionNormalized() {
        return descriptionNormalized;
    }

    public void setDescriptionNormalized(String descriptionNormalized) {
        this.descriptionNormalized = descriptionNormalized;
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
    @Column(name = "is_ciscp", nullable = true)
    public Byte getIsCiscp() {
        return isCiscp;
    }

    public void setIsCiscp(Byte isCiscp) {
        this.isCiscp = isCiscp;
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
        Vulnerabilities that = (Vulnerabilities) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(titleC, that.titleC) &&
                Objects.equals(description, that.description) &&
                Objects.equals(descriptionC, that.descriptionC) &&
                Objects.equals(cveId, that.cveId) &&
                Objects.equals(cveIdC, that.cveIdC) &&
                Objects.equals(osvdbId, that.osvdbId) &&
                Objects.equals(osvdbIdC, that.osvdbIdC) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdByUserGuid, that.createdByUserGuid) &&
                Objects.equals(updatedByUserGuid, that.updatedByUserGuid) &&
                Objects.equals(createdByOrganizationGuid, that.createdByOrganizationGuid) &&
                Objects.equals(updatedByOrganizationGuid, that.updatedByOrganizationGuid) &&
                Objects.equals(stixTimestamp, that.stixTimestamp) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(descriptionNormalized, that.descriptionNormalized) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, titleC, description, descriptionC, cveId, cveIdC, osvdbId, osvdbIdC, portionMarking, createdAt, updatedAt, guid, createdByUserGuid, updatedByUserGuid, createdByOrganizationGuid, updatedByOrganizationGuid, stixTimestamp, readOnly, descriptionNormalized, isMifr, isCiscp, feeds);
    }
}
