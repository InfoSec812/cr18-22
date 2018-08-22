package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_kill_chains", schema = "example_database", catalog = "")
public class StixKillChains {
    private int id;
    private String definer;
    private String guid;
    private String killChainName;
    private String reference;
    private String stixKillChainId;
    private byte isDefault;
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
    @Column(name = "definer", nullable = true, length = 255)
    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
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
    @Column(name = "kill_chain_name", nullable = false, length = 255)
    public String getKillChainName() {
        return killChainName;
    }

    public void setKillChainName(String killChainName) {
        this.killChainName = killChainName;
    }

    @Basic
    @Column(name = "reference", nullable = true, length = 255)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "stix_kill_chain_id", nullable = false, length = 255)
    public String getStixKillChainId() {
        return stixKillChainId;
    }

    public void setStixKillChainId(String stixKillChainId) {
        this.stixKillChainId = stixKillChainId;
    }

    @Basic
    @Column(name = "is_default", nullable = false)
    public byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(byte isDefault) {
        this.isDefault = isDefault;
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
        StixKillChains that = (StixKillChains) o;
        return id == that.id &&
                isDefault == that.isDefault &&
                Objects.equals(definer, that.definer) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(killChainName, that.killChainName) &&
                Objects.equals(reference, that.reference) &&
                Objects.equals(stixKillChainId, that.stixKillChainId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, definer, guid, killChainName, reference, stixKillChainId, isDefault, createdAt, updatedAt, transferFromLow);
    }
}
