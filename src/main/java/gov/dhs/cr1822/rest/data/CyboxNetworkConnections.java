package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_network_connections", schema = "example_database", catalog = "")
public class CyboxNetworkConnections {
    private int id;
    private String cyboxHash;
    private String cyboxObjectId;
    private String destSocketAddress;
    private Byte destSocketIsSpoofed;
    private String destSocketPort;
    private String oldDestSocketProtocol;
    private String sourceSocketAddress;
    private Byte sourceSocketIsSpoofed;
    private String sourceSocketPort;
    private String oldSourceSocketProtocol;
    private String guid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String destSocketHostname;
    private String sourceSocketHostname;
    private String layer3Protocol;
    private String layer4Protocol;
    private String layer7Protocol;
    private String portionMarking;
    private Byte readOnly;
    private String destSocketAddressC;
    private String destSocketPortC;
    private String sourceSocketAddressC;
    private String sourceSocketPortC;
    private String layer3ProtocolC;
    private String layer4ProtocolC;
    private String layer7ProtocolC;
    private String destSocketHostnameC;
    private String sourceSocketHostnameC;
    private String sourceSocketAddressId;
    private String destSocketAddressId;
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
    @Column(name = "dest_socket_address", nullable = true, length = 255)
    public String getDestSocketAddress() {
        return destSocketAddress;
    }

    public void setDestSocketAddress(String destSocketAddress) {
        this.destSocketAddress = destSocketAddress;
    }

    @Basic
    @Column(name = "dest_socket_is_spoofed", nullable = true)
    public Byte getDestSocketIsSpoofed() {
        return destSocketIsSpoofed;
    }

    public void setDestSocketIsSpoofed(Byte destSocketIsSpoofed) {
        this.destSocketIsSpoofed = destSocketIsSpoofed;
    }

    @Basic
    @Column(name = "dest_socket_port", nullable = true, length = 255)
    public String getDestSocketPort() {
        return destSocketPort;
    }

    public void setDestSocketPort(String destSocketPort) {
        this.destSocketPort = destSocketPort;
    }

    @Basic
    @Column(name = "old_dest_socket_protocol", nullable = true, length = 255)
    public String getOldDestSocketProtocol() {
        return oldDestSocketProtocol;
    }

    public void setOldDestSocketProtocol(String oldDestSocketProtocol) {
        this.oldDestSocketProtocol = oldDestSocketProtocol;
    }

    @Basic
    @Column(name = "source_socket_address", nullable = true, length = 255)
    public String getSourceSocketAddress() {
        return sourceSocketAddress;
    }

    public void setSourceSocketAddress(String sourceSocketAddress) {
        this.sourceSocketAddress = sourceSocketAddress;
    }

    @Basic
    @Column(name = "source_socket_is_spoofed", nullable = true)
    public Byte getSourceSocketIsSpoofed() {
        return sourceSocketIsSpoofed;
    }

    public void setSourceSocketIsSpoofed(Byte sourceSocketIsSpoofed) {
        this.sourceSocketIsSpoofed = sourceSocketIsSpoofed;
    }

    @Basic
    @Column(name = "source_socket_port", nullable = true, length = 255)
    public String getSourceSocketPort() {
        return sourceSocketPort;
    }

    public void setSourceSocketPort(String sourceSocketPort) {
        this.sourceSocketPort = sourceSocketPort;
    }

    @Basic
    @Column(name = "old_source_socket_protocol", nullable = true, length = 255)
    public String getOldSourceSocketProtocol() {
        return oldSourceSocketProtocol;
    }

