package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "human_reviews", schema = "example_database", catalog = "")
public class HumanReviews {
    private int id;
    private Timestamp decidedAt;
    private String decidedBy;
    private String status;
    private Integer uploadedFileId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Integer humanReviewFieldsCount;
    private Integer compHumanReviewFieldsCount;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "decided_at", nullable = true)
    public Timestamp getDecidedAt() {
        return decidedAt;
    }

    public void setDecidedAt(Timestamp decidedAt) {
        this.decidedAt = decidedAt;
    }

    @Basic
    @Column(name = "decided_by", nullable = true, length = 255)
    public String getDecidedBy() {
        return decidedBy;
    }

    public void setDecidedBy(String decidedBy) {
        this.decidedBy = decidedBy;
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
    @Column(name = "uploaded_file_id", nullable = true)
    public Integer getUploadedFileId() {
        return uploadedFileId;
    }

    public void setUploadedFileId(Integer uploadedFileId) {
        this.uploadedFileId = uploadedFileId;
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
    @Column(name = "human_review_fields_count", nullable = true)
    public Integer getHumanReviewFieldsCount() {
        return humanReviewFieldsCount;
    }

    public void setHumanReviewFieldsCount(Integer humanReviewFieldsCount) {
        this.humanReviewFieldsCount = humanReviewFieldsCount;
    }

    @Basic
    @Column(name = "comp_human_review_fields_count", nullable = true)
    public Integer getCompHumanReviewFieldsCount() {
        return compHumanReviewFieldsCount;
    }

    public void setCompHumanReviewFieldsCount(Integer compHumanReviewFieldsCount) {
        this.compHumanReviewFieldsCount = compHumanReviewFieldsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanReviews that = (HumanReviews) o;
        return id == that.id &&
                Objects.equals(decidedAt, that.decidedAt) &&
                Objects.equals(decidedBy, that.decidedBy) &&
                Objects.equals(status, that.status) &&
                Objects.equals(uploadedFileId, that.uploadedFileId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(humanReviewFieldsCount, that.humanReviewFieldsCount) &&
                Objects.equals(compHumanReviewFieldsCount, that.compHumanReviewFieldsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, decidedAt, decidedBy, status, uploadedFileId, createdAt, updatedAt, humanReviewFieldsCount, compHumanReviewFieldsCount);
    }
}
