package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ttp_attack_patterns", schema = "example_database", catalog = "")
public class TtpAttackPatterns {
    private int id;
    private String stixTtpId;
    private String stixAttackPatternId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String userGuid;
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
    @Column(name = "stix_ttp_id", nullable = true, length = 255)
    public String getStixTtpId() {
        return stixTtpId;
    }

    public void setStixTtpId(String stixTtpId) {
        this.stixTtpId = stixTtpId;
    }

    @Basic
    @Column(name = "stix_attack_pattern_id", nullable = true, length = 255)
    public String getStixAttackPatternId() {
        return stixAttackPatternId;
    }

    public void setStixAttackPatternId(String stixAttackPatternId) {
        this.stixAttackPatternId = stixAttackPatternId;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
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
        TtpAttackPatterns that = (TtpAttackPatterns) o;
        return id == that.id &&
                Objects.equals(stixTtpId, that.stixTtpId) &&
                Objects.equals(stixAttackPatternId, that.stixAttackPatternId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixTtpId, stixAttackPatternId, createdAt, updatedAt, guid, userGuid, transferFromLow);
    }
}
