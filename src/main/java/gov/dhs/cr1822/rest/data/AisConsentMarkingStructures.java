package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ais_consent_marking_structures", schema = "example_database", catalog = "")
public class AisConsentMarkingStructures {
    private int id;
    private String consent;
    private Byte proprietary;
    private String color;
    private String stixId;
    private String stixMarkingId;
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
    @Column(name = "consent", nullable = true, length = 255)
    public String getConsent() {
        return consent;
    }

    public void setConsent(String consent) {
        this.consent = consent;
    }

    @Basic
    @Column(name = "proprietary", nullable = true)
    public Byte getProprietary() {
        return proprietary;
    }

    public void setProprietary(Byte proprietary) {
        this.proprietary = proprietary;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 255)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "stix_id", nullable = true, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
    }

    @Basic
    @Column(name = "stix_marking_id", nullable = true, length = 255)
    public String getStixMarkingId() {
        return stixMarkingId;
    }

    public void setStixMarkingId(String stixMarkingId) {
        this.stixMarkingId = stixMarkingId;
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
        AisConsentMarkingStructures that = (AisConsentMarkingStructures) o;
        return id == that.id &&
                Objects.equals(consent, that.consent) &&
                Objects.equals(proprietary, that.proprietary) &&
                Objects.equals(color, that.color) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(stixMarkingId, that.stixMarkingId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, consent, proprietary, color, stixId, stixMarkingId, guid, updatedAt, transferFromLow);
    }
}
