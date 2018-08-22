package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "engine_cost", schema = "mysql", catalog = "")
@IdClass(EngineCostPK.class)
public class EngineCost {
    private String engineName;
    private int deviceType;
    private String costName;
    private Double costValue;
    private Timestamp lastUpdate;
    private String comment;
    private Double defaultValue;

    @Id
    @Column(name = "engine_name", nullable = false, length = 64)
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Id
    @Column(name = "device_type", nullable = false)
    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    @Id
    @Column(name = "cost_name", nullable = false, length = 64)
    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    @Basic
    @Column(name = "cost_value", nullable = true, precision = 0)
    public Double getCostValue() {
        return costValue;
    }

    public void setCostValue(Double costValue) {
        this.costValue = costValue;
    }

    @Basic
    @Column(name = "last_update", nullable = false)
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 1024)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "default_value", nullable = true, precision = 0)
    public Double getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineCost that = (EngineCost) o;
        return deviceType == that.deviceType &&
                Objects.equals(engineName, that.engineName) &&
                Objects.equals(costName, that.costName) &&
                Objects.equals(costValue, that.costValue) &&
                Objects.equals(lastUpdate, that.lastUpdate) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(defaultValue, that.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, deviceType, costName, costValue, lastUpdate, comment, defaultValue);
    }
}
