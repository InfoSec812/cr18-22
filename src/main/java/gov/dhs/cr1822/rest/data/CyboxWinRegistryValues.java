package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_win_registry_values", schema = "example_database", catalog = "")
public class CyboxWinRegistryValues {
    private int id;
    private String cyboxObjectId;
    private String regName;
    private String regValue;
    private String guid;
    private String cyboxHash;
    private Byte readOnly;
    private String regNameC;
    private String regValueC;
    private String dataCondition;
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
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "reg_name", nullable = true, length = -1)
    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    @Basic
    @Column(name = "reg_value", nullable = true, length = -1)
    public String getRegValue() {
        return regValue;
    }

    public void setRegValue(String regValue) {
        this.regValue = regValue;
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
    @Column(name = "cybox_hash", nullable = true, length = 255)
    public String getCyboxHash() {
        return cyboxHash;
    }

    public void setCyboxHash(String cyboxHash) {
        this.cyboxHash = cyboxHash;
    }

    @Basic
    @Column(name = "read_only", nullable = true)
    public Byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Byte readOnly) {
        this.readOnly = readOnly;
    }

    @Basic
    @Column(name = "reg_name_c", nullable = true, length = 255)
    public String getRegNameC() {
        return regNameC;
    }

    public void setRegNameC(String regNameC) {
        this.regNameC = regNameC;
    }

    @Basic
    @Column(name = "reg_value_c", nullable = true, length = 255)
    public String getRegValueC() {
        return regValueC;
    }

    public void setRegValueC(String regValueC) {
        this.regValueC = regValueC;
    }

    @Basic
    @Column(name = "data_condition", nullable = true, length = 255)
    public String getDataCondition() {
        return dataCondition;
    }

    public void setDataCondition(String dataCondition) {
        this.dataCondition = dataCondition;
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
        CyboxWinRegistryValues that = (CyboxWinRegistryValues) o;
        return id == that.id &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(regName, that.regName) &&
                Objects.equals(regValue, that.regValue) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(regNameC, that.regNameC) &&
                Objects.equals(regValueC, that.regValueC) &&
                Objects.equals(dataCondition, that.dataCondition) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxObjectId, regName, regValue, guid, cyboxHash, readOnly, regNameC, regValueC, dataCondition, updatedAt);
    }
}
