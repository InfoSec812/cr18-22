package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "disseminated_records", schema = "example_database", catalog = "")
public class DisseminatedRecords {
    private int id;
    private String stixId;
    private Timestamp xmlUpdatedAt;
    private Timestamp disseminatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "xml_updated_at", nullable = true)
    public Timestamp getXmlUpdatedAt() {
        return xmlUpdatedAt;
    }

    public void setXmlUpdatedAt(Timestamp xmlUpdatedAt) {
        this.xmlUpdatedAt = xmlUpdatedAt;
    }

    @Basic
    @Column(name = "disseminated_at", nullable = true)
    public Timestamp getDisseminatedAt() {
        return disseminatedAt;
    }

    public void setDisseminatedAt(Timestamp disseminatedAt) {
        this.disseminatedAt = disseminatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisseminatedRecords that = (DisseminatedRecords) o;
        return id == that.id &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(xmlUpdatedAt, that.xmlUpdatedAt) &&
                Objects.equals(disseminatedAt, that.disseminatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixId, xmlUpdatedAt, disseminatedAt);
    }
}
