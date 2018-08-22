package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_ports", schema = "example_database", catalog = "")
public class CyboxPorts {
    private int id;
    private String cyboxHash;
    private String cyboxObjectId;
    private String port;
    private String portC;
    private String layer4Protocol;
    private String layer4ProtocolC;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String portionMarking;
    private Byte readOnly;
    private Byte isCiscp;
    private Byte isMifr;
    private String feeds;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "port", nullable = true, length = 255)
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Basic
    @Column(name = "port_c", nullable = true, length = 255)
    public String getPortC() {
        return portC;
    }

    public void setPortC(String portC) {
        this.portC = portC;
    }

    @Basic
    @Column(name = "layer4_protocol", nullable = true, length = 255)
    public String getLayer4Protocol() {
        return layer4Protocol;
    }

    public void setLayer4Protocol(String layer4Protocol) {
        this.layer4Protocol = layer4Protocol;
    }

    @Basic
    @Column(name = "layer4_protocol_c", nullable = true, length = 255)
    public String getLayer4ProtocolC() {
        return layer4ProtocolC;
    }

    public void setLayer4ProtocolC(String layer4ProtocolC) {
        this.layer4ProtocolC = layer4ProtocolC;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
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
    @Column(name = "is_ciscp", nullable = true)
    public Byte getIsCiscp() {
        return isCiscp;
    }

    public void setIsCiscp(Byte isCiscp) {
        this.isCiscp = isCiscp;
    }

    @Basic
    @Column(name = "is_mifr", nullable = true)
    public Byte getIsMifr() {
        return isMifr;
    }

    public void setIsMifr(Byte isMifr) {
        this.isMifr = isMifr;
    }

    @Basic
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyboxPorts that = (CyboxPorts) o;
        return id == that.id &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(port, that.port) &&
                Objects.equals(portC, that.portC) &&
                Objects.equals(layer4Protocol, that.layer4Protocol) &&
                Objects.equals(layer4ProtocolC, that.layer4ProtocolC) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxHash, cyboxObjectId, port, portC, layer4Protocol, layer4ProtocolC, createdAt, updatedAt, guid, portionMarking, readOnly, isCiscp, isMifr, feeds);
    }
}
