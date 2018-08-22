package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "legacy_section_hashes", schema = "example_database", catalog = "")
public class LegacySectionHashes {
    private int id;
    private String indicatorGuid;
    private String hsh;
    private String name;
    private String ord;
    private String size;
    private String hashType;
    private String vsize;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "indicator_guid", nullable = true, length = 255)
    public String getIndicatorGuid() {
        return indicatorGuid;
    }

    public void setIndicatorGuid(String indicatorGuid) {
        this.indicatorGuid = indicatorGuid;
    }

    @Basic
    @Column(name = "hsh", nullable = true, length = 255)
    public String getHsh() {
        return hsh;
    }

    public void setHsh(String hsh) {
        this.hsh = hsh;
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
    @Column(name = "ord", nullable = true, length = 255)
    public String getOrd() {
        return ord;
    }

    public void setOrd(String ord) {
        this.ord = ord;
    }

    @Basic
    @Column(name = "size", nullable = true, length = 255)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "hash_type", nullable = true, length = 255)
    public String getHashType() {
        return hashType;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    @Basic
    @Column(name = "vsize", nullable = true, length = 255)
    public String getVsize() {
        return vsize;
    }

    public void setVsize(String vsize) {
        this.vsize = vsize;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegacySectionHashes that = (LegacySectionHashes) o;
        return id == that.id &&
                Objects.equals(indicatorGuid, that.indicatorGuid) &&
                Objects.equals(hsh, that.hsh) &&
                Objects.equals(name, that.name) &&
                Objects.equals(ord, that.ord) &&
                Objects.equals(size, that.size) &&
                Objects.equals(hashType, that.hashType) &&
                Objects.equals(vsize, that.vsize) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, indicatorGuid, hsh, name, ord, size, hashType, vsize, createdAt, updatedAt);
    }
}
