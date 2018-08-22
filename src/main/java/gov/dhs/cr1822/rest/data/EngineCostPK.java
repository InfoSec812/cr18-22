package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EngineCostPK implements Serializable {
    private String engineName;
    private int deviceType;
    private String costName;

    @Column(name = "engine_name", nullable = false, length = 64)
    @Id
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Column(name = "device_type", nullable = false)
    @Id
    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    @Column(name = "cost_name", nullable = false, length = 64)
    @Id
    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineCostPK that = (EngineCostPK) o;
        return deviceType == that.deviceType &&
                Objects.equals(engineName, that.engineName) &&
                Objects.equals(costName, that.costName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, deviceType, costName);
    }
}
