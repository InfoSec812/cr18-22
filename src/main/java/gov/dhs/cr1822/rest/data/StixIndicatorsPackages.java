package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_indicators_packages", schema = "example_database", catalog = "")
public class StixIndicatorsPackages {
    private int id;
    private String stixPackageId;
    private String stixIndicatorId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
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
    @Column(name = "stix_package_id", nullable = true, length = 255)
    public String getStixPackageId() {
        return stixPackageId;
    }

    public void setStixPackageId(String stixPackageId) {
        this.stixPackageId = stixPackageId;
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
        StixIndicatorsPackages that = (StixIndicatorsPackages) o;
        return id == that.id &&
                Objects.equals(stixPackageId, that.stixPackageId) &&
                Objects.equals(stixIndicatorId, that.stixIndicatorId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixPackageId, stixIndicatorId, createdAt, updatedAt, guid, transferFromLow);
    }
}
