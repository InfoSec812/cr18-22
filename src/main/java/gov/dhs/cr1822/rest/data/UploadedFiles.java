package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "uploaded_files", schema = "example_database", catalog = "")
public class UploadedFiles {
    private int id;
    private byte isAttachment;
    private String fileName;
    private Integer fileSize;
    private String status;
    private byte validateOnly;
    private String userGuid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private byte overwrite;
    private Byte humanReviewNeeded;
    private Byte readOnly;
    private String portionMarking;
    private String referenceTitle;
    private String referenceNumber;
    private String referenceLink;
    private Byte avpValidation;
    private Byte avpFailContinue;
    private Byte avpValid;
    private String avpMessageId;
    private String srcFeed;
    private String zipStatus;
    private Byte isFinal;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "is_attachment", nullable = false)
    public byte getIsAttachment() {
        return isAttachment;
    }

    public void setIsAttachment(byte isAttachment) {
        this.isAttachment = isAttachment;
    }

    @Basic
    @Column(name = "file_name", nullable = false, length = 255)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "file_size", nullable = true)
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "validate_only", nullable = false)
    public byte getValidateOnly() {
        return validateOnly;
    }

    public void setValidateOnly(byte validateOnly) {
        this.validateOnly = validateOnly;
    }

    @Basic
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
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
    @Column(name = "overwrite", nullable = false)
    public byte getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(byte overwrite) {
        this.overwrite = overwrite;
    }

    @Basic
    @Column(name = "human_review_needed", nullable = true)
    public Byte getHumanReviewNeeded() {
        return humanReviewNeeded;
    }

    public void setHumanReviewNeeded(Byte humanReviewNeeded) {
        this.humanReviewNeeded = humanReviewNeeded;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
    }

    @Basic
    @Column(name = "reference_title", nullable = true, length = 255)
    public String getReferenceTitle() {
        return referenceTitle;
    }

    public void setReferenceTitle(String referenceTitle) {
        this.referenceTitle = referenceTitle;
    }

    @Basic
    @Column(name = "reference_number", nullable = true, length = 255)
    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Basic
    @Column(name = "reference_link", nullable = true, length = 255)
    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }

    @Basic
    @Column(name = "avp_validation", nullable = true)
    public Byte getAvpValidation() {
        return avpValidation;
    }

    public void setAvpValidation(Byte avpValidation) {
        this.avpValidation = avpValidation;
    }

    @Basic
    @Column(name = "avp_fail_continue", nullable = true)
    public Byte getAvpFailContinue() {
        return avpFailContinue;
    }

    public void setAvpFailContinue(Byte avpFailContinue) {
        this.avpFailContinue = avpFailContinue;
    }

    @Basic
    @Column(name = "avp_valid", nullable = true)
    public Byte getAvpValid() {
        return avpValid;
    }

    public void setAvpValid(Byte avpValid) {
        this.avpValid = avpValid;
    }

    @Basic
    @Column(name = "avp_message_id", nullable = true, length = 255)
    public String getAvpMessageId() {
        return avpMessageId;
    }

    public void setAvpMessageId(String avpMessageId) {
        this.avpMessageId = avpMessageId;
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
    @Column(name = "zip_status", nullable = true, length = 255)
    public String getZipStatus() {
        return zipStatus;
    }

    public void setZipStatus(String zipStatus) {
        this.zipStatus = zipStatus;
    }

    @Basic
    @Column(name = "final", nullable = true)
    public Byte getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Byte isFinal) {
        this.isFinal = isFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadedFiles that = (UploadedFiles) o;
        return id == that.id &&
                isAttachment == that.isAttachment &&
                validateOnly == that.validateOnly &&
                overwrite == that.overwrite &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(fileSize, that.fileSize) &&
                Objects.equals(status, that.status) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(humanReviewNeeded, that.humanReviewNeeded) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(referenceTitle, that.referenceTitle) &&
                Objects.equals(referenceNumber, that.referenceNumber) &&
                Objects.equals(referenceLink, that.referenceLink) &&
                Objects.equals(avpValidation, that.avpValidation) &&
                Objects.equals(avpFailContinue, that.avpFailContinue) &&
                Objects.equals(avpValid, that.avpValid) &&
                Objects.equals(avpMessageId, that.avpMessageId) &&
                Objects.equals(srcFeed, that.srcFeed) &&
                Objects.equals(zipStatus, that.zipStatus) &&
                Objects.equals(isFinal, that.isFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAttachment, fileName, fileSize, status, validateOnly, userGuid, createdAt, updatedAt, guid, overwrite, humanReviewNeeded, readOnly, portionMarking, referenceTitle, referenceNumber, referenceLink, avpValidation, avpFailContinue, avpValid, avpMessageId, srcFeed, zipStatus, isFinal);
    }
}
