package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "contributing_sources", schema = "example_database", catalog = "")
public class ContributingSources {
    private int id;
    private String organizationNames;
    private String countries;
    private String administrativeAreas;
    private String stixPackageStixId;
    private String guid;
    private String organizationInfo;
    private Byte isFederal;
    private Timestamp createdAt;
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
    @Column(name = "organization_names", nullable = true, length = 255)
    public String getOrganizationNames() {
        return organizationNames;
    }

    public void setOrganizationNames(String organizationNames) {
        this.organizationNames = organizationNames;
    }

    @Basic
    @Column(name = "countries", nullable = true, length = 255)
    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    @Basic
    @Column(name = "administrative_areas", nullable = true, length = 255)
    public String getAdministrativeAreas() {
        return administrativeAreas;
    }

    public void setAdministrativeAreas(String administrativeAreas) {
        this.administrativeAreas = administrativeAreas;
    }

    @Basic
    @Column(name = "stix_package_stix_id", nullable = true, length = 255)
    public String getStixPackageStixId() {
        return stixPackageStixId;
    }

    public void setStixPackageStixId(String stixPackageStixId) {
        this.stixPackageStixId = stixPackageStixId;
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
    @Column(name = "organization_info", nullable = true, length = 255)
    public String getOrganizationInfo() {
        return organizationInfo;
    }

    public void setOrganizationInfo(String organizationInfo) {
        this.organizationInfo = organizationInfo;
    }

    @Basic
    @Column(name = "is_federal", nullable = true)
    public Byte getIsFederal() {
        return isFederal;
    }

    public void setIsFederal(Byte isFederal) {
        this.isFederal = isFederal;
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
        ContributingSources that = (ContributingSources) o;
        return id == that.id &&
                Objects.equals(organizationNames, that.organizationNames) &&
                Objects.equals(countries, that.countries) &&
                Objects.equals(administrativeAreas, that.administrativeAreas) &&
                Objects.equals(stixPackageStixId, that.stixPackageStixId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(organizationInfo, that.organizationInfo) &&
                Objects.equals(isFederal, that.isFederal) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, organizationNames, countries, administrativeAreas, stixPackageStixId, guid, organizationInfo, isFederal, createdAt, updatedAt, transferFromLow);
    }
}
