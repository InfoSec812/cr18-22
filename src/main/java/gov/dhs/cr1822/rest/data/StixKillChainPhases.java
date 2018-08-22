package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_kill_chain_phases", schema = "example_database", catalog = "")
public class StixKillChainPhases {
    private int id;
    private String guid;
    private Integer ordinality;
    private String phaseName;
    private String stixKillChainId;
    private String stixKillChainPhaseId;
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
    @Column(name = "guid", nullable = false, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "ordinality", nullable = true)
    public Integer getOrdinality() {
        return ordinality;
    }

    public void setOrdinality(Integer ordinality) {
        this.ordinality = ordinality;
    }

    @Basic
    @Column(name = "phase_name", nullable = false, length = 255)
    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
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
    @Column(name = "stix_kill_chain_phase_id", nullable = false, length = 255)
    public String getStixKillChainPhaseId() {
        return stixKillChainPhaseId;
    }

    public void setStixKillChainPhaseId(String stixKillChainPhaseId) {
        this.stixKillChainPhaseId = stixKillChainPhaseId;
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
        StixKillChainPhases that = (StixKillChainPhases) o;
        return id == that.id &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(ordinality, that.ordinality) &&
                Objects.equals(phaseName, that.phaseName) &&
                Objects.equals(stixKillChainId, that.stixKillChainId) &&
                Objects.equals(stixKillChainPhaseId, that.stixKillChainPhaseId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guid, ordinality, phaseName, stixKillChainId, stixKillChainPhaseId, createdAt, updatedAt, transferFromLow);
    }
}
