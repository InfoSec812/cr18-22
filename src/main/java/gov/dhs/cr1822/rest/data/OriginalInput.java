package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "original_input", schema = "example_database", catalog = "")
public class OriginalInput {
    private int id;
    private byte oldIsAttachment;
    private String mimeType;
    private byte[] rawContent;
    private String remoteObjectId;
    private String remoteObjectType;
    private int oldUploadedFileId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String sha2Hash;
    private String inputCategory;
    private String inputSubCategory;
    private String uploadedFileId;
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
    @Column(name = "old_is_attachment", nullable = false)
    public byte getOldIsAttachment() {
        return oldIsAttachment;
    }

    public void setOldIsAttachment(byte oldIsAttachment) {
        this.oldIsAttachment = oldIsAttachment;
    }

    @Basic
    @Column(name = "mime_type", nullable = false, length = 255)
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @Basic
    @Column(name = "raw_content", nullable = false)
    public byte[] getRawContent() {
        return rawContent;
    }

    public void setRawContent(byte[] rawContent) {
        this.rawContent = rawContent;
    }

    @Basic
    @Column(name = "remote_object_id", nullable = true, length = 255)
    public String getRemoteObjectId() {
        return remoteObjectId;
    }

    public void setRemoteObjectId(String remoteObjectId) {
        this.remoteObjectId = remoteObjectId;
    }

    @Basic
    @Column(name = "remote_object_type", nullable = true, length = 255)
    public String getRemoteObjectType() {
        return remoteObjectType;
    }

    public void setRemoteObjectType(String remoteObjectType) {
        this.remoteObjectType = remoteObjectType;
    }

    @Basic
    @Column(name = "old_uploaded_file_id", nullable = false)
    public int getOldUploadedFileId() {
        return oldUploadedFileId;
    }

    public void setOldUploadedFileId(int oldUploadedFileId) {
        this.oldUploadedFileId = oldUploadedFileId;
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
    @Column(name = "sha2_hash", nullable = true, length = 255)
    public String getSha2Hash() {
        return sha2Hash;
    }

    public void setSha2Hash(String sha2Hash) {
        this.sha2Hash = sha2Hash;
    }

    @Basic
    @Column(name = "input_category", nullable = true, length = 255)
    public String getInputCategory() {
        return inputCategory;
    }

    public void setInputCategory(String inputCategory) {
        this.inputCategory = inputCategory;
    }

    @Basic
    @Column(name = "input_sub_category", nullable = true, length = 255)
    public String getInputSubCategory() {
        return inputSubCategory;
    }

    public void setInputSubCategory(String inputSubCategory) {
        this.inputSubCategory = inputSubCategory;
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
        OriginalInput that = (OriginalInput) o;
        return id == that.id &&
                oldIsAttachment == that.oldIsAttachment &&
                oldUploadedFileId == that.oldUploadedFileId &&
                Objects.equals(mimeType, that.mimeType) &&
                Arrays.equals(rawContent, that.rawContent) &&
                Objects.equals(remoteObjectId, that.remoteObjectId) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(sha2Hash, that.sha2Hash) &&
                Objects.equals(inputCategory, that.inputCategory) &&
                Objects.equals(inputSubCategory, that.inputSubCategory) &&
                Objects.equals(uploadedFileId, that.uploadedFileId) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, oldIsAttachment, mimeType, remoteObjectId, remoteObjectType, oldUploadedFileId, createdAt, updatedAt, guid, sha2Hash, inputCategory, inputSubCategory, uploadedFileId, transferFromLow);
        result = 31 * result + Arrays.hashCode(rawContent);
        return result;
    }
}
