package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ST_SPATIAL_REFERENCE_SYSTEMS", schema = "information_schema", catalog = "")
public class StSpatialReferenceSystems {
    private String srsName;
    private int srsId;
    private String organization;
    private Integer organizationCoordsysId;
    private String definition;
    private String description;

    @Basic
    @Column(name = "SRS_NAME", nullable = false, length = 80)
    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    @Basic
    @Column(name = "SRS_ID", nullable = false)
    public int getSrsId() {
        return srsId;
    }

    public void setSrsId(int srsId) {
        this.srsId = srsId;
    }

    @Basic
    @Column(name = "ORGANIZATION", nullable = true, length = 256)
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Basic
    @Column(name = "ORGANIZATION_COORDSYS_ID", nullable = true)
    public Integer getOrganizationCoordsysId() {
        return organizationCoordsysId;
    }

    public void setOrganizationCoordsysId(Integer organizationCoordsysId) {
        this.organizationCoordsysId = organizationCoordsysId;
    }

    @Basic
    @Column(name = "DEFINITION", nullable = false, length = 4096)
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 2048)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StSpatialReferenceSystems that = (StSpatialReferenceSystems) o;
        return srsId == that.srsId &&
                Objects.equals(srsName, that.srsName) &&
                Objects.equals(organization, that.organization) &&
                Objects.equals(organizationCoordsysId, that.organizationCoordsysId) &&
                Objects.equals(definition, that.definition) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srsName, srsId, organization, organizationCoordsysId, definition, description);
    }
}
