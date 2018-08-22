package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "old_stix_kill_chains", schema = "example_database", catalog = "")
public class OldStixKillChains {
    private int id;
    private String killChainId;
    private String killChainName;
    private Integer ordinality;
    private String phaseId;
    private String phaseName;
    private String remoteObjectId;
    private String remoteObjectType;
    private String guid;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kill_chain_id", nullable = true, length = 255)
    public String getKillChainId() {
        return killChainId;
    }

    public void setKillChainId(String killChainId) {
        this.killChainId = killChainId;
    }

    @Basic
    @Column(name = "kill_chain_name", nullable = true, length = 255)
    public String getKillChainName() {
        return killChainName;
    }

    public void setKillChainName(String killChainName) {
        this.killChainName = killChainName;
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
    @Column(name = "phase_id", nullable = true, length = 255)
    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    @Basic
    @Column(name = "phase_name", nullable = true, length = 255)
    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    @Basic
    @Column(name = "remote_object_id", nullable = true, length = 255)
    public String getRemoteObjectId() {
        return remoteObjectId;
    }

    public void setRemoteObjectId(String remoteObjectId) {
        this.remoteObjectId = remoteObjectId;
    }

    @Basic
    @Column(name = "remote_object_type", nullable = true, length = 255)
    public String getRemoteObjectType() {
        return remoteObjectType;
    }

    public void setRemoteObjectType(String remoteObjectType) {
        this.remoteObjectType = remoteObjectType;
    }

    @Basic
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldStixKillChains that = (OldStixKillChains) o;
        return id == that.id &&
                Objects.equals(killChainId, that.killChainId) &&
                Objects.equals(killChainName, that.killChainName) &&
                Objects.equals(ordinality, that.ordinality) &&
                Objects.equals(phaseId, that.phaseId) &&
                Objects.equals(phaseName, that.phaseName) &&
                Objects.equals(remoteObjectId, that.remoteObjectId) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(guid, that.guid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, killChainId, killChainName, ordinality, phaseId, phaseName, remoteObjectId, remoteObjectType, guid);
    }
}
