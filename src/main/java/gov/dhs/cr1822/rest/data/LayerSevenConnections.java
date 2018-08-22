package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "layer_seven_connections", schema = "example_database", catalog = "")
public class LayerSevenConnections {
    private int id;
    private String guid;
    private String cyboxHash;
    private String portionMarking;
    private String httpSessionId;
    private String dnsQueryCache;
    private Byte isReference;
    private Byte readOnly;
    private Timestamp createdAt;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
    }

    @Basic
    @Column(name = "http_session_id", nullable = true, length = 255)
    public String getHttpSessionId() {
        return httpSessionId;
    }

    public void setHttpSessionId(String httpSessionId) {
        this.httpSessionId = httpSessionId;
    }

    @Basic
    @Column(name = "dns_query_cache", nullable = true, length = 255)
    public String getDnsQueryCache() {
        return dnsQueryCache;
    }

    public void setDnsQueryCache(String dnsQueryCache) {
        this.dnsQueryCache = dnsQueryCache;
    }

    @Basic
    @Column(name = "is_reference", nullable = true)
    public Byte getIsReference() {
        return isReference;
    }

    public void setIsReference(Byte isReference) {
        this.isReference = isReference;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LayerSevenConnections that = (LayerSevenConnections) o;
        return id == that.id &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(httpSessionId, that.httpSessionId) &&
                Objects.equals(dnsQueryCache, that.dnsQueryCache) &&
                Objects.equals(isReference, that.isReference) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guid, cyboxHash, portionMarking, httpSessionId, dnsQueryCache, isReference, readOnly, createdAt, updatedAt);
    }
}
