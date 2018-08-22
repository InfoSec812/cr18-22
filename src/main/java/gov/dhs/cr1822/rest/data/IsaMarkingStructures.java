package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "isa_marking_structures", schema = "example_database", catalog = "")
public class IsaMarkingStructures {
    private int id;
    private Timestamp dataItemCreatedAt;
    private String guid;
    private String reCustodian;
    private String reOriginator;
    private String stixId;
    private String stixMarkingId;
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
    @Column(name = "data_item_created_at", nullable = true)
    public Timestamp getDataItemCreatedAt() {
        return dataItemCreatedAt;
    }

    public void setDataItemCreatedAt(Timestamp dataItemCreatedAt) {
        this.dataItemCreatedAt = dataItemCreatedAt;
    }

    @Basic
    @Column(name = "guid", nullable = false, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "re_custodian", nullable = false, length = 255)
    public String getReCustodian() {
        return reCustodian;
    }

    public void setReCustodian(String reCustodian) {
        this.reCustodian = reCustodian;
    }

    @Basic
    @Column(name = "re_originator", nullable = true, length = 255)
    public String getReOriginator() {
        return reOriginator;
    }

    public void setReOriginator(String reOriginator) {
        this.reOriginator = reOriginator;
    }

    @Basic
    @Column(name = "stix_id", nullable = false, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
    }

    @Basic
    @Column(name = "stix_marking_id", nullable = true, length = 255)
    public String getStixMarkingId() {
        return stixMarkingId;
    }

    public void setStixMarkingId(String stixMarkingId) {
        this.stixMarkingId = stixMarkingId;
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
        IsaMarkingStructures that = (IsaMarkingStructures) o;
        return id == that.id &&
                Objects.equals(dataItemCreatedAt, that.dataItemCreatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(reCustodian, that.reCustodian) &&
                Objects.equals(reOriginator, that.reOriginator) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(stixMarkingId, that.stixMarkingId) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataItemCreatedAt, guid, reCustodian, reOriginator, stixId, stixMarkingId, updatedAt, transferFromLow);
    }
}
