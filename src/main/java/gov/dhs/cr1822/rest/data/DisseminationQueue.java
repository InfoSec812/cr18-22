package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dissemination_queue", schema = "example_database", catalog = "")
public class DisseminationQueue {
    private int id;
    private String originalInputId;
    private String finishedFeeds;
    private Timestamp updated;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "original_input_id", nullable = true, length = 255)
    public String getOriginalInputId() {
        return originalInputId;
    }

    public void setOriginalInputId(String originalInputId) {
        this.originalInputId = originalInputId;
    }

    @Basic
    @Column(name = "finished_feeds", nullable = true, length = 255)
    public String getFinishedFeeds() {
        return finishedFeeds;
    }

    public void setFinishedFeeds(String finishedFeeds) {
        this.finishedFeeds = finishedFeeds;
    }

    @Basic
    @Column(name = "updated", nullable = true)
    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisseminationQueue that = (DisseminationQueue) o;
        return id == that.id &&
                Objects.equals(originalInputId, that.originalInputId) &&
                Objects.equals(finishedFeeds, that.finishedFeeds) &&
                Objects.equals(updated, that.updated) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, originalInputId, finishedFeeds, updated, createdAt, updatedAt);
    }
}
