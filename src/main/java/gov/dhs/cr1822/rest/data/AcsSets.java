package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "acs_sets", schema = "example_database", catalog = "")
public class AcsSets {
    private int id;
    private String name;
    private String stixId;
    private String guid;
    private Integer oldAcsSetsOrgId;
    private String color;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Byte locked;
    private String portionMarking;
    private String acsSetsOrgId;
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
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "old_acs_sets_org_id", nullable = true)
    public Integer getOldAcsSetsOrgId() {
        return oldAcsSetsOrgId;
    }

    public void setOldAcsSetsOrgId(Integer oldAcsSetsOrgId) {
        this.oldAcsSetsOrgId = oldAcsSetsOrgId;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 255)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    @Column(name = "locked", nullable = true)
    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
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
    @Column(name = "acs_sets_org_id", nullable = true, length = 255)
    public String getAcsSetsOrgId() {
        return acsSetsOrgId;
    }

    public void setAcsSetsOrgId(String acsSetsOrgId) {
        this.acsSetsOrgId = acsSetsOrgId;
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
        AcsSets acsSets = (AcsSets) o;
        return id == acsSets.id &&
                Objects.equals(name, acsSets.name) &&
                Objects.equals(stixId, acsSets.stixId) &&
                Objects.equals(guid, acsSets.guid) &&
                Objects.equals(oldAcsSetsOrgId, acsSets.oldAcsSetsOrgId) &&
                Objects.equals(color, acsSets.color) &&
                Objects.equals(createdAt, acsSets.createdAt) &&
                Objects.equals(updatedAt, acsSets.updatedAt) &&
                Objects.equals(locked, acsSets.locked) &&
                Objects.equals(portionMarking, acsSets.portionMarking) &&
                Objects.equals(acsSetsOrgId, acsSets.acsSetsOrgId) &&
                Objects.equals(transferFromLow, acsSets.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stixId, guid, oldAcsSetsOrgId, color, createdAt, updatedAt, locked, portionMarking, acsSetsOrgId, transferFromLow);
    }
}
