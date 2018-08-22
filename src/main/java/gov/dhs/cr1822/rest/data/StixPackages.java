package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_packages", schema = "example_database", catalog = "")
public class StixPackages {
    private int id;
    private Timestamp createdAt;
    private String description;
    private Timestamp infoSrcProducedTime;
    private Byte isReference;
    private String packageIntent;
    private String shortDescription;
    private String stixId;
    private Timestamp stixTimestamp;
    private String title;
    private Timestamp updatedAt;
    private Integer oldUploadedFileId;
    private String username;
    private String createdByUserGuid;
    private String updatedByUserGuid;
    private String createdByOrganizationGuid;
    private String updatedByOrganizationGuid;
    private String r5ContainerType;
    private Integer r5ContainerId;
    private String guid;
    private String legacyColor;
    private String legacyCategory;
    private Integer oldAcsSetId;
    private String submissionMechanism;
    private String portionMarking;
    private Byte readOnly;
    private String titleC;
    private String descriptionC;
    private String shortDescriptionC;
    private String packageIntentC;
    private String producedTimePrecision;
    private Byte isCiscp;
    private String shortDescriptionNormalized;
    private Byte isMifr;
    private String feeds;
    private String srcFeed;
    private String uploadedFileId;
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
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
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
    @Column(name = "info_src_produced_time", nullable = true)
    public Timestamp getInfoSrcProducedTime() {
        return infoSrcProducedTime;
    }