    public void setOldSourceSocketProtocol(String oldSourceSocketProtocol) {
        this.oldSourceSocketProtocol = oldSourceSocketProtocol;
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
    @Column(name = "dest_socket_hostname", nullable = true, length = 255)
    public String getDestSocketHostname() {
        return destSocketHostname;
    }

    public void setDestSocketHostname(String destSocketHostname) {
        this.destSocketHostname = destSocketHostname;
    }

    @Basic
    @Column(name = "source_socket_hostname", nullable = true, length = 255)
    public String getSourceSocketHostname() {
        return sourceSocketHostname;
    }

    public void setSourceSocketHostname(String sourceSocketHostname) {
        this.sourceSocketHostname = sourceSocketHostname;
    }

    @Basic
    @Column(name = "layer3_protocol", nullable = true, length = 255)
    public String getLayer3Protocol() {
        return layer3Protocol;
    }

    public void setLayer3Protocol(String layer3Protocol) {
        this.layer3Protocol = layer3Protocol;
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
    @Column(name = "layer7_protocol", nullable = true, length = 255)
    public String getLayer7Protocol() {
        return layer7Protocol;
    }

    public void setLayer7Protocol(String layer7Protocol) {
        this.layer7Protocol = layer7Protocol;
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
    @Column(name = "dest_socket_address_c", nullable = true, length = 255)
    public String getDestSocketAddressC() {
        return destSocketAddressC;
    }

    public void setDestSocketAddressC(String destSocketAddressC) {
        this.destSocketAddressC = destSocketAddressC;
    }

    @Basic
    @Column(name = "dest_socket_port_c", nullable = true, length = 255)
    public String getDestSocketPortC() {
        return destSocketPortC;
    }

    public void setDestSocketPortC(String destSocketPortC) {
        this.destSocketPortC = destSocketPortC;
    }

    @Basic
    @Column(name = "source_socket_address_c", nullable = true, length = 255)
    public String getSourceSocketAddressC() {
        return sourceSocketAddressC;
    }

    public void setSourceSocketAddressC(String sourceSocketAddressC) {
        this.sourceSocketAddressC = sourceSocketAddressC;
    }

    @Basic
    @Column(name = "source_socket_port_c", nullable = true, length = 255)
    public String getSourceSocketPortC() {
        return sourceSocketPortC;
    }

    public void setSourceSocketPortC(String sourceSocketPortC) {
        this.sourceSocketPortC = sourceSocketPortC;
    }

    @Basic
    @Column(name = "layer3_protocol_c", nullable = true, length = 255)
    public String getLayer3ProtocolC() {
        return layer3ProtocolC;
    }

    public void setLayer3ProtocolC(String layer3ProtocolC) {
        this.layer3ProtocolC = layer3ProtocolC;
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
    @Column(name = "layer7_protocol_c", nullable = true, length = 255)
    public String getLayer7ProtocolC() {
        return layer7ProtocolC;
    }

    public void setLayer7ProtocolC(String layer7ProtocolC) {
        this.layer7ProtocolC = layer7ProtocolC;
    }

    @Basic
    @Column(name = "dest_socket_hostname_c", nullable = true, length = 255)
    public String getDestSocketHostnameC() {
        return destSocketHostnameC;
    }

    public void setDestSocketHostnameC(String destSocketHostnameC) {
        this.destSocketHostnameC = destSocketHostnameC;
    }

    @Basic
    @Column(name = "source_socket_hostname_c", nullable = true, length = 255)
    public String getSourceSocketHostnameC() {
        return sourceSocketHostnameC;
    }

    public void setSourceSocketHostnameC(String sourceSocketHostnameC) {
        this.sourceSocketHostnameC = sourceSocketHostnameC;
    }

    @Basic
    @Column(name = "source_socket_address_id", nullable = true, length = 255)
    public String getSourceSocketAddressId() {
        return sourceSocketAddressId;
    }

    public void setSourceSocketAddressId(String sourceSocketAddressId) {
        this.sourceSocketAddressId = sourceSocketAddressId;
    }

    @Basic
    @Column(name = "dest_socket_address_id", nullable = true, length = 255)
    public String getDestSocketAddressId() {
        return destSocketAddressId;
    }

    public void setDestSocketAddressId(String destSocketAddressId) {
        this.destSocketAddressId = destSocketAddressId;
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
        CyboxNetworkConnections that = (CyboxNetworkConnections) o;
        return id == that.id &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(destSocketAddress, that.destSocketAddress) &&
                Objects.equals(destSocketIsSpoofed, that.destSocketIsSpoofed) &&
                Objects.equals(destSocketPort, that.destSocketPort) &&
                Objects.equals(oldDestSocketProtocol, that.oldDestSocketProtocol) &&
                Objects.equals(sourceSocketAddress, that.sourceSocketAddress) &&
                Objects.equals(sourceSocketIsSpoofed, that.sourceSocketIsSpoofed) &&
                Objects.equals(sourceSocketPort, that.sourceSocketPort) &&
                Objects.equals(oldSourceSocketProtocol, that.oldSourceSocketProtocol) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(destSocketHostname, that.destSocketHostname) &&
                Objects.equals(sourceSocketHostname, that.sourceSocketHostname) &&
                Objects.equals(layer3Protocol, that.layer3Protocol) &&
                Objects.equals(layer4Protocol, that.layer4Protocol) &&
                Objects.equals(layer7Protocol, that.layer7Protocol) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(destSocketAddressC, that.destSocketAddressC) &&
                Objects.equals(destSocketPortC, that.destSocketPortC) &&
                Objects.equals(sourceSocketAddressC, that.sourceSocketAddressC) &&
                Objects.equals(sourceSocketPortC, that.sourceSocketPortC) &&
                Objects.equals(layer3ProtocolC, that.layer3ProtocolC) &&
                Objects.equals(layer4ProtocolC, that.layer4ProtocolC) &&
                Objects.equals(layer7ProtocolC, that.layer7ProtocolC) &&
                Objects.equals(destSocketHostnameC, that.destSocketHostnameC) &&
                Objects.equals(sourceSocketHostnameC, that.sourceSocketHostnameC) &&
                Objects.equals(sourceSocketAddressId, that.sourceSocketAddressId) &&
                Objects.equals(destSocketAddressId, that.destSocketAddressId) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxHash, cyboxObjectId, destSocketAddress, destSocketIsSpoofed, destSocketPort, oldDestSocketProtocol, sourceSocketAddress, sourceSocketIsSpoofed, sourceSocketPort, oldSourceSocketProtocol, guid, createdAt, updatedAt, destSocketHostname, sourceSocketHostname, layer3Protocol, layer4Protocol, layer7Protocol, portionMarking, readOnly, destSocketAddressC, destSocketPortC, sourceSocketAddressC, sourceSocketPortC, layer3ProtocolC, layer4ProtocolC, layer7ProtocolC, destSocketHostnameC, sourceSocketHostnameC, sourceSocketAddressId, destSocketAddressId, isCiscp, isMifr, feeds);
    }
}
