package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_markings", schema = "example_database", catalog = "")
public class StixMarkings {
    private int id;
    private byte isReference;
    private String guid;
    private String oldMarkingModelName;
    private String oldMarkingModelType;
    private String oldMarkingName;
    private String oldMarkingValue;
    private String remoteObjectId;
    private String remoteObjectType;
    private String stixId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String tlpStructureId;
    private String simpleStructureId;
    private String isaMarkingStructureId;
    private String isaAssertionStructureId;
    private String remoteObjectField;
    private String controlledStructure;
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
    @Column(name = "is_reference", nullable = false)
    public byte getIsReference() {
        return isReference;
    }

    public void setIsReference(byte isReference) {
        this.isReference = isReference;
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
    @Column(name = "old_marking_model_name", nullable = true, length = 255)
    public String getOldMarkingModelName() {
        return oldMarkingModelName;
    }

    public void setOldMarkingModelName(String oldMarkingModelName) {
        this.oldMarkingModelName = oldMarkingModelName;
    }

    @Basic
    @Column(name = "old_marking_model_type", nullable = true, length = 255)
    public String getOldMarkingModelType() {
        return oldMarkingModelType;
    }

    public void setOldMarkingModelType(String oldMarkingModelType) {
        this.oldMarkingModelType = oldMarkingModelType;
    }

    @Basic
    @Column(name = "old_marking_name", nullable = true, length = 255)
    public String getOldMarkingName() {
        return oldMarkingName;
    }

    public void setOldMarkingName(String oldMarkingName) {
        this.oldMarkingName = oldMarkingName;
    }

    @Basic
    @Column(name = "old_marking_value", nullable = true, length = -1)
    public String getOldMarkingValue() {
        return oldMarkingValue;
    }

    public void setOldMarkingValue(String oldMarkingValue) {
        this.oldMarkingValue = oldMarkingValue;
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
    @Column(name = "stix_id", nullable = true, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
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
    @Column(name = "tlp_structure_id", nullable = true, length = 255)
    public String getTlpStructureId() {
        return tlpStructureId;
    }

    public void setTlpStructureId(String tlpStructureId) {
        this.tlpStructureId = tlpStructureId;
    }

    @Basic
    @Column(name = "simple_structure_id", nullable = true, length = 255)
    public String getSimpleStructureId() {
        return simpleStructureId;
    }

    public void setSimpleStructureId(String simpleStructureId) {
        this.simpleStructureId = simpleStructureId;
    }

    @Basic
    @Column(name = "isa_marking_structure_id", nullable = true, length = 255)
    public String getIsaMarkingStructureId() {
        return isaMarkingStructureId;
    }

    public void setIsaMarkingStructureId(String isaMarkingStructureId) {
        this.isaMarkingStructureId = isaMarkingStructureId;
    }

    @Basic
    @Column(name = "isa_assertion_structure_id", nullable = true, length = 255)
    public String getIsaAssertionStructureId() {
        return isaAssertionStructureId;
    }

    public void setIsaAssertionStructureId(String isaAssertionStructureId) {
        this.isaAssertionStructureId = isaAssertionStructureId;
    }

    @Basic
    @Column(name = "remote_object_field", nullable = true, length = 255)
    public String getRemoteObjectField() {
        return remoteObjectField;
    }

    public void setRemoteObjectField(String remoteObjectField) {
        this.remoteObjectField = remoteObjectField;
    }

    @Basic
    @Column(name = "controlled_structure", nullable = true, length = -1)
    public String getControlledStructure() {
        return controlledStructure;
    }

    public void setControlledStructure(String controlledStructure) {
        this.controlledStructure = controlledStructure;
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
        StixMarkings that = (StixMarkings) o;
        return id == that.id &&
                isReference == that.isReference &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(oldMarkingModelName, that.oldMarkingModelName) &&
                Objects.equals(oldMarkingModelType, that.oldMarkingModelType) &&
                Objects.equals(oldMarkingName, that.oldMarkingName) &&
                Objects.equals(oldMarkingValue, that.oldMarkingValue) &&
                Objects.equals(remoteObjectId, that.remoteObjectId) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(tlpStructureId, that.tlpStructureId) &&
                Objects.equals(simpleStructureId, that.simpleStructureId) &&
                Objects.equals(isaMarkingStructureId, that.isaMarkingStructureId) &&
                Objects.equals(isaAssertionStructureId, that.isaAssertionStructureId) &&
                Objects.equals(remoteObjectField, that.remoteObjectField) &&
                Objects.equals(controlledStructure, that.controlledStructure) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isReference, guid, oldMarkingModelName, oldMarkingModelType, oldMarkingName, oldMarkingValue, remoteObjectId, remoteObjectType, stixId, createdAt, updatedAt, tlpStructureId, simpleStructureId, isaMarkingStructureId, isaAssertionStructureId, remoteObjectField, controlledStructure, transferFromLow);
    }
}