    public void setInfoSrcProducedTime(Timestamp infoSrcProducedTime) {
        this.infoSrcProducedTime = infoSrcProducedTime;
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
    @Column(name = "package_intent", nullable = true, length = 255)
    public String getPackageIntent() {
        return packageIntent;
    }

    public void setPackageIntent(String packageIntent) {
        this.packageIntent = packageIntent;
    }

    @Basic
    @Column(name = "short_description", nullable = true, length = -1)
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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
    @Column(name = "stix_timestamp", nullable = true)
    public Timestamp getStixTimestamp() {
        return stixTimestamp;
    }

    public void setStixTimestamp(Timestamp stixTimestamp) {
        this.stixTimestamp = stixTimestamp;
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
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "old_uploaded_file_id", nullable = true)
    public Integer getOldUploadedFileId() {
        return oldUploadedFileId;
    }

    public void setOldUploadedFileId(Integer oldUploadedFileId) {
        this.oldUploadedFileId = oldUploadedFileId;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "r5_container_type", nullable = true, length = 255)
    public String getR5ContainerType() {
        return r5ContainerType;
    }

    public void setR5ContainerType(String r5ContainerType) {
        this.r5ContainerType = r5ContainerType;
    }

    @Basic
    @Column(name = "r5_container_id", nullable = true)
    public Integer getR5ContainerId() {
        return r5ContainerId;
    }

    public void setR5ContainerId(Integer r5ContainerId) {
        this.r5ContainerId = r5ContainerId;
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
    @Column(name = "legacy_color", nullable = true, length = 255)
    public String getLegacyColor() {
        return legacyColor;
    }

    public void setLegacyColor(String legacyColor) {
        this.legacyColor = legacyColor;
    }

    @Basic
    @Column(name = "legacy_category", nullable = true, length = 255)
    public String getLegacyCategory() {
        return legacyCategory;
    }

    public void setLegacyCategory(String legacyCategory) {
        this.legacyCategory = legacyCategory;
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
    @Column(name = "submission_mechanism", nullable = true, length = 255)
    public String getSubmissionMechanism() {
        return submissionMechanism;
    }

    public void setSubmissionMechanism(String submissionMechanism) {
        this.submissionMechanism = submissionMechanism;
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
    @Column(name = "title_c", nullable = true, length = 255)
    public String getTitleC() {
        return titleC;
    }

    public void setTitleC(String titleC) {
        this.titleC = titleC;
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
    @Column(name = "short_description_c", nullable = true, length = 255)
    public String getShortDescriptionC() {
        return shortDescriptionC;
    }

    public void setShortDescriptionC(String shortDescriptionC) {
        this.shortDescriptionC = shortDescriptionC;
    }

    @Basic
    @Column(name = "package_intent_c", nullable = true, length = 255)
    public String getPackageIntentC() {
        return packageIntentC;
    }

    public void setPackageIntentC(String packageIntentC) {
        this.packageIntentC = packageIntentC;
    }

    @Basic
    @Column(name = "produced_time_precision", nullable = true, length = 255)
    public String getProducedTimePrecision() {
        return producedTimePrecision;
    }

    public void setProducedTimePrecision(String producedTimePrecision) {
        this.producedTimePrecision = producedTimePrecision;
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
    @Column(name = "short_description_normalized", nullable = true, length = 255)
    public String getShortDescriptionNormalized() {
        return shortDescriptionNormalized;
    }

    public void setShortDescriptionNormalized(String shortDescriptionNormalized) {
        this.shortDescriptionNormalized = shortDescriptionNormalized;
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
    @Column(name = "src_feed", nullable = true, length = 255)
    public String getSrcFeed() {
        return srcFeed;
    }

    public void setSrcFeed(String srcFeed) {
        this.srcFeed = srcFeed;
    }

    @Basic
    @Column(name = "uploaded_file_id", nullable = true, length = 255)
    public String getUploadedFileId() {
        return uploadedFileId;
    }

    public void setUploadedFileId(String uploadedFileId) {
        this.uploadedFileId = uploadedFileId;
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
        StixPackages that = (StixPackages) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(description, that.description) &&
                Objects.equals(infoSrcProducedTime, that.infoSrcProducedTime) &&
                Objects.equals(isReference, that.isReference) &&
                Objects.equals(packageIntent, that.packageIntent) &&
                Objects.equals(shortDescription, that.shortDescription) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(stixTimestamp, that.stixTimestamp) &&
                Objects.equals(title, that.title) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(oldUploadedFileId, that.oldUploadedFileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(createdByUserGuid, that.createdByUserGuid) &&
                Objects.equals(updatedByUserGuid, that.updatedByUserGuid) &&
                Objects.equals(createdByOrganizationGuid, that.createdByOrganizationGuid) &&
                Objects.equals(updatedByOrganizationGuid, that.updatedByOrganizationGuid) &&
                Objects.equals(r5ContainerType, that.r5ContainerType) &&
                Objects.equals(r5ContainerId, that.r5ContainerId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(legacyColor, that.legacyColor) &&
                Objects.equals(legacyCategory, that.legacyCategory) &&
                Objects.equals(oldAcsSetId, that.oldAcsSetId) &&
                Objects.equals(submissionMechanism, that.submissionMechanism) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(titleC, that.titleC) &&
                Objects.equals(descriptionC, that.descriptionC) &&
                Objects.equals(shortDescriptionC, that.shortDescriptionC) &&
                Objects.equals(packageIntentC, that.packageIntentC) &&
                Objects.equals(producedTimePrecision, that.producedTimePrecision) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(shortDescriptionNormalized, that.shortDescriptionNormalized) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds) &&
                Objects.equals(srcFeed, that.srcFeed) &&
                Objects.equals(uploadedFileId, that.uploadedFileId) &&
                Objects.equals(acsSetId, that.acsSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, description, infoSrcProducedTime, isReference, packageIntent, shortDescription, stixId, stixTimestamp, title, updatedAt, oldUploadedFileId, username, createdByUserGuid, updatedByUserGuid, createdByOrganizationGuid, updatedByOrganizationGuid, r5ContainerType, r5ContainerId, guid, legacyColor, legacyCategory, oldAcsSetId, submissionMechanism, portionMarking, readOnly, titleC, descriptionC, shortDescriptionC, packageIntentC, producedTimePrecision, isCiscp, shortDescriptionNormalized, isMifr, feeds, srcFeed, uploadedFileId, acsSetId);
    }
}
