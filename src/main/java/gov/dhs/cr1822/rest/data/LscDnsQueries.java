package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lsc_dns_queries", schema = "example_database", catalog = "")
public class LscDnsQueries {
    private int id;
    private String layerSevenConnectionId;
    private String dnsQueryId;
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
    @Column(name = "layer_seven_connection_id", nullable = true, length = 255)
    public String getLayerSevenConnectionId() {
        return layerSevenConnectionId;
    }

    public void setLayerSevenConnectionId(String layerSevenConnectionId) {
        this.layerSevenConnectionId = layerSevenConnectionId;
    }

    @Basic
    @Column(name = "dns_query_id", nullable = true, length = 255)
    public String getDnsQueryId() {
        return dnsQueryId;
    }

    public void setDnsQueryId(String dnsQueryId) {
        this.dnsQueryId = dnsQueryId;
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
        LscDnsQueries that = (LscDnsQueries) o;
        return id == that.id &&
                Objects.equals(layerSevenConnectionId, that.layerSevenConnectionId) &&
                Objects.equals(dnsQueryId, that.dnsQueryId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, layerSevenConnectionId, dnsQueryId, guid, userGuid, createdAt, updatedAt, transferFromLow);
    }
}