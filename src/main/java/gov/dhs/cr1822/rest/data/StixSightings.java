package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_sightings", schema = "example_database", catalog = "")
public class StixSightings {
    private int id;
    private String description;
    private Timestamp sightedAt;
    private String stixIndicatorId;
    private String guid;
    private String userGuid;
    private String sightedAtPrecision;
    private Timestamp updatedAt;
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
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "sighted_at", nullable = true)
    public Timestamp getSightedAt() {
        return sightedAt;
    }

    public void setSightedAt(Timestamp sightedAt) {
        this.sightedAt = sightedAt;
    }

    @Basic
    @Column(name = "stix_indicator_id", nullable = true, length = 255)
    public String getStixIndicatorId() {
        return stixIndicatorId;
    }

    public void setStixIndicatorId(String stixIndicatorId) {
        this.stixIndicatorId = stixIndicatorId;
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
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "sighted_at_precision", nullable = true, length = 255)
    public String getSightedAtPrecision() {
        return sightedAtPrecision;
    }

    public void setSightedAtPrecision(String sightedAtPrecision) {
        this.sightedAtPrecision = sightedAtPrecision;
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
        StixSightings that = (StixSightings) o;
        return id == that.id &&
                Objects.equals(description, that.description) &&
                Objects.equals(sightedAt, that.sightedAt) &&
                Objects.equals(stixIndicatorId, that.stixIndicatorId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(sightedAtPrecision, that.sightedAtPrecision) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, sightedAt, stixIndicatorId, guid, userGuid, sightedAtPrecision, updatedAt, transferFromLow);
    }
}
