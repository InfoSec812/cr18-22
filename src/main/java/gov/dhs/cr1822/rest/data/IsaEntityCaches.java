package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "isa_entity_caches", schema = "example_database", catalog = "")
public class IsaEntityCaches {
    private int id;
    private String adminOrg;
    private byte atoStatus;
    private String clearance;
    private String country;
    private String distinguishedName;
    private String dutyOrg;
    private String entityClass;
    private String entityType;
    private String lifeCycleStatus;
    private String userGuid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String accessGroups;
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
    @Column(name = "admin_org", nullable = false, length = 255)
    public String getAdminOrg() {
        return adminOrg;
    }

    public void setAdminOrg(String adminOrg) {
        this.adminOrg = adminOrg;
    }

    @Basic
    @Column(name = "ato_status", nullable = false)
    public byte getAtoStatus() {
        return atoStatus;
    }

    public void setAtoStatus(byte atoStatus) {
        this.atoStatus = atoStatus;
    }

    @Basic
    @Column(name = "clearance", nullable = false, length = 255)
    public String getClearance() {
        return clearance;
    }

    public void setClearance(String clearance) {
        this.clearance = clearance;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 255)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "distinguished_name", nullable = true, length = 255)
    public String getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    @Basic
    @Column(name = "duty_org", nullable = false, length = 255)
    public String getDutyOrg() {
        return dutyOrg;
    }

    public void setDutyOrg(String dutyOrg) {
        this.dutyOrg = dutyOrg;
    }

    @Basic
    @Column(name = "entity_class", nullable = false, length = 255)
    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    @Basic
    @Column(name = "entity_type", nullable = false, length = 255)
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "life_cycle_status", nullable = false, length = 255)
    public String getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    public void setLifeCycleStatus(String lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }

    @Basic
    @Column(name = "user_guid", nullable = false, length = 255)
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
    @Column(name = "access_groups", nullable = true, length = 255)
    public String getAccessGroups() {
        return accessGroups;
    }

    public void setAccessGroups(String accessGroups) {
        this.accessGroups = accessGroups;
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
        IsaEntityCaches that = (IsaEntityCaches) o;
        return id == that.id &&
                atoStatus == that.atoStatus &&
                Objects.equals(adminOrg, that.adminOrg) &&
                Objects.equals(clearance, that.clearance) &&
                Objects.equals(country, that.country) &&
                Objects.equals(distinguishedName, that.distinguishedName) &&
                Objects.equals(dutyOrg, that.dutyOrg) &&
                Objects.equals(entityClass, that.entityClass) &&
                Objects.equals(entityType, that.entityType) &&
                Objects.equals(lifeCycleStatus, that.lifeCycleStatus) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(accessGroups, that.accessGroups) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminOrg, atoStatus, clearance, country, distinguishedName, dutyOrg, entityClass, entityType, lifeCycleStatus, userGuid, createdAt, updatedAt, accessGroups, guid, transferFromLow);
    }
}
