package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "error_messages", schema = "example_database", catalog = "")
public class ErrorMessages {
    private int id;
    private String adminDescription;
    private Byte isWarning;
    private Integer oldSourceId;
    private String sourceType;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String description;
    private String guid;
    private String sourceId;
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
    @Column(name = "admin_description", nullable = true, length = -1)
    public String getAdminDescription() {
        return adminDescription;
    }

    public void setAdminDescription(String adminDescription) {
        this.adminDescription = adminDescription;
    }

    @Basic
    @Column(name = "is_warning", nullable = true)
    public Byte getIsWarning() {
        return isWarning;
    }

    public void setIsWarning(Byte isWarning) {
        this.isWarning = isWarning;
    }

    @Basic
    @Column(name = "old_source_id", nullable = true)
    public Integer getOldSourceId() {
        return oldSourceId;
    }

    public void setOldSourceId(Integer oldSourceId) {
        this.oldSourceId = oldSourceId;
    }

    @Basic
    @Column(name = "source_type", nullable = true, length = 255)
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
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
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "source_id", nullable = true, length = 255)
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
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
        ErrorMessages that = (ErrorMessages) o;
        return id == that.id &&
                Objects.equals(adminDescription, that.adminDescription) &&
                Objects.equals(isWarning, that.isWarning) &&
                Objects.equals(oldSourceId, that.oldSourceId) &&
                Objects.equals(sourceType, that.sourceType) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(description, that.description) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(sourceId, that.sourceId) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminDescription, isWarning, oldSourceId, sourceType, createdAt, updatedAt, description, guid, sourceId, transferFromLow);
    }
}
