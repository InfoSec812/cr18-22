package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "acs_sets_organizations", schema = "example_database", catalog = "")
public class AcsSetsOrganizations {
    private int id;
    private Integer oldOrganizationId;
    private Integer oldAcsSetId;
    private String guid;
    private Timestamp updatedAt;
    private String organizationId;
    private String acsSetId;
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
    @Column(name = "old_organization_id", nullable = true)
    public Integer getOldOrganizationId() {
        return oldOrganizationId;
    }

    public void setOldOrganizationId(Integer oldOrganizationId) {
        this.oldOrganizationId = oldOrganizationId;
    }

    @Basic
    @Column(name = "old_acs_set_id", nullable = true)
    public Integer getOldAcsSetId() {
        return oldAcsSetId;
    }

    public void setOldAcsSetId(Integer oldAcsSetId) {
        this.oldAcsSetId = oldAcsSetId;
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
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "organization_id", nullable = true, length = 255)
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "acs_set_id", nullable = true, length = 255)
    public String getAcsSetId() {
        return acsSetId;
    }

    public void setAcsSetId(String acsSetId) {
        this.acsSetId = acsSetId;
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
        AcsSetsOrganizations that = (AcsSetsOrganizations) o;
        return id == that.id &&
                Objects.equals(oldOrganizationId, that.oldOrganizationId) &&
                Objects.equals(oldAcsSetId, that.oldAcsSetId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(acsSetId, that.acsSetId) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, oldOrganizationId, oldAcsSetId, guid, updatedAt, organizationId, acsSetId, transferFromLow);
    }
}
