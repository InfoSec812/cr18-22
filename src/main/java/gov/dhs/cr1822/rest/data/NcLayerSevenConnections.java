package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "nc_layer_seven_connections", schema = "example_database", catalog = "")
public class NcLayerSevenConnections {
    private int id;
    private String networkConnectionId;
    private String layerSevenConnectionId;
    private String guid;
    private String userGuid;
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
    @Column(name = "network_connection_id", nullable = true, length = 255)
    public String getNetworkConnectionId() {
        return networkConnectionId;
    }

    public void setNetworkConnectionId(String networkConnectionId) {
        this.networkConnectionId = networkConnectionId;
    }

    @Basic
    @Column(name = "layer_seven_connection_id", nullable = true, length = 255)
    public String getLayerSevenConnectionId() {
        return layerSevenConnectionId;
    }

    public void setLayerSevenConnectionId(String layerSevenConnectionId) {
        this.layerSevenConnectionId = layerSevenConnectionId;
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
        NcLayerSevenConnections that = (NcLayerSevenConnections) o;
        return id == that.id &&
                Objects.equals(networkConnectionId, that.networkConnectionId) &&
                Objects.equals(layerSevenConnectionId, that.layerSevenConnectionId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, networkConnectionId, layerSevenConnectionId, guid, userGuid, createdAt, updatedAt, transferFromLow);
    }
}
