package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "further_sharings", schema = "example_database", catalog = "")
public class FurtherSharings {
    private int id;
    private String scope;
    private String effect;
    private String isaAssertionStructureGuid;
    private String guid;
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
    @Column(name = "scope", nullable = false, length = 255)
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "effect", nullable = false, length = 255)
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Basic
    @Column(name = "isa_assertion_structure_guid", nullable = true, length = 255)
    public String getIsaAssertionStructureGuid() {
        return isaAssertionStructureGuid;
    }

    public void setIsaAssertionStructureGuid(String isaAssertionStructureGuid) {
        this.isaAssertionStructureGuid = isaAssertionStructureGuid;
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
        FurtherSharings that = (FurtherSharings) o;
        return id == that.id &&
                Objects.equals(scope, that.scope) &&
                Objects.equals(effect, that.effect) &&
                Objects.equals(isaAssertionStructureGuid, that.isaAssertionStructureGuid) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, scope, effect, isaAssertionStructureGuid, guid, updatedAt, transferFromLow);
    }
}
