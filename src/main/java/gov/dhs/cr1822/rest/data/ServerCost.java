package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "server_cost", schema = "mysql", catalog = "")
public class ServerCost {
    private String costName;
    private Double costValue;
    private Timestamp lastUpdate;
    private String comment;
    private Double defaultValue;

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
        ServerCost that = (ServerCost) o;
        return Objects.equals(costName, that.costName) &&
                Objects.equals(costValue, that.costValue) &&
                Objects.equals(lastUpdate, that.lastUpdate) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(defaultValue, that.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costName, costValue, lastUpdate, comment, defaultValue);
    }
}
