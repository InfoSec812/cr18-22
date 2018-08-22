package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "original_input_id_mappings", schema = "example_database", catalog = "")
public class OriginalInputIdMappings {
    private int id;
    private Integer originalInputId;
    private Integer ciapIdMappingId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "original_input_id", nullable = true)
    public Integer getOriginalInputId() {
        return originalInputId;
    }

    public void setOriginalInputId(Integer originalInputId) {
        this.originalInputId = originalInputId;
    }

    @Basic
    @Column(name = "ciap_id_mapping_id", nullable = true)
    public Integer getCiapIdMappingId() {
        return ciapIdMappingId;
    }

    public void setCiapIdMappingId(Integer ciapIdMappingId) {
        this.ciapIdMappingId = ciapIdMappingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OriginalInputIdMappings that = (OriginalInputIdMappings) o;
        return id == that.id &&
                Objects.equals(originalInputId, that.originalInputId) &&
                Objects.equals(ciapIdMappingId, that.ciapIdMappingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, originalInputId, ciapIdMappingId);
    }
}
