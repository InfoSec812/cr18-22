package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "human_review_fields", schema = "example_database", catalog = "")
public class HumanReviewFields {
    private int id;
    private Byte isChanged;
    private Integer humanReviewId;
    private String objectField;
    private String objectFieldRevised;
    private String objectFieldOriginal;
    private String objectUid;
    private String objectType;
    private String objectSha2;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Byte hasPii;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "is_changed", nullable = true)
    public Byte getIsChanged() {
        return isChanged;
    }

    public void setIsChanged(Byte isChanged) {
        this.isChanged = isChanged;
    }

    @Basic
    @Column(name = "human_review_id", nullable = true)
    public Integer getHumanReviewId() {
        return humanReviewId;
    }

    public void setHumanReviewId(Integer humanReviewId) {
        this.humanReviewId = humanReviewId;
    }

    @Basic
    @Column(name = "object_field", nullable = false, length = 255)
    public String getObjectField() {
        return objectField;
    }

    public void setObjectField(String objectField) {
        this.objectField = objectField;
    }

    @Basic
    @Column(name = "object_field_revised", nullable = true, length = -1)
    public String getObjectFieldRevised() {
        return objectFieldRevised;
    }

    public void setObjectFieldRevised(String objectFieldRevised) {
        this.objectFieldRevised = objectFieldRevised;
    }

    @Basic
    @Column(name = "object_field_original", nullable = true, length = -1)
    public String getObjectFieldOriginal() {
        return objectFieldOriginal;
    }

    public void setObjectFieldOriginal(String objectFieldOriginal) {
        this.objectFieldOriginal = objectFieldOriginal;
    }

    @Basic
    @Column(name = "object_uid", nullable = true, length = 255)
    public String getObjectUid() {
        return objectUid;
    }

    public void setObjectUid(String objectUid) {
        this.objectUid = objectUid;
    }

    @Basic
    @Column(name = "object_type", nullable = true, length = 255)
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Basic
    @Column(name = "object_sha2", nullable = true, length = 255)
    public String getObjectSha2() {
        return objectSha2;
    }

    public void setObjectSha2(String objectSha2) {
        this.objectSha2 = objectSha2;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "has_pii", nullable = true)
    public Byte getHasPii() {
        return hasPii;
    }

    public void setHasPii(Byte hasPii) {
        this.hasPii = hasPii;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanReviewFields that = (HumanReviewFields) o;
        return id == that.id &&
                Objects.equals(isChanged, that.isChanged) &&
                Objects.equals(humanReviewId, that.humanReviewId) &&
                Objects.equals(objectField, that.objectField) &&
                Objects.equals(objectFieldRevised, that.objectFieldRevised) &&
                Objects.equals(objectFieldOriginal, that.objectFieldOriginal) &&
                Objects.equals(objectUid, that.objectUid) &&
                Objects.equals(objectType, that.objectType) &&
                Objects.equals(objectSha2, that.objectSha2) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(hasPii, that.hasPii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isChanged, humanReviewId, objectField, objectFieldRevised, objectFieldOriginal, objectUid, objectType, objectSha2, createdAt, updatedAt, hasPii);
    }
}
